package chapter03.ex08.over;

public class Main {

	public static void main(String[] args) {
		
		Calculator cal = new Calculator();
		
		// �����ε带 ����ϸ� �׳� plus �޼��� �ȿ� �ְ� ���� ���� ������ �ȴ�.
		// �����Ǵ� �޼��尡 ������ ������ �ǰ�, ������ ������
		System.out.println(cal.plus(1, 0.005));
		System.out.println(cal.plus("A", 0.0003));


	}

}
