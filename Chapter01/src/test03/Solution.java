package test03;

public class Solution {
	public int solution(int n) {
		// ���ڴ� ������ 6�����̴�.
		// ����� �ȵȴ�. -> �� �������� ���ã��.
		
		// 1. �ϴ� ������ �����԰� ���°� �ִٸ�
		// 2. �� ���Ѽ� �����԰� ���°� �ִ��� Ȯ��.
		
//		System.out.println("�ο� :" + n);
//		int remain = 6%n;
//		
//		System.out.println("���� ������ :" + remain);
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

