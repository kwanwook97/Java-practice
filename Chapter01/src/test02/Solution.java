package test02;

public class Solution {
	
	public int solution(int n) {
		
		int answer = 0;
		
		// 1. 1부터 n까지 출력.
			for (int i = 1; i <= n; i++) {
		// 2. 그 중에서 짝수만 출력.
				if (i % 2 == 0) {
		// 3. 짝수만 합하기.
					answer += i;
				}
			}
			
		return answer;	
		
//		for(int i = 1; i <= n; i++) {
//			answer = i%2==0 ? answer += i : answer;
//		}
//			
			
	}

}
