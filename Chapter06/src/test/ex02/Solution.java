package test.ex02;

public class Solution {

	public String solution(String my_string, int n) {
		StringBuffer sb = new StringBuffer();	
		
		char[] arr = my_string.toCharArray();     // String�� char[]�� ��ȯ.
		
		// 1. char[]�� ���.   0.15ms ~ 0.21ms
		for(int i=0; i<arr.length; i++) {
			if(n > 0) {                           // �ݺ�Ƚ���� 0�� �̻��̶�� �Ʒ��ڵ� ����. (�ݺ�Ƚ���� 0���ε� ���ư��� ���� ��������.)
				for(int j=0; j<n; j++) {          // ���ڴ� n���� �ݺ��ؼ� StringBuffer�� �߰�.
					sb.append(arr[i]);            
				}						
			}						
		}				
		//=====================================================================		
		// 2. �迭�� ������� �ʰ� String�� �޼ҵ� charAt�� ���. 0.13ms ~ 0.22ms        
		int len = my_string.length();		      // String�� ���̴��.
		
		sb.setLength(0);                          // StringBuffer�ʱ�ȭ
		for(int i=0; i<len; i++) {
			for(int j=0; j<n; j++) {
				sb.append(my_string.charAt(i));
			}			
		}
		
		//=====================================================================
		// 3. �迭�� ����ϸ鼭 String�޼ҵ� repeat���.   0.07ms ~ 0.15ms       // **����for���� �ƴ� String�� repeat�޼ҵ带 ������� �� ���� ������
		sb.setLength(0);
		for(int i=0; i<arr.length; i++) {
			sb.append(Character.toString(arr[i]).repeat(n));             // repeat�޼ҵ带 ����Ϸ��� String�̿����ϱ� ������ 
			                                                             // arr[i]�� 'toString'�޼ҵ�� 'char -> String'����ȯ

		}				
		
		//=====================================================================
		// 4. �迭�� ��������ʰ� String�޼ҵ� repeat���  0.11 ~ 0.17ms
		sb.setLength(0);                           // StringBuffer�ʱ�ȭ
		for(int i=0; i<len; i++) {
			sb.append(Character.toString(my_string.charAt(i)).repeat(n));

		}
		
		//=====================================================================
		// 5. String[] ���                         0.15 ~ 0.29ms
		sb.setLength(0);                            // StringBuffer�ʱ�ȭ
		String[] arr2 = my_string.split(""); // Ư�� �����ڸ� �������� �ɰ��� ��ȯ.
		for(int i=0; i<arr2.length; i++) {
			for(int j=0; j<n; j++) {
				sb.append(arr2[i]);
			}
		}
		//=====================================================================
		String answer = sb.toString();                         // StringBuffer�� String���� ��ȯ.
		return answer;
	}
	
	
}
