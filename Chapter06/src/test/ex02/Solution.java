package test.ex02;

public class Solution {

	public String solution(String my_string, int n) {
		StringBuffer sb = new StringBuffer();	
		
		char[] arr = my_string.toCharArray();     // String을 char[]로 변환.
		
		// 1. char[]를 사용.   0.15ms ~ 0.21ms
		for(int i=0; i<arr.length; i++) {
			if(n > 0) {                           // 반복횟수가 0번 이상이라면 아래코드 수행. (반복횟수가 0번인데 돌아가는 것을 막기위함.)
				for(int j=0; j<n; j++) {          // 문자당 n번씩 반복해서 StringBuffer에 추가.
					sb.append(arr[i]);            
				}						
			}						
		}				
		//=====================================================================		
		// 2. 배열을 사용하지 않고 String의 메소드 charAt을 사용. 0.13ms ~ 0.22ms        
		int len = my_string.length();		      // String의 길이담기.
		
		sb.setLength(0);                          // StringBuffer초기화
		for(int i=0; i<len; i++) {
			for(int j=0; j<n; j++) {
				sb.append(my_string.charAt(i));
			}			
		}
		
		//=====================================================================
		// 3. 배열을 사용하면서 String메소드 repeat사용.   0.07ms ~ 0.15ms       // **이중for문이 아닌 String의 repeat메소드를 사용했을 때 가장 빠르다
		sb.setLength(0);
		for(int i=0; i<arr.length; i++) {
			sb.append(Character.toString(arr[i]).repeat(n));             // repeat메소드를 사용하려면 String이여야하기 때문에 
			                                                             // arr[i]를 'toString'메소드로 'char -> String'형변환

		}				
		
		//=====================================================================
		// 4. 배열을 사용하지않고 String메소드 repeat사용  0.11 ~ 0.17ms
		sb.setLength(0);                           // StringBuffer초기화
		for(int i=0; i<len; i++) {
			sb.append(Character.toString(my_string.charAt(i)).repeat(n));

		}
		
		//=====================================================================
		// 5. String[] 사용                         0.15 ~ 0.29ms
		sb.setLength(0);                            // StringBuffer초기화
		String[] arr2 = my_string.split(""); // 특정 구분자를 기준으로 쪼개서 반환.
		for(int i=0; i<arr2.length; i++) {
			for(int j=0; j<n; j++) {
				sb.append(arr2[i]);
			}
		}
		//=====================================================================
		String answer = sb.toString();                         // StringBuffer를 String으로 변환.
		return answer;
	}
	
	
}
