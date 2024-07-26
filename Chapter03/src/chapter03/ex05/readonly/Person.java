package chapter03.ex05.readonly;

public class Person {

	final String nation;
	static final String ssn = "991231-1234567";     // 상수는 누구도 건드릴 수 없기 때문에 반드시 값을 초기화를 해줘야 한다.
	final String name;
	
	// 일반 final은 생성자에서 초기화 한다.
	// static final은 생성자에서도 초기화할 수 없는 '불변의 값'이다.
	public Person(String nation, String name) {
		this.nation = nation;
		this.name = name;
		
	}
	
}
