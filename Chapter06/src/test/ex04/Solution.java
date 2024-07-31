package test.ex04;

public class Solution {
	
	public String solution(String cipher, int code) {
		
		StringBuffer sb = new StringBuffer();
		
		
		// 1. String[]�� ����� ���.
		String[] arr = cipher.split("");          
		
		// ���ڿ��� ���̸�ŭ �ݺ��ϸ鼭 code��° ���ڸ� �����Ѵ�.
		for(int i=0; i<arr.length; i++) {
			// �迭�� index�� 0���� �����ϱ� ������ i�� 1�� ���ѵ� code(���)�� ��������.
			// �������� 0�ΰ�� code�� ����� ���� ���ڸ� StringBuffer�� append���ش�.
			if((i+1) % code == 0) {
				sb.append(arr[i]);
			}			
		}
		
		//=====================================================================
		// 2. String�� �״�� ����� ���.
		sb.setLength(0);
		for(int n=1; n<=cipher.length(); n++) {
			if(n%code ==0) {
				sb.append(cipher.charAt(n-1));					
			}
		}			
		
		//=====================================================================
		// 3. �Է¹��� ���� ����� ���� ���.
//		sb.setLength(0);
//		for(int i=1; i<=cipher.length(); i=i*code) {     // for���� ���� �� code�� �����ŭ�� �����ϵ��� �Ѵ�.
//			if(i%code==0) {
//				sb.append(cipher.charAt(i-1));	         // 
//			}						
//		}
		
		//=====================================================================
		String answer = sb.toString();
		return answer;
		
	}	
}
