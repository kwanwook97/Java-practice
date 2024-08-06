package chapter09.exam03;

import java.io.File;
import java.io.FileReader;

public class InputMain {

	public static void main(String[] args) {
		
		// 1. 읽어올 경로 지정 + 2. 파일 객체 생성
		File file = new File("C:/img/temp/test.txt");
		
		
		try (FileReader reader = new FileReader(file);){// 3. 사용할 빨대 선택			
			// 4. 읽어오기			
			int data;			
			while ((data = reader.read()) != -1) { // -1 : EOF(End Of File : 더 이상 읽을 게 없다.)
				System.out.print((char)data);
			}
			
			// 5. 사용한 자원 닫기 - 자원 닫아 주기 귀찮다면 try with resource 를 사용하면 된다.
			// reader.close();			
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}