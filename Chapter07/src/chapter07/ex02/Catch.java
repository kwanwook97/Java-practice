package chapter07.ex02;

public class Catch {

	public static void main(String[] args) {
		
		String[] arr = new String[2];
		
		// 각 예외마다 다른 처리를 해주고 싶은 경우 사용한다.
		try {
			arr[0] = "12345";
			arr[1] = "a12345";  
			arr[2] = "45678";                    // ArrayIndex예외발생.		
			
			int var1 = Integer.parseInt(arr[0]);
			int var2 = Integer.parseInt(arr[1]); // NumberFormat예외발생.			
			System.out.println(var1 + var2);     
			
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("배열의 인덱스를 확인해주세요.");
			System.out.println(e.toString());
		} catch (NumberFormatException e) {
			System.out.println("숫자만 넣으세요.");
			e.printStackTrace();                // 아주 상세한 예외정보 보는방법.
											 	// 개발시에만 사용하고 사용 후 주석처리해야 함.
		} finally {
			System.out.println("끝");            // finally에서 사용.
			
		}			
	}
}
