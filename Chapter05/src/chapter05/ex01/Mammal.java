package chapter05.ex01;

public abstract class Mammal {
	public String name = "";
	
	public Mammal(String name) { // Mammal은 객체화시 반드시 이름을 넣어줘야 한다.
		this.name = name;
	}
	
	public void birth() {
		System.out.println(name + "가 새끼를 낳다.");
	}
	
	public void eat() {
		System.out.println(name + "가 젖을 먹는다.");
	}
	
}
