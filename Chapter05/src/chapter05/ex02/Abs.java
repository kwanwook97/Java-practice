package chapter05.ex02;

public abstract class Abs {
	
	// �Ϲ� �޼���
	public void parent() {
		System.out.println("�׳� ���ų� �������̵� �ص� �Ǵ� �޼���");
	}
	
	// �߻� �޼���(��ü�� ���� �޼���)
	// �ڽ��� �� �������̵� �ؾ��ϴ� �޼���. - ���� �������̵� 
	public abstract void must1();
	public abstract void must2();
	
}
