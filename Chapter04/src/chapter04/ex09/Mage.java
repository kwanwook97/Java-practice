package chapter04.ex09;

public class Mage {

	public static void main(String[] args) {
		
		// �������� Ȱ���Ͽ� �ϳ��� ������ ���� ������ ������ �� �־���.
		// �����߰��ÿ��� ��������� ���� �ڵ带 ����ߴ�.
		Spell sp = null;
		sp = new Ice();
		System.out.println(sp.casting());
		
		sp = new Fire();
		System.out.println(sp.casting());
		
		sp = new Light();
		System.out.println(sp.casting());

	}

}
