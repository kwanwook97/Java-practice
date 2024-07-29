package chapter04.ex07;

public class Cat extends Mammal {

	// Mammal의 특성 - 나만의 것으로 개조.
	@Override
	public void birth() {
		System.out.println("새끼를 4마리 낳는다.");
	}

	
	// 고양이 고유특성.
	public void mew() {
		System.out.println("야옹 하고 울다.");
	}


}
