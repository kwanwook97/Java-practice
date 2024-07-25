package Ex01;

public class StmtBreak {

	public static void main(String[] args) {
		
		// i가 3일경우 중단하고 빠져나오기
		for (int i = 0; i < 10; i++) {
			if (i == 3) {
				break;
			}
			System.out.println(i);
		}
	}

}
