package Ex01;

public class StmtWhile {

//	public static void main(String[] args) {
//		
//		int cup = 1;
//		
//		while (true) {  // ������ ���̸� while�� ��� �ݺ��Ѵ�.
//			System.out.println(cup + "�� ������");
//			cup++;
//			if (cup > 10) {
//				break;
//			}
//		}
//		// unreachable code : �� while���� �������� �ݺ��Ǳ� ������ �Ʒ� �ڵ���� ������ ���ٴ� ��.
//		// �ذ��� 1 : �Ʒ��ڵ带 �����.
//		// �ذ��� 2 : �� �ݺ����� ������ �ִ� ������ �����ش�.
//		cup = 1;
//		System.out.println("�� ���Խ��ϴ�.");
//		
//	}
	
	public static void main(String[] args) {
		int cnt = 10;
		// while : ����üũ -> �ݺ�����.
		while (cnt<10) { // cnt�� 10���� ������ Ȯ��.
			cnt++; // ����
		}
		System.out.println("while cnt : " + cnt);
		
		//do while : �ϴܽ��� -> ����üũ
		cnt = 10;
		do {
			cnt++;
		} while (cnt<10);
		System.out.println("do while cnt : " + cnt);
		// while�� do while�� ������ ������ ���� ���� ����� ����.
		// ������ ������ �����ʴ� ��� �ٸ������ ����.
		// �� : ������ ������ �ĺ��� ������ ����.
	}
}















