package test.ex04;

public class Main {

	public static void main(String[] args) {
		Solution sol = new Solution();
		String result = "";
		
		 result = sol.solution("dfjardstddetckdaccccdegk", 4);
		 System.out.println("attack".equals(result));
		 
		 result = sol.solution("pfqallllabwaoclk", 2);
		 System.out.println("fallback".equals(result));

	}

}
