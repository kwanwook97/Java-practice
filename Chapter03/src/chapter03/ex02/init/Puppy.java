package chapter03.ex02.init;

public class Puppy {
	// 이 객체가 사라질 때까지 이름과 목적이 유지된다.
	public String name;
	public String goal;
	public int age;
	
	public Puppy(String name, String goal) {        // 1. 이름과 목적을 받아왔지만, 생성자가 사용되고나면 값이 사라진다.
		// 그래서 받아온 name을 여기에 있는 name에 넣어준다.
		this.name = name;
		this.goal = goal;
		System.out.println("이름은 " + name + "이고, 목적은 " + goal + "입니다.");
	}
	
	// Overrode : 같은 이름으로 여러개를 만들 수 있도록 허용하는 것.
	// 조건 : 매개변수의 갯수나 데이터타입은 달라야한다.
	public Puppy(String name) {
		this.name = name;
		System.out.println(name);
	}
	
	// 매개변수의 갯수가 다르므로 같은 이름으로 생성가능.
	public Puppy() {
		this.age = age;
	}
	
	// 매개변수의 갯수는 같으나 데이터 타입이 달라 같은이름으로 생성가능.
	public Puppy(int age) {
		this.age = age;
	}
	
}
