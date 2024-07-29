package chapter04.ex02;

public class Child extends Parent {

	public Child() {
		super();     // 부모생성자를 부르는 키워드(생략되어 있다.)
		System.out.println("자식 생성자 호출.");
	}

}
