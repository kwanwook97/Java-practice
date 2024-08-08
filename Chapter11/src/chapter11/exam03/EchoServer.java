package chapter11.exam03;

import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class EchoServer {

	public static void main(String[] args) throws IOException {
		
		ServerSocket server = null;
		
		try {
			// 1. 서버소켓 생성(포트 개방)
			server = new ServerSocket(5001);
			
			while(true) {
				System.out.println("요청 대기중..."); // 2. 클라이언트 요청대기				
				Socket socket = server.accept(); // 3. 요청이 올경우 수락								
				// socket을 통해 통신진행.
				// 1. 주 스트림 준비(Socket으로 부터)
				InputStream is = socket.getInputStream();
				// 2. 보조 스트림 준비
				ObjectInputStream ois = new ObjectInputStream(is);
				// 3. 데이터 읽기(출력)
				String msg = ois.readUTF();
				System.out.println("[client 메시지] " + msg);
				
				OutputStream os = socket.getOutputStream();
				ObjectOutputStream oos = new ObjectOutputStream(os);
				oos.writeUTF(msg); // 받은 메시지를 그대로 돌려줌.
				oos.flush();
				
				// 4. 자원반납
				ois.close();
				oos.close();
				
			}
		} catch (Exception e) {
			// 4. 예외발생시 서버종료
			server.close();
			System.out.println("서버를 종료시킵니다.");
		}
		
	}

}
