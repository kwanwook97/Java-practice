package chapter11.exam06;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class WebServer {

	public static void main(String[] args) throws IOException {
		// 1. 스레드 풀 생성
		int n = Runtime.getRuntime().availableProcessors();
		ExecutorService pool = Executors.newFixedThreadPool(n);
		
		// 2. 서버소켓 생성
		ServerSocket server = new ServerSocket(8080);
		
		// 3. 요청대기
		while (true) {
			System.out.println("접속요청 대기");
 			Socket socket = server.accept();
 			System.out.println("접속 완료");
 			
 			// 스레드가 할 일(pool에 대여요청)
 			Runnable run = new Runnable() {
				
				@Override
				public void run() {
					try {
						// 주 스트림 + 보조 스트림					
						DataInputStream dis = new DataInputStream(socket.getInputStream());
						DataOutputStream dos = new DataOutputStream(socket.getOutputStream());
						
						// http프로토콜에 의하면 최대 65536 byte를 넘지못하게 되어있다.						
						byte[] arr = new byte[65536];
						dis.read(arr);
						// byte배열 => String으로 바꾼다.
						String request = new String(arr);
						System.out.println(request); // 브라우저가 뭐라고 했을까?
						// http프로토콜로 부터 응답받은 메세지를 받는다.
						
						// 응답(response) : 응답이 없으면 브라우저는 계속 기다린다.
						PrintStream ps = new PrintStream(socket.getOutputStream()); 
						// 헤더 : 통신하는 당사자들끼리만 보인다.
						ps.print("HTTP/1.1/200\r\n");
						ps.print("Content-type : text/html \r\n");						
						// 바디 : 헤더와 바디는 구분이 필요한데 보통 공백줄로 구분한다.
						ps.print("\r\n");
						ps.print("<h3>Success Receive</h3>");
						ps.flush();
						// 자원반납
						dis.close();
						dos.close();						
						ps.close();
						socket.close(); 						
						
					} catch (Exception e) {
						e.printStackTrace();
					}
					
				}
			};
			
			// 반환 값이 없는 Runnable은 execute로 실행!
			pool.execute(run);
 			
			
		}

	}

}
