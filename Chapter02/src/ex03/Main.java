package ex03;

public class Main {

	public static void main(String[] args) {
		int[] scores = {95, 75, 84, 38, 88};
		
		// 일반 for문
		for (int i = 0; i < scores.length; i++) {
			System.out.println(scores[i]);
		}
		
		System.out.println("============");
		
		// 향상된 for문 (forEach)
		for (int i : scores) {
			System.out.println(i);
		}
	}
}
