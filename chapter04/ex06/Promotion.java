package chapter04.ex06;

/*
			Vertbrate
			/       \
		Birds        Mamal
		/   \        /   \
	Duck  Chicken  Dog   Cat
*/

class Vertbrate{} // ô�ߵ���
class Birds extends Vertbrate{} // ����
class Mamal extends Vertbrate{} // ������

class Duck extends Birds{};
class Chicken extends Birds{};

class Dog extends Mamal{};
class Cat extends Mamal{};

public class Promotion {

	public static void main(String[] args) {
		
		// ô�ߵ����ȿ��� ��� ������ �� �� �ִ�.
		Vertbrate ô�ߵ���;
		ô�ߵ��� = new Dog();
		ô�ߵ��� = new Cat();
		ô�ߵ��� = new Chicken();
		ô�ߵ��� = new Duck();
		
		// ����̴� ������ �� �� ����.
		// Birds cat = new Cat();
		// ������ �������� �� �� ����.
		// Mamal mal = new Duck();		
		
	}
}
