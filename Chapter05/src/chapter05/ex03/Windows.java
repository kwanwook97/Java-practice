package chapter05.ex03;

// interface�� ���(extends)�̾ƴ� ����(implements)�� �޴´�.
public class Windows implements MouseEvent, KeyEvent {
	
	// MouseEvent�� ���� ���� �������̵� �� �޼����.
	@Override
	public void click(int btn) {
		System.out.println(btn + "�� ��ư Ŭ��");

	}

	@Override
	public void dblClick(int btn) {
		System.out.println(btn + "�� ��ư ����Ŭ��");

	}

	@Override
	public double[] move() {
		
		return null;
	}

	// KeyEvent�� ���� ���� �������̵� �� �޼����.
	@Override
	public void keyDown(int key) {
		System.out.println(key + "�� Ű�� ������.");
		
	}

	@Override
	public void keyUp(int key) {
		System.out.println(key + "�� Ű�� ����.");
		
	}
	
	
}
