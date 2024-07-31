package test.ex01;

public class Solution {
	public String solution(String my_string) {			
		StringBuffer sb = new StringBuffer();		
		
		int len = my_string.length()-1;   // 입력받은 문자열의 길이. 
										  // 배열은 0부터시작하므로 -1을 해준다.
		
		// 1. String과 charAt으로 문자열 뒤집기. 
		for(int i=len; i>=0; i--) {       // 문자열의 '마지막 문자부터 ~ 첫 문자'를 StringBuffer에 append. 
			sb.append(my_string.charAt(i));
		}		
				
		//=============================================================
		// 2. char[]으로 뒤집기. 
		sb.setLength(0);                      // StringBuffer의 길이를0으로 하여 안의 내용 초기화
		char[] arr = my_string.toCharArray(); // String클래스의 메소드 'toCharArray'를 사용하여 'String -> char배열'로 변경
				
		for(int i=len; i>=0; i--) {           			
			sb.append(arr[i]);					
		}									
		
		String answer = sb.toString();
		return answer;
	}
	
}




