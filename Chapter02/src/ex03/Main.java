package ex03;

public class Main {

	public static void main(String[] args) {
		int[] scores = {95, 75, 84, 38, 88};
		
		// �Ϲ� for��
		for (int i = 0; i < scores.length; i++) {
			System.out.println(scores[i]);
		}
		
		System.out.println("============");
		
		// ���� for�� (forEach)
		for (int i : scores) {
			System.out.println(i);
		}
	}
}
