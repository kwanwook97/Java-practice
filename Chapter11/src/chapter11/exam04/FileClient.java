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

// java chapter11.exam04.FileClient
public class FileClient {

	public static void main(String[] args) throws UnknownHostException, IOException {
		
		// 1. 소켓 준비
		Socket socket = new Socket("localhost", 5001); // 192.168.70.135
		// 2. 예외가 발생하지 않았으면 접속성공
		System.out.println("접속완료");
		
		// 3. 소켓을 통한 통신준비					
		// 3-1. FileInputStream 준비
		File file = new File("C:\\img\\temp\\img1234.gif");
		FileInputStream fis = new FileInputStream(file);
		
		// 3-2. 보조스트림 준비
		BufferedInputStream bis = new BufferedInputStream(fis);		
		
		// 3-3. 소켓에서 내보낼 주 스트림 준비
		OutputStream os = socket.getOutputStream();
		
		// 3-4. 보조스트림 준비
		BufferedOutputStream bos = new BufferedOutputStream(os);
				
		// Thread사용?
		// 3-5. 읽어온 바이너리 데이터 전송		
		byte[] arr = new byte[(int) file.length()];  // file객체의 length메소드로 파일의 크기를 알아낸다.
		bis.read(arr);
		String fileName = file.getName();            // file객체의 getName메소드로 파일의 이름을 가져온다.

		// 문자열, 바이너리를 보낸다.
		// 이대로 보내면, 어떤것이 문자열이고 어떤 것이 바이너리인지 모른다. 받을 때도 바이트로 받기 때문에 구분을 하지못함.
		// 따라서, 먼저 문자열을 보낸다.
		// 그 후 바이너리배열을 쭉 보낸다.
		DataOutputStream dos = new DataOutputStream(bos);
		dos.writeUTF(fileName);
		dos.write(arr);
		// 3-6. flush()
		dos.flush();
		System.out.println("전송완료, 전송된 파일 사이즈 : " + (file.length()/1024/1024) + "MB");
		// 4. 자원반납
		bis.close();
		dos.close();
		socket.close();

	}

}
