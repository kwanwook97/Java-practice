package chapter08.ex05;

public class Towel {
	// 스택을 활용한 예제
	// LIFO로 마지막에 들어간 값이 먼저 나오는 구조.
	
	private String color;
	
	public Towel(String color) {
		this.color = color;
	}
	
	public String getColor() {
		return color;
	}			
}
