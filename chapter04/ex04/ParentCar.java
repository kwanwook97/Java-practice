package chapter04.ex04;

public class ParentCar {

	public void start(){
		System.out.println("�õ��� �Ǵ�.");
	}
	
	public int run(){
		return 60;
	}
	
	public void stop(){
		System.out.println("���� �����Ѵ�.");
	}
	
	// final == read only
	// finalŰ���尡 ���� �޼���� Override�� �Ұ��ϴ�.
	// �б� �����ε� ������ ������ �� ����.
	public final void test() {
		System.out.println("��������");
	}
}
