package test.ex04;

public class Solution {
	
	public String solution(String cipher, int code) {
		
		StringBuffer sb = new StringBuffer();
		
		
		// 1. String[]을 사용한 방법.
		String[] arr = cipher.split("");          
		
		// 문자열의 길이만큼 반복하면서 code번째 문자를 추출한다.
		for(int i=0; i<arr.length; i++) {
			// 배열의 index는 0부터 시작하기 때문에 i에 1을 더한뒤 code(배수)를 나눠준자.
			// 나머지가 0인경우 code의 배수로 보고 문자를 StringBuffer에 append해준다.
			if((i+1) % code == 0) {
				sb.append(arr[i]);
			}			
		}
		
		//=====================================================================
		// 2. String을 그대로 사용한 방법.
		sb.setLength(0);
		for(int n=1; n<=cipher.length(); n++) {
			if(n%code ==0) {
				sb.append(cipher.charAt(n-1));					
			}
		}			
		
		//=====================================================================
		// 3. 입력받은 값의 배수식 도는 방법.
//		sb.setLength(0);
//		for(int i=1; i<=cipher.length(); i=i*code) {     // for문을 돌릴 때 code의 배수만큼씩 증가하도록 한다.
//			if(i%code==0) {
//				sb.append(cipher.charAt(i-1));	         // 
//			}						
//		}
		
		//=====================================================================
		String answer = sb.toString();
		return answer;
		
	}	
}
