package chapter07.ex04;

public class JoinMember {
	
	// ����� üũ
	public void reservedCheck(String id) throws ReservedException{
		String[] reserved = {"admin", "tester", "manager"};
		for(String str : reserved) {
			if(str.equals(id)) {
				// ��Ȳ�� �Ǹ� ������ ���ܸ� �߻���Ų��.
				throw new ReservedException(id + "�� ������Դϴ�.");
			}
		}
	}
	
	// ���� üũ
	public void ageCheck(String ageStr) throws AdultException, NumberFormatException {
		int age = Integer.parseInt(ageStr);
		
		if(age<20) {
			throw new AdultException("20�� �̸��� ������ �Ұ����մϴ�.");
		}
	}
}
