package chapter03.ex02.init;

public class Puppy {
	// �� ��ü�� ����� ������ �̸��� ������ �����ȴ�.
	public String name;
	public String goal;
	public int age;
	
	public Puppy(String name, String goal) {        // 1. �̸��� ������ �޾ƿ�����, �����ڰ� ���ǰ��� ���� �������.
		// �׷��� �޾ƿ� name�� ���⿡ �ִ� name�� �־��ش�.
		this.name = name;
		this.goal = goal;
		System.out.println("�̸��� " + name + "�̰�, ������ " + goal + "�Դϴ�.");
	}
	
	// Overrode : ���� �̸����� �������� ���� �� �ֵ��� ����ϴ� ��.
	// ���� : �Ű������� ������ ������Ÿ���� �޶���Ѵ�.
	public Puppy(String name) {
		this.name = name;
		System.out.println(name);
	}
	
	// �Ű������� ������ �ٸ��Ƿ� ���� �̸����� ��������.
	public Puppy() {
		this.age = age;
	}
	
	// �Ű������� ������ ������ ������ Ÿ���� �޶� �����̸����� ��������.
	public Puppy(int age) {
		this.age = age;
	}
	
}
