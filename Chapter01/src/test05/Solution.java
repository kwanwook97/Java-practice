package test05;

public class Solution {
	public int[] solution(int[] num_list) {
		int[] answer = new int[2];   // {¦��, Ȧ��}
		int even = 0; // ¦��
		int odd = 0; // Ȧ��
		
		for(int i = 0; i < num_list.length; i++) {
			if (num_list[i] % 2 == 0) {         // �迭�� ��� ���� ¦���̸�, even 1����
				even++;         
			}else {                        // �迭�� ��� ���� Ȧ���̸�, odd 1����
				odd++;
			}
		}
		answer[0] = even;
		answer[1] = odd;
		
		return answer;
		
	}
}


