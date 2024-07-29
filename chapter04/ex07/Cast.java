package chapter04.ex07;

public class Cast {

	public static void main(String[] args) {
		Mammal m = new Mammal();
		Mammal c = new Cat();
		Mammal d = new Dog();
		
		Mammal mal = null;
		
		// �θ����·� ������ ����ȯ(������)�ϸ�
		mal = new Dog();
		mal.birth();
		mal.eat();
		// mal.bark();    // ���� ����Ư��(�ڱ� �޼���)�� ����� �� ����.
		
		// ���� ����Ư���� �츮��ʹٸ�?
		// ���� Ư��(��)���� �ǵ��� �����Ѵ�.
		// �̰��� ���������ȯ(Casting)�̶�� �Ѵ�.
		Dog dog = (Dog)mal;     
		dog.bark();
		
		/* ĳ���ý� ������ ������ �ƴ� ���·� ���ư������ϸ�
		ClassCastException�� ������ �ȴ�.
		Cat cat = (Cat)mal;
		cat.mew();
		*/
		
		// ��ӹ��� �ڽİ�ü�� ĳ���ý� �򰥸��� ��찡 ����.
		// �̷���� �Ʒ��� ���� Ȯ�� �����ϴ�.
		if(mal instanceof Cat) { // ������ Ȯ���ϴ� Ű����
			Cat cat = (Cat)mal;
		}else {
			System.out.println("�� �߸� ã�� ���̾��.");
		}
		
	}

}
