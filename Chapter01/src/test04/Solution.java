package test04;

public class Solution {
	
	/*
	x��ǥ (x,y)�� ���ʷ� ���� ���� �迭 dot�� �־����� ��
	��ǥ dot�� ��и��� ��� ���ϴ��� 1,2,3,4�� �ϳ��� ���. 
	��1��и� : x��ǥ, y��ǥ = ��� ���
	��2��и� : x��ǥ = ����, y��ǥ = ���
	��3��и� : x��ǥ, y��ǥ = ��� ����
	��4��и� : x��ǥ = ���, y��ǥ = ����
	*/
	
	int answer = 0;
	
	public int solution(int point, int point2) {
			
		if(point > 0 && point2 > 0) {          // x, y�� ��� ����� �� ��1��и�.
			answer = 1;
		}else if(point < 0 && point2 > 0) {    // x�� ����, y�� ����� �� ��2��и�.
			answer = 2;
		}else if(point < 0 && point2 < 0) {    // x, y�� ��� ������ �� ��3��и�.
			answer = 3;
		}else if(point > 0 && point2 < 0) {    // x�� ���, y�� ������ �� ��4��и�.
			answer = 4;
		}

		return answer;
		
	}
}
