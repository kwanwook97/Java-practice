package ex03;

public class ThreeD {

	public static void main(String[] args) {
		// royal 아파트는 4개층 5개호의 방 3개짜리 아파트이다.
		String[][][] royal = new String[4][4][3];
		
		// 2층 3호 2번방은 철수의 방이다.
		royal[2][3][2] = "철수의 방";
		
		// 0층 0호 0번방은 영희의 방이다.
		royal[0][0][0] = "영희의 방";
		
		// null = 정보의 부재, 공백과는 다르다.
		// 진공상태와 같다.
		for (int i = 0; i < royal.length; i++) {
			
			for (int j = 0; j < royal[i].length; j++) {
				
				for (int j2 = 0; j2 < royal[i][j].length; j2++) {
					if (royal[i][j][j2] == null) {
						royal[i][j][j2] = "빈방";
					}
					System.out.println(i+ "동" + j + "호 " + j2 + "번방은 " + royal[i][j][j2]);
					
				}
			}
		}
	}
}