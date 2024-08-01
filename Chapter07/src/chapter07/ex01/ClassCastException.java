package chapter07.ex01;

public class ClassCastException {

	public static void main(String[] args) {
		
		// 부모형태에서 사실 형태로 돌아갈 때 잘못 돌아가는 경우
		// Object는 Java의 최상위 객체로서 안담기는게 없는 컵이다.
		Object value = 1234; // int -> Object(다형성)

		// 명시적 형변환을 통해 자식형태로 다시 돌아간다.
		String str = (String)value;			
		
	}

}
