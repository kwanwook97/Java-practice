package chapter07.ex04;

public class Main {

	public static void main(String[] args) {

		// ȸ������
		JoinMember join = new JoinMember();
		String id = "admin";
		String age = "19";
		
		// ���࿹��
		try {
			join.reservedCheck(id); 			
		} catch (Exception e) {  // ������ Ȱ��.
			e.printStackTrace(); // ������ ���ȼ��� ������ �ּ�ó���ؾ� �Ѵ�.
		}
		
		// �Ϲݿ���
		try {
			join.ageCheck(age);
		} catch (NumberFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (AdultException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
