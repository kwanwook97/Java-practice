package ex03;

public class TwoD {

	public static void main(String[] args) {
		
		// arr ����Ʈ�� 2���� 3��ȣ�� �̷���� �ִ�.
		int[][] arr = {
				{0, 1, 2, 3}, // 0��
				{10, 11, 12, 13}  // 1��
		};

		// royal ����Ʈ 4���� 4��ȣ.
		String[][] royal = new String[4][4];
		royal[0][0] = "0�� 0ȣ";
		
		for(int i = 0; i < royal.length; i++) {
			for (int j = 0; j < royal[i].length; j++) {
//				System.out.println(i + "�� " + j + "ȣ");
				royal[i][j] = i + "�� " + j + "ȣ";
				System.out.println(royal[i][j]);
			}
			System.out.println("===========");
		}
	}
}
