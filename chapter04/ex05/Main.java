package chapter04.ex05;

public class Main {

	public static void main(String[] args) {
		// 1. �ڽĵ��� ���� ��üȭ �Ͽ� useRoom �޼��� ���.
		Child child = new Child();
		child.useRoom();
		
		ChildOne child1 = new ChildOne();
		child1.useRoom();
		
		ChildTwo child2 = new ChildTwo();
		child2.useRoom();
		
		ChildThree child3 = new ChildThree();
		child3.useRoom();
		
		System.out.println();
		// ��ü�� 4���� �ƴ϶� 30~40����� ������ 30~40�� ������ ����������Ѵ�.
		// �������� Ȱ���ϸ�, �ϳ��� ������ �����ϰ� ������ü�� ����� �� �ִ�.
		
		ParentHouse house;    // �θ������� �����ϳ�
		
		house = new Child();
		house.useRoom();
		
		house = new ChildOne();
		house.useRoom();
		
		house = new ChildTwo();
		house.useRoom();
		
		house = new ChildThree();
		house.useRoom();
		
		
	}
}

