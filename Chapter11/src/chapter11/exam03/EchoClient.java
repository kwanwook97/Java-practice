package chapter11.exam03;

import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.net.UnknownHostException;

// chapter11.exam03.EchoClient
public class EchoClient {

	public static void main(String[] args) throws UnknownHostException, IOException {
		
		// 1. 소켓생성(IP, Port지정)
		Socket socket = new Socket("localhost", 5001); // 192.168.70.113
		// 2. 예외가 발생하지 않으면, 연결완료
		System.out.println("접속 완료");
		
		// socket을 통해 통신진행
		// 1. 내보낼 파일지정 + 주스트림 준비. (Socket으로 부터 가져온다.)
		OutputStream os = socket.getOutputStream();
		// 2. 보조스트림 준비. (속도 개선을 위해 주 스트림을 담아준다.)
		ObjectOutputStream oos = new ObjectOutputStream(os);
		// 3. 데이터 쓰기
		oos.writeUTF("Hello Server");
		// 4. flush 
		oos.flush();
		
		// 데이터 받기
		InputStream is = socket.getInputStream();		
		ObjectInputStream ois = new ObjectInputStream(is);
		String msg = ois.readUTF();
		System.out.println("[server 메시지] " + msg);
				
		// 5. 자원정리
		oos.close();
		ois.close();
		// 6. 접속종료
		socket.close();

	}

}
