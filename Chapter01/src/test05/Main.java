package test05;

import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		
		int result[] = {1, 2, 3, 4, 5};
		int result2[] = {1, 3, 5, 7};
		
		Solution sol = new Solution();
		
		result = sol.solution(result);
		System.out.println("2, 3 == " + Arrays.toString(result));
		
		result2 = sol.solution(result2);
		System.out.println("0, 4 == " + Arrays.toString(result2));

		for (int i = 0; i < result2.length; i++) {
			int j = result2[i];
			
		}

	}
}
