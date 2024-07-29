package chapter04.ex07;

public class Dog extends Mammal {

	// Mammal의 특성 - 나만의 것으로 개조.
	@Override
	public void birth() {
		System.out.println("새끼를 다섯마리 낳는다.");
	}

	// 개의 고유특성.
	public void bark() {
		System.out.println("멍멍하고 짖는다.");
	}

}
