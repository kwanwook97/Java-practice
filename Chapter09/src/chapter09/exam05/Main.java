package chapter09.exam05;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException {
		
		// 사용자가 입력한 내용을 c:/img/temp/sample.txt 에 저장
		
		// 1. 내보낼 파일 위치 설정 및 객체화 + 2. 내보낼 빨대 준비
		FileWriter writer = new FileWriter("c:/img/temp/sample.txt",true);
				
		// 3. 스캐너 준비
		Scanner scan = new Scanner(System.in);
		System.out.print("입력 > ");
		
		// 4. 스캐너로 부터 입력 받기 + 5. 입력 받은 내용 내보내기
		writer.write(scan.nextLine()+"\r\n");// new line
		
		// 6. 확실히 내보내고, 자원 반납
		writer.flush();
		writer.close();
		scan.close();
		
	}

}
