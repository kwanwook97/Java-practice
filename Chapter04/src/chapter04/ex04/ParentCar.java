package chapter04.ex04;

public class ParentCar {

	public void start(){
		System.out.println("시동을 건다.");
	}
	
	public int run(){
		return 60;
	}
	
	public void stop(){
		System.out.println("차를 정지한다.");
	}
	
	// final == read only
	// final키워드가 붙은 메서드는 Override가 불가하다.
	// 읽기 전용인데 수정이 가능할 수 없다.
	public final void test() {
		System.out.println("차량점검");
	}
}
