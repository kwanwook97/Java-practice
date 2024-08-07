package chapter11.exam02;

import java.net.Socket;

public class Client {
	
	// 프로젝트 폴더/bin 들어가기 -> 탐색기 창에서 cmd입력(해당위치에서 커맨드 창 켜짐)
	// java [패키지.클래스명]
	// java chapter11.exam02.Client
	public static void main(String[] args) throws Exception {
		
		// 1. 어디로 가고 싶은지 지정해서 소켓생성.
		Socket socket = new Socket("localhost", 5001); // 192.168.70.113
		// Server와 Client가 같은 컴퓨터안에 있다면, localhost로 써도 된다.
		
		// 2. 예외가 발생하지 않으면 접속종료.
		System.out.println("접속완료");
		//접속에 성공했으면, 서버의 정보가 소켓에 담기게된다.
		
		// 3. 할일이 있으면 하고, 없으면 그냥 종료.(자원반납)
		System.out.println("할거 없으니 종료");
		socket.close();
		
		// 이클립스는 2개의 프로그램을 동시에 돌릴 수 없으므로, 한개는 이클립스로, 한개는 cmd로 실행하기.
	}

}
