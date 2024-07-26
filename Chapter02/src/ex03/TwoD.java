package ex03;

public class TwoD {

	public static void main(String[] args) {
		
		// arr ¾ÆÆÄÆ®´Â 2°³Ãþ 3°³È£·Î ÀÌ·ç¾îÁ® ÀÖ´Ù.
		int[][] arr = {
				{0, 1, 2, 3}, // 0Ãþ
				{10, 11, 12, 13}  // 1Ãþ
		};

		// royal ¾ÆÆÄÆ® 4°³Ãþ 4°³È£.
		String[][] royal = new String[4][4];
		royal[0][0] = "0Ãþ 0È£";
		
		for(int i = 0; i < royal.length; i++) {
			for (int j = 0; j < royal[i].length; j++) {
//				System.out.println(i + "Ãþ " + j + "È£");
				royal[i][j] = i + "Ãþ " + j + "È£";
				System.out.println(royal[i][j]);
			}
			System.out.println("===========");
		}
	}
}
