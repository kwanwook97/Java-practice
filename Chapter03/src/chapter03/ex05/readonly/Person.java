package chapter03.ex05.readonly;

public class Person {

	final String nation;
	static final String ssn = "991231-1234567";     // ����� ������ �ǵ帱 �� ���� ������ �ݵ�� ���� �ʱ�ȭ�� ����� �Ѵ�.
	final String name;
	
	// �Ϲ� final�� �����ڿ��� �ʱ�ȭ �Ѵ�.
	// static final�� �����ڿ����� �ʱ�ȭ�� �� ���� '�Һ��� ��'�̴�.
	public Person(String nation, String name) {
		this.nation = nation;
		this.name = name;
		
	}
	
}
