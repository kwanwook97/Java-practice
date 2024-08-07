package chapter11.exam02;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;

// Server는 항상 먼저 켜져있어야 한다.
public class Server {

	public static void main(String[] args) throws IOException {
		 
		ServerSocket server = null;
		
		try {
			// 1. 서버소켓 생성 + 특정 IP를 열어준다.(생략하면 본인의 IP를 열어준다.)
			server = new ServerSocket(5001);     // 5001번 Port를 열어준다. 5000번은 다른 프로그램이 잘 사용함.
			// 2. 손님올 때까지 대기		
			while (true) {
				System.out.println("손님 기다리는 중...");
				// 3. 요청이 오면 수락(문 열어달라고하면 열어준다.)
				Socket socket = server.accept();  // 클라이언트의 소켓을 받게된다.
				// accept()로 인해 Blocking되어 클라이언트의 소켓을 받을 때까지 정지 시켜놓는다.
				// Socket에는 접속요청자의 모든 정보를 가지고 있다.
				// 어떤 IP의 어느방에 있는 녀석이 들어온다고 했나?
				InetSocketAddress addr = (InetSocketAddress) socket.getRemoteSocketAddress();
				System.out.println(addr.getAddress() + " : " + addr.getPort());
			}			
			
		} catch (Exception e) {
			// 4. 자원반납 (특수한 상황에서만 일어난다.)
			server.close();
		}
		
	}
}
