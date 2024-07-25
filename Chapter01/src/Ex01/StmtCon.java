package Ex01;

public class StmtCon {

	public static void main(String[] args) {
		
		// 1~10까지 반복해서 출력. 3은제외한다. 
		for(int i = 1; i <= 10; i++) {
			if(i%3==0) {
				continue;
			}
			System.out.println(i);
		}

	}

}
