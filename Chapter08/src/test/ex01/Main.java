package test.ex01;

public class Main {

	public static void main(String[] args) {
		
		Solution sol = new Solution();
		String result = "";
						
		result = sol.solution(".... . .-.. .-.. ---");
		System.out.println("hello == " + result);
		
		result = sol.solution(".--. -.-- - .... --- -.");
		System.out.println("python == " + result);
		
		
	}

}
