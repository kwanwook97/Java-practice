package chapter07.ex02;

public class Catch3 {

	public static void main(String[] args) {
		String[] arr = new String[2];
		
		// ��� ���ܸ� �ѹ��� ó�����ְ� ������� ���.(�������� Ȱ��)
		try {
			arr[0] = "12345";
			arr[1] = "a12345";  
			arr[2] = "45678";                    // ArrayIndex���ܹ߻�.		
			
			int var1 = Integer.parseInt(arr[0]);
			int var2 = Integer.parseInt(arr[1]); // NumberFormat���ܹ߻�.			
			System.out.println(var1 + var2);     
			
		} catch (Exception e) {
			System.out.println("���ܰ� �߻��߽��ϴ�.");
			e.printStackTrace();
		} finally {
			System.out.println("��");            // finally���� ���.
			
		}		
	}
}
