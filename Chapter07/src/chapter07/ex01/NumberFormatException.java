package chapter07.ex01;

public class NumberFormatException {

	public static void main(String[] args) {
		
		String data;
		int val;
		
		// "1234" -> 1234·Î ¹Ù²ãº¸±â
		data = "1234";
		val = Integer.parseInt(data);		
		System.out.println(val);
		
		data = "1234a";// asfda
		val = Integer.parseInt(data);
		System.out.println(val);
	}

}
