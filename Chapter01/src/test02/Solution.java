package test02;

public class Solution {
	
	public int solution(int n) {
		
		int answer = 0;
		
		// 1. 1���� n���� ���.
			for (int i = 1; i <= n; i++) {
		// 2. �� �߿��� ¦���� ���.
				if (i % 2 == 0) {
		// 3. ¦���� ���ϱ�.
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
