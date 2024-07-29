package chapter04.ex05;

// 하나의 자바파일에는 한개 이상의 클래스를 생성할 수 있다.
// public class는 파일명과 동일한 클래스만 사용가능하다.
public class Child extends ParentHouse {

	public Child() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void useRoom() {
		System.out.println("첫째가 방을 사용한다.");
	}
}


class ChildOne extends ParentHouse {

	public ChildOne() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void useRoom() {
		System.out.println("둘째가 방을 사용한다.");
	}
}

class ChildTwo extends ParentHouse {

	public ChildTwo() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void useRoom() {
		System.out.println("셋째가 방을 사용한다.");
	}
}

class ChildThree extends ParentHouse {

	public ChildThree() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void useRoom() {
		System.out.println("넷째가 방을 사용한다.");
	}
}