package chapter04.ex03;

public class Main {

	public static void main(String[] args) {
		
		/* ����� ���忡���� ����ϰ� ���� �޼��忡 ���� ���� ��üȭ�ؾ��Ѵ�.
		
		// plus
		Operator1 o1 = new Operator1();
		int plus = o1.plus(4, 3);
		System.out.println(plus);
		
		// minus
		Operator2 o2 = new Operator2();
		int minus = o2.minus(4, 3);
		System.out.println(minus);
		
		// multi
		Operator3 o3 = new Operator3();
		int multi = o3.multi(3, 2);
		System.out.println(multi);
		
		// devide
		Operator4 o4 = new Operator4();
		int devide = o4.devide(8, 4);
		System.out.println(devide);
		*/
		
		// ����� ������ ����� ���忡���� Operator1�ϳ��� ��üȭ�ص� ���� �޼��带 ����� �� �ִ�.
		Operator1 op = new Operator1();
		System.out.println(op.plus(4,3));
		System.out.println(op.minus(4,3));
		System.out.println(op.multi(3,2));
		System.out.println(op.devide(8,4));
	
	}

}
