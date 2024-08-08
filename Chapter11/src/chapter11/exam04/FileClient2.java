package chapter11.exam04;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;
import java.net.UnknownHostException;

public class FileClient2 {

	public static void main(String[] args) throws UnknownHostException, IOException {
		// 1. 소켓생성
		Socket socket = new Socket("localhost", 5001);
		
		// 2. 예외가 발생하지 않았으면 접속성공
		System.out.println("접속완료");
		
		// 2. 내 pc의 파일을 읽어온다.
		File file = new File("C:\\img\\temp\\img1.gif");
		// 2-1. 주스트림
		FileInputStream fis = new FileInputStream(file);
		// 2-2. 보조스트림
		BufferedInputStream bis = new BufferedInputStream(fis);
		
		// 3. 소켓을 스트림에 담아준다.
		// 3-1. 주스트림
		OutputStream os = socket.getOutputStream();
		// 3-2. 보조스트림 
		BufferedOutputStream bos = new BufferedOutputStream(os);
		// 3-3. 보조스트림 - 데이터스트림사용.
		DataOutputStream dos = new DataOutputStream(bos);
					
		// 4. 데이터스트림에 데이터 넣어주기 
		// 4-1. 내PC에서 읽어온파일의 이름, 길이를 가져온다.
		byte[] arr = new byte[(int) file.length()];
		bis.read(arr);
		
		dos.writeUTF(file.getName());
		dos.write(arr);
		
		// 5. flush처리
		dos.flush();
		System.out.println("전송할 파일의 사이즈는 " + (file.length()/1024/1024) + "MB");
		
		// 6. 자원반납
		bis.close();
		dos.close();
		socket.close();
		
	}

}
