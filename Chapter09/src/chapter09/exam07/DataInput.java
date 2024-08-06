package chapter09.exam07;

import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.FileInputStream;

public class DataInput {

	public static void main(String[] args) throws Exception{
		
//		[Input]
//		1. 내보낼 파일위치 설정
//		2. Input Stream준비		
		FileInputStream fis = new FileInputStream("C:\\img\\temp\\data.dat");
//		3. 보조 버퍼추가(Data, Buffer)		
		BufferedInputStream bis = new BufferedInputStream(fis);		
		DataInputStream dis = new DataInputStream(bis);		
		
//		4. 데이터 읽고 출력하기
		// 문자열
		// 정수
		// boolean
		String name = dis.readUTF();               // 문자열
		int salary = dis.readInt();                // 정수
		boolean promotion = dis.readBoolean();     // boolean
				
		System.out.println(name + " / " + salary + " / " + promotion);
		
//		5. 사용한 자원 닫기		
		dis.close();
	}

}
