package chapter03.ex04.smember;

public class Inner {

	// static member
	public static void main(String[] args) {
		
		st_msg("hello static member");      // 같은영역의 멤버끼리는 편하게 부를 수 있다.
		
		// 영역이 다를 경우
		// 일반멤버는 다른 클래스에서 부를 때처럼 객체화한 후 불러야한다.
		Inner i = new Inner();
		i.h_msg("hello member");
		
	}
	
	static void st_msg(String msg) {
		System.out.println("static 멤버 메서드 : " + msg);
	}
	
	void h_msg(String msg) {
		// 일반영역에서 static영역의 멤버를 부를 때
		// 같은 클래스라고 하더라도 원래의 영역을 부르는 것처럼 사용해야 한다.
		Inner.st_msg("Helo2");
		System.out.println("일반 멤버 메서드 : " + msg);
		
	}
}
