package chapter03.ex09.imp;

import chapter03.ex08.over.Calculator;

public class Main {

	public static void main(String[] args) {

		// ���� ��Ű�������� import���� ������� �ʾƵ� �ȴ�.
		Info info = new Info();
		System.out.println(info.age);
		System.out.println(info.job);
		
		// �ٸ� ��Ű���� ��쿡�� import���� ����Ͽ� �ҷ��;��Ѵ�. 
		// �ҷ��� �޼���� publicŰ���尡 �־�� �ҷ��� �� �ִ�.
		Calculator cal = new Calculator();
		System.out.println(cal.plus(1, 2));
		
		/* 
			[ĸ��ȭ]
			public : �������
			protected : ���� ��Ű�������� ���� ���.
			default : ���� ��Ű�������� ���� ���.
			private : ���� Ŭ���������� ���� ���.
		*/
		
		
	}

}
