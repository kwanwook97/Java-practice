package chapter07.ex02;

public class Catch {

	public static void main(String[] args) {
		
		String[] arr = new String[2];
		
		// �� ���ܸ��� �ٸ� ó���� ���ְ� ���� ��� ����Ѵ�.
		try {
			arr[0] = "12345";
			arr[1] = "a12345";  
			arr[2] = "45678";                    // ArrayIndex���ܹ߻�.		
			
			int var1 = Integer.parseInt(arr[0]);
			int var2 = Integer.parseInt(arr[1]); // NumberFormat���ܹ߻�.			
			System.out.println(var1 + var2);     
			
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("�迭�� �ε����� Ȯ�����ּ���.");
			System.out.println(e.toString());
		} catch (NumberFormatException e) {
			System.out.println("���ڸ� ��������.");
			e.printStackTrace();                // ���� ���� �������� ���¹��.
											 	// ���߽ÿ��� ����ϰ� ��� �� �ּ�ó���ؾ� ��.
		} finally {
			System.out.println("��");            // finally���� ���.
			
		}			
	}
}
