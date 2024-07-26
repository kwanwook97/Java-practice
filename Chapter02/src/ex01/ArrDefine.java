package ex01;

public class ArrDefine {

	public static void main(String[] args) {
		// 데이터타입 변수이름 = 값.
		int[] score = {70, 80, 90};
		String[] names = {"홍길동", "고길동", "박길동"};
		
		// 일단 선언해 놓고 나중에 값을 넣는방법.
		int[] arr = new int[7];
		
		// 일단 선언 후 나중에 한꺼번에 값을 넣는방법.
		int[] scores;
		scores = new int[]{70, 80, 90};
		
		
		
		System.out.println(score);
		System.out.println(names);
	}

}
