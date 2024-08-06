package chapter09.exam06;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class BufferUse {

	public static void main(String[] args) throws Exception {
		
		// 파일복사 시간을 알아내기 위해 TimeChecker객체를 생성한다.
		TimeChecker cheker = new TimeChecker();
		
		// 주스트림 준비	
		FileInputStream fis = new FileInputStream("C:/img/img.gif");
		FileOutputStream fos = new FileOutputStream("C:/img/temp/img1.gif");
		
		// 전송할 때 시간단축을 위해 주스트림인 'FileStream'를 보조스트림인 'BufferedStream'에 담아준다.
		// 8192byte로 나눠서 고속전송을 하기 때문에 속도가 빠르다. (8192byte 용량이 다 차면 보내는 것이다.)
		BufferedInputStream bis = new BufferedInputStream(fis); 
		BufferedOutputStream bos = new BufferedOutputStream(fos);
				
		// 파일복사 시작시간을 가져온다.
		cheker.timeStart();
		
		// 입력스트림에서 읽어온 Binary값을 정수형으로 받아주기 위해 정수형변수를 선언한다. 
		int data;		 
		
		// 입력스트림으로부터 읽은 값의 길이를 알 수 없기 때문에 While문을 사용하여 읽은 데이터를 새로운 파일에 복사한다.		
		// 더이상 읽을 값이 없다면 -1을 반환하여, 반복문을 빠져나오게된다.		
		while ((data = bis.read()) != -1) {
			bos.write(data);     // 입력스트림으로 부터 읽어온 값을 복사한다.
		}
		
		// 파일복사에 걸린시간을 출력한다.
		System.out.println("버퍼 미사용 시 : "+cheker.timeEnd()+" ms"); 
				 
		bos.flush(); // 출력의 경우 값을 close뿐만아니라 버퍼에 남아있는 데이터들을 모두 출력시켜주기 위해 flush사용.
		bos.close(); // 사용한 자원을 닫아서 자원을 관리해준다.
		bis.close();

	}
}