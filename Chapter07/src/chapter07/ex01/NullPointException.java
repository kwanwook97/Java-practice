package chapter07.ex01;

public class NullPointException {

	public static void main(String[] args) {
		// null 인 값을 가지고 무언가를 하려고 할 때 발생하는 예외
		String data = null;
		data.contains("a");

	}

}