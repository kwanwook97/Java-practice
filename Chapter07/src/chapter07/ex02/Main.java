package chapter07.ex02;

public class Main {

	public static void main(String[] args) {
		/* Exception은 불가피한 외부문제로 발생하므로 프로그램이 정지하지 않도록 해야한다.
		 그래서 예외처리를 통해 exception발생 시에도 프로그램이 정상작동하도록 한다.
		 try-catch와 throws라는 두가지 방법을 사용한다.
		 
		 try-catch : 문제발생시 스스로해결.
					 finally는 exception발생시에도 꼭 실행할 code를 작성한다.
		 throws : 해당업무를 시킨 method에게 전가한다.
		 
		 예외가 하나이상 발생한경우
		 catch문을 여러개사용하거나 multicatch를 사용한다.		 
		*/
		
		String data1 = "1234";
//		String data2 = "adaagfh";
		String data2 = "5678";
					
		try { // 문제가 생길것 같은 코드.
			int val1 = Integer.parseInt(data1);
			int val2 = Integer.parseInt(data2);   // NumberFormat예외 발생!
			System.out.println(val1 + val2);      
		} catch (NumberFormatException e) { // 문제가 생겼을 때 처리코드.
			 System.out.println("숫자만 입력하세요.");
		}finally { // 정상적이든 문제가 생기든 무조건 해야할 코드.
			System.out.println("data1 : " + data1);
			System.out.println("data2 : " + data2);
			
		}
	}

}
