package chapter11.exam04;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.DataInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class FileServer {

	public static void main(String[] args) throws IOException {
		ServerSocket server = null;
		
		// 1. 서버소켓 생성		
		try {
			server = new ServerSocket(5001);
			
			while (true) { // 2. 요청대기				
				System.out.println("요청 대기중...");
				// 3. 요청수락
				Socket socket = server.accept(); 
				
				Thread thread = new Thread() {

					@Override
					public void run() {
						
						try {							
							// 4-1. 주스트림 준비
							InputStream is = socket.getInputStream();
							
							// 4-2. 보조스트림 준비
							BufferedInputStream bis = new BufferedInputStream(is);
							DataInputStream dis = new DataInputStream(bis);
							
							// 4-3. 읽기(파일명, 바이너리)
							String fileName =  dis.readUTF();
							
							// 4-4. 파일스트림 준비 + 보조스트림 준비
							FileOutputStream fos = new FileOutputStream("C:\\Users\\GOODEE\\Downloads\\" + fileName);
							BufferedOutputStream bos = new BufferedOutputStream(fos);
														
							// Thread사용?
							// 바이너리를 읽어올 때는 상대방이 배열로 보내왔다 하더라도 하나하나 읽어주는 것이 안전.
							int data;
							System.out.println("파일 수신중...");
							while ((data = dis.read()) != -1) {
								bos.write(data);
							}				
							
							// 4-5. flush()
							bos.flush();
							System.out.println("다운로드 완료");
							// 5. 자원반납
							dis.close();
							bos.close();
							socket.close();
						} catch (Exception e) {
							e.printStackTrace();
						}					
					}					
				};
				thread.start();
				
			}
			
		} catch (Exception e) {
			server.close();
			System.out.println("서버를 종료시킵니다.");
		}
	}
}
