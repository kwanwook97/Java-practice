package ex03;

public class ThreeD {

	public static void main(String[] args) {
		// royal ����Ʈ�� 4���� 5��ȣ�� �� 3��¥�� ����Ʈ�̴�.
		String[][][] royal = new String[4][4][3];
		
		// 2�� 3ȣ 2������ ö���� ���̴�.
		royal[2][3][2] = "ö���� ��";
		
		// 0�� 0ȣ 0������ ������ ���̴�.
		royal[0][0][0] = "������ ��";
		
		// null = ������ ����, ������� �ٸ���.
		// �������¿� ����.
		for (int i = 0; i < royal.length; i++) {
			
			for (int j = 0; j < royal[i].length; j++) {
				
				for (int j2 = 0; j2 < royal[i][j].length; j2++) {
					if (royal[i][j][j2] == null) {
						royal[i][j][j2] = "���";
					}
					System.out.println(i+ "��" + j + "ȣ " + j2 + "������ " + royal[i][j][j2]);
					
				}
			}
		}
	}
}