package chapter09.exam09;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class InputProps {

	public static void main(String[] args) throws IOException{
		
		// 1. 주스트림 생성
		FileInputStream file = new FileInputStream("src\\chapter09\\exam09\\setting.propeties");
		// 2. 보조스트림 생성
		BufferedInputStream bis = new BufferedInputStream(file);
		
		// 3. 파일읽기
		Properties prop = new Properties();
		prop.load(bis);
				
		
		// 3-1. 데이터 꺼내오기
		String id = (String) prop.get("id");
		String pass = prop.getProperty("pass");
		System.out.println(id + " / " + pass);	
		
		for(Object key : prop.keySet()) {
			System.out.println((String)key + " : " + prop.get(key));
		}
		
		// 4. 자원 반납
		bis.close();
	}

}
