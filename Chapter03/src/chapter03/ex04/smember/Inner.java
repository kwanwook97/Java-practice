package chapter03.ex04.smember;

public class Inner {

	// static member
	public static void main(String[] args) {
		
		st_msg("hello static member");      // ���������� ��������� ���ϰ� �θ� �� �ִ�.
		
		// ������ �ٸ� ���
		// �Ϲݸ���� �ٸ� Ŭ�������� �θ� ��ó�� ��üȭ�� �� �ҷ����Ѵ�.
		Inner i = new Inner();
		i.h_msg("hello member");
		
	}
	
	static void st_msg(String msg) {
		System.out.println("static ��� �޼��� : " + msg);
	}
	
	void h_msg(String msg) {
		// �Ϲݿ������� static������ ����� �θ� ��
		// ���� Ŭ������� �ϴ��� ������ ������ �θ��� ��ó�� ����ؾ� �Ѵ�.
		Inner.st_msg("Helo2");
		System.out.println("�Ϲ� ��� �޼��� : " + msg);
		
	}
}
