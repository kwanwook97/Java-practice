package test.ex05;

public class Solution {
	
	public String solution(String rsp) {		
		StringBuffer sb = new StringBuffer();
		
		// ������ �迭�� �� ���.
		for(int i=0; i<rsp.length(); i++) {			
			switch (rsp.charAt(i)) {     // String�� ���ڰ��� Ȯ���Ͽ� StringBuffer�� �� ����.
			case '2' :                   // ���� 2 < 0 ���� 
				sb.append("0");
				break;
				
			case '0' :                   // ������ 0 < 5 ��
				sb.append("5");
				break;
				
			case '5' :                   // ����  5 < 2 ����	
				sb.append("2");
				break;
			} 			
		}		

		String answer = sb.toString();					
		return answer;
	}
	
}
