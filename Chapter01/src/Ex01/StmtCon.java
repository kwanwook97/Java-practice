package Ex01;

public class StmtCon {

	public static void main(String[] args) {
		
		// 1~10���� �ݺ��ؼ� ���. 3�������Ѵ�. 
		for(int i = 1; i <= 10; i++) {
			if(i%3==0) {
				continue;
			}
			System.out.println(i);
		}

	}

}
