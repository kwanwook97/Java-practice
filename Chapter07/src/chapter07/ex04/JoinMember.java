package chapter07.ex04;

public class JoinMember {
	
	// 예약어 체크
	public void reservedCheck(String id) throws ReservedException{
		String[] reserved = {"admin", "tester", "manager"};
		for(String str : reserved) {
			if(str.equals(id)) {
				// 상황이 되면 강제로 예외를 발생시킨다.
				throw new ReservedException(id + "는 예약어입니다.");
			}
		}
	}
	
	// 나이 체크
	public void ageCheck(String ageStr) throws AdultException, NumberFormatException {
		int age = Integer.parseInt(ageStr);
		
		if(age<20) {
			throw new AdultException("20세 미만은 가입이 불가능합니다.");
		}
	}
}
