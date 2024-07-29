package chapter03.ex08.over;

public class Main {

	public static void main(String[] args) {
		
		Calculator cal = new Calculator();
		
		// 오버로드를 사용하면 그냥 plus 메서드 안에 넣고 싶은 값을 넣으면 된다.
		// 지원되는 메서드가 있으면 실행이 되고, 없으면 빨간줄
		System.out.println(cal.plus(1, 0.005));
		System.out.println(cal.plus("A", 0.0003));


	}

}
