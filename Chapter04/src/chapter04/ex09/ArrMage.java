package chapter04.ex09;

public class ArrMage {

	public static void main(String[] args) {
		
		// �������� �̿��ϸ� �Ʒ��� ���� �迭���� Ȱ���� �� �����ϴ�.
		// �Ϲ����� ����(�ʵ�)�� Ȱ���ϹǷ� �ʵ�������̶�� �Ѵ�.
		Spell[] sp = new Spell[3];
		
		sp[0] = new Fire();
		sp[1] = new Ice();
		sp[2] = new Light();
		
		for(int i=0; i<sp.length; i++) {
			System.out.println(sp[i].casting());
			
		}
	}

}
