package test01;

public class Solution {

	public int solution(int angle) {
		int answer = 0;
		
		if (0 < angle && angle < 90) {           // 예각
			answer = 1;
		}else if (angle == 90) {            	 // 직각
			answer = 2;
		}else if (90 < angle && angle < 180) {   // 둔각
			answer = 3;
		}else if (angle == 180) {           	 // 평각
			answer = 4;
		}
		
		return answer;
	}
}
