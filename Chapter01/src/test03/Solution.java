package test03;

public class Solution {
	public int solution(int n) {
		// 피자는 무조건 6조각이다.
		// 남기면 안된다. -> 딱 떨어지는 배수찾기.
		
		// 1. 일단 한판을 나눠먹고 남는게 있다면
		// 2. 또 시켜서 나눠먹고 남는게 있는지 확인.
		
//		System.out.println("인원 :" + n);
//		int remain = 6%n;
//		
//		System.out.println("남은 조각수 :" + remain);
//		while (remain > 0) {
//			answer++;
//			remain = answer*6%n;
//		}
		
		int answer = 1;
		
		while(true) {
			if(answer * 6 % n == 0) {
				break;
			}
			answer++;
		}
		return answer;
	}

}

