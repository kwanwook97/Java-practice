package test.ex03;

public class Solution {
	
	public String solution(String my_string, String letter) {
			
		StringBuffer sb = new StringBuffer();
		
		// 1. String�޼����� replace����ϱ�.	0.02 ~ 0.05ms	// ** String�޼ҵ带 ����ϴ� ���� �ӵ��� ������ �����ϴ�.
		String answer = my_string.replace(letter, "");
		
		//=====================================================================
		// 2. String[]���� �Է¹��� ���������ϱ�.  0.16 ~ 0.56ms
		String[] arr = my_string.split("");
		// my_string�� �迭ȭ		
		for(int i=0; i<arr.length; i++) {
			// �ϳ��� ������ letter�� ��			
			if(!arr[i].equals(letter)) {
				// ��ġ���� ������ �߰�
				sb.append(arr[i]);
			}
		}				
		
		//=====================================================================
		answer = sb.toString();		
		return answer;
	}
}

