package chapter04.ex01;

public class Main {

	public static void main(String[] args) {
		
		// Person�� ��üȭ������
		// Mamal�� ��ɵ� ��밡���ϴ�.
		Person p = new Person();
		p.birth(); // Mamal
		p.eat();   // Mamal
		
		p.useTool(); // Person
		p.social();  // Person
		p.talk();    // Person
	}

}
