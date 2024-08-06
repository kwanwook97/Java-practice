package chapter09.exam06;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class BufferNotUse {

	public static void main(String[] args) throws Exception {
		
		// 1. 데이터 위치 지정 + 빨대 준비
		TimeChecker cheker = new TimeChecker();
		FileInputStream fis = new FileInputStream("C:/img/img.gif");
		FileOutputStream fos = new FileOutputStream("C:/img/temp/img1.gif");
		
		// 2. 읽고 -> 쓰기
		cheker.timeStart();
		int data;		
		while ((data = fis.read()) != -1) {
			fos.write(data);
		}		
		System.out.println("버퍼 미사용 시 : "+cheker.timeEnd()+" ms"); 
		
		// 3. 내보내고 반납
		fos.flush();
		fos.close();
		fis.close();

	}

}