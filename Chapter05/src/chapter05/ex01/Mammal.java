package chapter05.ex01;

public abstract class Mammal {
	public String name = "";
	
	public Mammal(String name) { // Mammal�� ��üȭ�� �ݵ�� �̸��� �־���� �Ѵ�.
		this.name = name;
	}
	
	public void birth() {
		System.out.println(name + "�� ������ ����.");
	}
	
	public void eat() {
		System.out.println(name + "�� ���� �Դ´�.");
	}
	
}
