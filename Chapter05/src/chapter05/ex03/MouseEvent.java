package chapter05.ex03;

public interface MouseEvent {
	
	// interface������ �⺻�� �߻� �޼����̴�.
	public abstract void click(int i);
	public abstract void dblClick(int i);
	public abstract double[] move();
	
	// default�޼��� - Java 8(1.8)���� ����.
	// default : ���� ��Ű������ ��밡��.
	public default void wheel(int i) {
		if(i==1) {
			System.out.println("���������� ��ũ��");
		}else {
			System.out.println("�Ʒ��������� ��ũ��");
		}
	}
	
	// static�޼��� - Java 8���� ����.
	public static void setDpi(int dpi) {
		System.out.println("���� ���� : " + dpi);
	}
	
}
