package chapter07.ex03;

public class Sub {
	
	// main���� ������ ������.
	void method1() throws Exception{
		method2(); // �޼ҵ� 2���� ������Ų��.
	}
	
	// method1���� ������ ������.
	void method2() throws NumberFormatException{
		// ȥ�� ���� ó���Ѵ�.
		Integer.parseInt("a1234"); // ó���ϴٰ� �����߻�.
	}
}
