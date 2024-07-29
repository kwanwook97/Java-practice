package chapter04.ex09;

public class Mage {

	public static void main(String[] args) {
		
		// 다형성을 활용하여 하나의 변수로 여러 마법을 대응할 수 있었다.
		// 마법추가시에도 상대적으로 쉬운 코드를 사용했다.
		Spell sp = null;
		sp = new Ice();
		System.out.println(sp.casting());
		
		sp = new Fire();
		System.out.println(sp.casting());
		
		sp = new Light();
		System.out.println(sp.casting());

	}

}
