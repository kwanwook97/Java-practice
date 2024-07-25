package test04;

public class Solution {
	
	/*
	x좌표 (x,y)를 차례로 담은 정수 배열 dot이 주어졌을 때
	좌표 dot이 사분면중 어디에 속하는지 1,2,3,4중 하나를 출력. 
	제1사분면 : x좌표, y좌표 = 모두 양수
	제2사분면 : x좌표 = 음수, y좌표 = 양수
	제3사분면 : x좌표, y좌표 = 모두 음수
	제4사분면 : x좌표 = 양수, y좌표 = 음수
	*/
	
	int answer = 0;
	
	public int solution(int point, int point2) {
			
		if(point > 0 && point2 > 0) {          // x, y가 모두 양수일 때 제1사분면.
			answer = 1;
		}else if(point < 0 && point2 > 0) {    // x가 음수, y가 양수일 때 제2사분면.
			answer = 2;
		}else if(point < 0 && point2 < 0) {    // x, y가 모두 음수일 때 제3사분면.
			answer = 3;
		}else if(point > 0 && point2 < 0) {    // x가 양수, y가 음수일 때 제4사분면.
			answer = 4;
		}

		return answer;
		
	}
}
