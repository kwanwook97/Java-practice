package chapter05.ex03;

public class Mac implements MouseEvent {

	@Override
	public void click(int btn) {
		System.out.println("��ư�� Ŭ�� �Ѵ�.");

	}

	@Override
	public void dblClick(int btn) {
		System.out.println("��ư�� ����Ŭ�� �Ѵ�.");

	}

	@Override
	public double[] move() {
		return null;
		
	}

}
