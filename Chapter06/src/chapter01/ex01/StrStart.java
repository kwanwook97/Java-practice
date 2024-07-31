package chapter01.ex01;

public class StrStart {
	public static void main(String[] args) {
		
		// 문자열 만들기
		String str1 = "abcdefg";		
		// 자동완성을 통해서 다양한 생성자가 있음을 알 수 있다.
		String str2 = new String("abcdefg");		
		char[] alphabet = {'a', 'b', 'c', 'd', 'e', 'f', 'g'};
		String str3 = new String(alphabet);
		
		if(str1.equals(str2) && str2.equals(str3)) {
			System.out.println("모두 같은 문자열");
			
		}
	}

}
