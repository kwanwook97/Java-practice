package chapter09.exam09;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class OutputProps {

	public static void main(String[] args) throws IOException {
		
		// 1. 주스트림 + 보조스트림 준비
		FileOutputStream fos = new FileOutputStream("src\\chapter09\\exam09\\setting.propeties");
		BufferedOutputStream bos = new BufferedOutputStream(fos);
		
		// 1-1. Properties 객체생성
		Properties prop = new Properties();
		
		// 1-2. 데이터 추가
		prop.put("id", "admin");
		prop.put("pass", "1234");
		prop.put("name", "kim, ji-hoon");
		prop.put("phone", "01012341234");
		prop.put("email", "admin@email.com");
		
		// 2. 내보내기
		prop.store(bos, "simple comment");
		System.out.println("저장완료");
		
		// 3. flush, 자원 반납
		bos.close();

	}

}
