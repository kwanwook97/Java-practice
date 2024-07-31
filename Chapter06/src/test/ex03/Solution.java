package test.ex03;

public class Solution {
	
	public String solution(String my_string, String letter) {
			
		StringBuffer sb = new StringBuffer();
		
		// 1. String메서드인 replace사용하기.	0.02 ~ 0.05ms	// ** String메소드를 사용하는 것이 속도가 빠르고 간단하다.
		String answer = my_string.replace(letter, "");
		
		//=====================================================================
		// 2. String[]에서 입력받은 문자제거하기.  0.16 ~ 0.56ms
		String[] arr = my_string.split("");
		// my_string을 배열화		
		for(int i=0; i<arr.length; i++) {
			// 하나씩 꺼내서 letter와 비교			
			if(!arr[i].equals(letter)) {
				// 일치하지 않으면 추가
				sb.append(arr[i]);
			}
		}				
		
		//=====================================================================
		answer = sb.toString();		
		return answer;
	}
}

