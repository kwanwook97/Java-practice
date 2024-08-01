package chapter07.ex02;

public class Catch3 {

	public static void main(String[] args) {
		String[] arr = new String[2];
		
		// 모든 예외를 한번에 처리해주고 싶을경우 사용.(다형성을 활용)
		try {
			arr[0] = "12345";
			arr[1] = "a12345";  
			arr[2] = "45678";                    // ArrayIndex예외발생.		
			
			int var1 = Integer.parseInt(arr[0]);
			int var2 = Integer.parseInt(arr[1]); // NumberFormat예외발생.			
			System.out.println(var1 + var2);     
			
		} catch (Exception e) {
			System.out.println("예외가 발생했습니다.");
			e.printStackTrace();
		} finally {
			System.out.println("끝");            // finally에서 사용.
			
		}		
	}
}
