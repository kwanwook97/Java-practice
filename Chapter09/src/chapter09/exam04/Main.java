package chapter09.exam04;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class Main {

	public static void main(String[] args) {

		// 1. 파일 위치 지정 + 객체화
		File src = new File("C:/img/img.gif");
		File dst = new File("C:/img/temp/img_copy.gif");
				
		// 2. 빨대 준비(읽기, 쓰기)
		try(
			FileInputStream fis = new FileInputStream(src);
			FileOutputStream fos = new FileOutputStream(dst);
		) {
			
			byte[] cup = new byte[1024];
			int i = 0;
			
			
			while (fis.read(cup) != -1) { // read(byte[]) 은 내가 얼마나 읽었는지만 알려준다.(1024|-1) 그래서 변수에 따로 담을 필요가 없다.
				fos.write(cup); // 떠온 컵의 내용을 여기에 담는다.
				i++;
				System.out.println("파일 복사중..."+i);
			}
			
			
			/* 3. 읽어오기
			int data;
			while ((data=fis.read()) != -1) {	// 티 스푼으로 하나씩 물을 퍼나르는 것과 같다.
				fos.write(data);// 4. 내보내기
				i++;
				System.out.println("파일 복사중..."+i);
			}
			*/
			// 5. 다 나갔는지 확인
			fos.flush();
			// 6. 자원 반납
			
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
