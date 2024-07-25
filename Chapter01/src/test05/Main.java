package test05;

public class Main {

	public static void main(String[] args) {
		
		int result[] = {1, 2, 3, 4, 5};
		int result2[] = {1, 3, 5, 7};
		
		Solution sol = new Solution();
		
		result = sol.solution(result);
		System.out.println("2, 3 == " + result[0] + ", " + result[1]);
		
		result2 = sol.solution(result2);
		System.out.println("0, 4 == " + result2[0] + ", " + result2[1]);

		for (int i = 0; i < result2.length; i++) {
			int j = result2[i];
			
		}

	}
}
