package chapter05.ex01;

public class Person extends Mammal {

	public Person(String name){
		super(name);
	}
	
	// name�� �θ����� �Ѿ���� �θ� ��ӹ޾ұ⿡
	// �ڽ����忡���� ������ ���� name�� ���� �ִ� ��ó�� ����Ѵ�.
	public void useTool() {
		System.out.println(name + "�� ������ ����Ѵ�.");
	}
	
	public void social() {
		System.out.println(name + "�� ��ȸ��Ȱ�� �Ѵ�.");
	}
	
	public void talk() {
		System.out.println(name + "�� �̾߱⸦ �Ѵ�.");
	}
}
