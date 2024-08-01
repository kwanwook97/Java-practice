package chapter07.ex03;

public class Sub {
	
	// main에게 문제를 던진다.
	void method1() throws Exception{
		method2(); // 메소드 2에게 일을시킨다.
	}
	
	// method1에게 문제를 던진다.
	void method2() throws NumberFormatException{
		// 혼자 일을 처리한다.
		Integer.parseInt("a1234"); // 처리하다가 문제발생.
	}
}
