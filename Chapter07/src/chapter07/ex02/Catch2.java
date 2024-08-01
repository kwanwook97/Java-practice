package chapter07.ex02;

public class Catch2 {

	public static void main(String[] args) {
		String[] arr = new String[2];
		
		// ���ܸ� ��� ����ϰ���� ��� ����Ѵ�.
		try {
			arr[0] = "12345";
			arr[1] = "a12345";  
			arr[2] = "45678";                    // ArrayIndex���ܹ߻�.		
			
			int var1 = Integer.parseInt(arr[0]);
			int var2 = Integer.parseInt(arr[1]); // NumberFormat���ܹ߻�.			
			System.out.println(var1 + var2);     
			
		} catch (ArrayIndexOutOfBoundsException | NumberFormatException e) { // JDK1.7���� ����.
			System.out.println("�迭�� ũ�⸦ Ȯ���ϰų� ���ڸ� ����ִ��� Ȯ���ϼ���.");
			e.printStackTrace();
		} finally {
			System.out.println("��");            // finally���� ���.
			
		}		

	}

}
