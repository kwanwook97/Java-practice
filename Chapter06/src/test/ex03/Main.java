package test.ex03;

public class Main {

	public static void main(String[] args) {
		
		Solution sol = new Solution();
		String result = "";
		
		result = sol.solution("abcdef", "f");
		System.out.println("abcde".equals(result));
		
		result = sol.solution("BCBdbe", "B");
		System.out.println("Cdbe".equals(result));

	}

}
