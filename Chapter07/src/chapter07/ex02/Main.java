package chapter07.ex02;

public class Main {

	public static void main(String[] args) {
		/* Exception�� �Ұ����� �ܺι����� �߻��ϹǷ� ���α׷��� �������� �ʵ��� �ؾ��Ѵ�.
		 �׷��� ����ó���� ���� exception�߻� �ÿ��� ���α׷��� �����۵��ϵ��� �Ѵ�.
		 try-catch�� throws��� �ΰ��� ����� ����Ѵ�.
		 
		 try-catch : �����߻��� �������ذ�.
					 finally�� exception�߻��ÿ��� �� ������ code�� �ۼ��Ѵ�.
		 throws : �ش������ ��Ų method���� �����Ѵ�.
		 
		 ���ܰ� �ϳ��̻� �߻��Ѱ��
		 catch���� ����������ϰų� multicatch�� ����Ѵ�.		 
		*/
		
		String data1 = "1234";
//		String data2 = "adaagfh";
		String data2 = "5678";
					
		try { // ������ ����� ���� �ڵ�.
			int val1 = Integer.parseInt(data1);
			int val2 = Integer.parseInt(data2);   // NumberFormat���� �߻�!
			System.out.println(val1 + val2);      
		} catch (NumberFormatException e) { // ������ ������ �� ó���ڵ�.
			 System.out.println("���ڸ� �Է��ϼ���.");
		}finally { // �������̵� ������ ����� ������ �ؾ��� �ڵ�.
			System.out.println("data1 : " + data1);
			System.out.println("data2 : " + data2);
			
		}
	}

}
