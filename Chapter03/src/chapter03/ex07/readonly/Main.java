package chapter03.ex07.readonly;

public class Main {

	public static void main(String[] args) {
		Person p = new Person("KOREA", "������");
		
		// final�� read only�̹Ƿ� �����ڿ��� �ʱ�ȭ �� ���� ������ �� ����.
//		p.name = "kwanwook";
//		p.nation = "�ѱ�";		
		
		System.out.println(p.name);
		System.out.println(p.nation);
		System.out.println(Person.ssn);      

	}

}
