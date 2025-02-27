package chapter01.ex01;

public class StringUtils {

	public static void main(String[] args) {

		String string = "abcdefg";
		
		String strResult;
		int intResult;
		boolean boolResult;
		
		// String에서 사용가능한 메서드 들..
		
		/*문자열 비교*/
		// equals : 두 문자열간의 값을 비교하여 같으면 true, 틀리면 false반환.
		boolResult = string.equals("abc");
	    System.out.println("두 문자는 같나요? " + boolResult);		
		
	    // compareTo : 두 값을 비교하여 사전적으로 같다면 0을 반환.
	    // 앞에서 부터 탐색하다가 다른 문자를 발견하면 차이를 계산하고 멈춘다.
	    // 서로 값이 다르다면, p(112) - j(106) = 6(ASCII)이 반환된다.
	    string = "[img]uploadFile.png";
		intResult = string.compareTo("[img]uploadFile.jpg");
		System.out.println("두 문자가 같나요? " + intResult);
	    
		// contains : 왼쪽의 문자열 안에 오른쪽 값이 포함되어 있는지 확인.
		// true/false를 반환.
		boolResult = string.contains("png");
		System.out.println("png가 포함되어 있는가? " + boolResult);		
		
	    /*문자열 교체*/ 
		// replace : 특정 문자열을 발견하면 지정한 문자열로 변경하여 새로운 변수로 내보낸다.
		String newStr = string.replace("png", "mp4");
		System.out.println("기존 문자열 : " + string);
		System.out.println("새로운 문자열 : " + newStr);
		
		/*공백 제거*/
		string = "my name is kwanwook";
		newStr = string.replace(" ", "");
		System.out.println(string + "=> " + newStr);
		
		// 앞뒤의 공백만 제거
		string = " 가나다 라 마바사 ";
		newStr = string.trim();
		System.out.println(string);
		System.out.println(newStr);
		
		/*시작과 끝 체크*/
		string = "[img]uploadFile.png"; 		
		// 특정 문자열로 시작하는가?
		boolResult = string.startsWith("[img]");				
		System.out.println("[img] 시작여부 : " + boolResult);		
		
		// 특정 문자열로 끝나는가?
		boolResult = string.endsWith(".png");
		System.out.println(".png로 끝나는지 여부 : " + boolResult);
		
		/*반복*/
		newStr = "*".repeat(4);
		System.out.println("010-1234-" + newStr);								
		
	}

}
