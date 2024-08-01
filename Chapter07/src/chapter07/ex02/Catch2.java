package chapter07.ex02;

public class Catch2 {

	public static void main(String[] args) {
		String[] arr = new String[2];
		
		// 예외를 묶어서 사용하고싶을 경우 사용한다.
		try {
			arr[0] = "12345";
			arr[1] = "a12345";  
			arr[2] = "45678";                    // ArrayIndex예외발생.		
			
			int var1 = Integer.parseInt(arr[0]);
			int var2 = Integer.parseInt(arr[1]); // NumberFormat예외발생.			
			System.out.println(var1 + var2);     
			
		} catch (ArrayIndexOutOfBoundsException | NumberFormatException e) { // JDK1.7부터 적용.
			System.out.println("배열의 크기를 확인하거나 숫자만 들어있는지 확인하세요.");
			e.printStackTrace();
		} finally {
			System.out.println("끝");            // finally에서 사용.
			
		}		

	}

}
