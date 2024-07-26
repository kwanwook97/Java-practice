package test05;

public class Solution {
	public int[] solution(int[] num_list) {
		int[] answer = new int[2];   // {짝수, 홀수}
		int even = 0; // 짝수
		int odd = 0; // 홀수
		
		for(int i = 0; i < num_list.length; i++) {
			if (num_list[i] % 2 == 0) {         // 배열에 담긴 값이 짝수이면, even 1증가
				even++;         
			}else {                        // 배열에 담긴 값이 홀수이면, odd 1증가
				odd++;
			}
		}
		answer[0] = even;
		answer[1] = odd;
		
		return answer;
		
	}
}


