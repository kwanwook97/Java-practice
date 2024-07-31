package chapter01.ex01;

public class StringArrUtils {
	
	public static void main(String[] args) {
		// ���ڿ� = ���ڹ迭���� Ȯ���� ���� ��ɵ�.
		String string = "abcdefg";
		
		String strResult;
		int intResult;
		boolean boolResult;
		
		// ���ڱ��� �˾ƺ���
		intResult = string.length();
		System.out.println(string + "�� ���� : " + intResult);
		
		// Ư�� �ε����� �� ��������
		char charResult = string.charAt(3);
		System.out.println("3�� �ε����� �� : " + charResult);
		
		// ���ڿ� -> �迭
		char[] arr = string.toCharArray();
		System.out.println(arr);
		
		// �迭 -> ���ڿ�
		arr = new char[]{'��', '��', '��', '��'};
		
		// ���ڹ迭�� ���ڿ���
		string = new String(arr);
		System.out.println(string);
				
		string = String.valueOf(arr);
		System.out.println(string);				
		
		// �˻� : Ư�� ���ڿ��� �ִ� ��ġ�� �˷��ش�.(ó����)
		string = "abcdabcdabcd";
		intResult = string.indexOf("c");
		System.out.println("c�� index : " + intResult);
		
		// Ư�� ���ڿ��� �ڿ������� ã��.
		intResult = string.lastIndexOf("c");
		System.out.println("c�� index : " + intResult);
		
		// 3���� c�� ��� ã�� �����?
		// 1. �������� ���
		for(int i=0; i<string.length(); i++) {
			if(string.charAt(i) == 'c') {
				System.out.println("c�� index : " + i);
			}
		}
		
		// 2. �ڹ��� �޼��带 Ȱ���ϴ� ���. (�ڵ帮��)
		intResult = 0;                                       // ���ڿ����� 0�� index���� ���ڸ� ã�ƾ��ϱ⶧���� �ʱ갪�� 0���� ����.
		while(intResult > -1) {                              // indexOf �޼ҵ�� ã�����ϴ� ���ڿ��� ���°�� -1�� ��ȯ�Ѵ�. -> ����, -1�ΰ�� �ݺ����� ���� �ʵ��� �Ѵ�.
			intResult = string.indexOf("c", intResult);      // ��𼭺��� � ���� ã�� ������ ���� �־��ش�.
			
			if(intResult > -1) {                             // indexOf�� ���� ���������� ��ȯ�� ��쿡��, ��ȯ�� index���� ���. 														     
				System.out.println("c�� ��ġ : " + intResult);   
				intResult++;                                 // �߰ߵ�'c' ������ ���� index���� 'c'�� ã�� �� �ֵ��� 1�� ���������ش�. 
			}
															 // indexOf�� -1�� ��ȯ�� ��쿡�� ���̻� ã�� ���ڰ� ���ٴ� �ǹ��̹Ƿ� while���� �����ʵ��� ���� �������� �ʵ����Ѵ�.
		}
	}

}
