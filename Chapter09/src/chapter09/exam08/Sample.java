package chapter09.exam08;

import java.io.Serializable;

// 직렬화 역직렬화 간에 규격을 잡아줘야 하므로 Serializable 인터페이스가 필요하다.
public class Sample implements Serializable {
	
	// 네트워크에서 돌아다니는 객체들을 구분하기 위한 아이디를 지정하도록 권장한다.
	private static final long serialVersionUID = 1L;
	
	int num = 11;
	String team = "Edu";
	String job = "manager";
	
	public String method() {
		return "메서드 호출완료!!";
	}
	
}
