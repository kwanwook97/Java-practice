package test.ex01;

public class Solution {
	public String solution(String my_string) {			
		StringBuffer sb = new StringBuffer();		
		
		int len = my_string.length()-1;   // �Է¹��� ���ڿ��� ����. 
										  // �迭�� 0���ͽ����ϹǷ� -1�� ���ش�.
		
		// 1. String�� charAt���� ���ڿ� ������. 
		for(int i=len; i>=0; i--) {       // ���ڿ��� '������ ���ں��� ~ ù ����'�� StringBuffer�� append. 
			sb.append(my_string.charAt(i));
		}		
				
		//=============================================================
		// 2. char[]���� ������. 
		sb.setLength(0);                      // StringBuffer�� ���̸�0���� �Ͽ� ���� ���� �ʱ�ȭ
		char[] arr = my_string.toCharArray(); // StringŬ������ �޼ҵ� 'toCharArray'�� ����Ͽ� 'String -> char�迭'�� ����
				
		for(int i=len; i>=0; i--) {           			
			sb.append(arr[i]);					
		}									
		
		String answer = sb.toString();
		return answer;
	}
	
}




