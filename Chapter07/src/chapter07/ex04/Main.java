package chapter07.ex04;

public class Main {

	public static void main(String[] args) {

		// 회원가입
		JoinMember join = new JoinMember();
		String id = "admin";
		String age = "19";
		
		// 실행예외
		try {
			join.reservedCheck(id); 			
		} catch (Exception e) {  // 다형성 활용.
			e.printStackTrace(); // 개발후 보안성의 문제로 주석처리해야 한다.
		}
		
		// 일반예외
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
