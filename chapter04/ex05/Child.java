package chapter04.ex05;

// �ϳ��� �ڹ����Ͽ��� �Ѱ� �̻��� Ŭ������ ������ �� �ִ�.
// public class�� ���ϸ�� ������ Ŭ������ ��밡���ϴ�.
public class Child extends ParentHouse {

	public Child() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void useRoom() {
		System.out.println("ù°�� ���� ����Ѵ�.");
	}
}


class ChildOne extends ParentHouse {

	public ChildOne() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void useRoom() {
		System.out.println("��°�� ���� ����Ѵ�.");
	}
}

class ChildTwo extends ParentHouse {

	public ChildTwo() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void useRoom() {
		System.out.println("��°�� ���� ����Ѵ�.");
	}
}

class ChildThree extends ParentHouse {

	public ChildThree() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void useRoom() {
		System.out.println("��°�� ���� ����Ѵ�.");
	}
}