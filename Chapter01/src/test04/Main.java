package test04;

public class Main {

	public static void main(String[] args) {
		
		int result = 0;
		// ÁÂÇ¥ 1 : (2, 4)
		// ÁÂÇ¥ 2 : (-7, 9)
		int[] point = {2, 4, -7, 9, -1, -3, 8, -6}; 
		
		Solution sol = new Solution();
		result = sol.solution(point[0], point[1]);
		System.out.println("1 == " + result);
		
		result = sol.solution(point[2], point[3]);
		System.out.println("2 == " + result);
		
		result = sol.solution(point[4], point[5]);
		System.out.println("3 == " + result);
		
		result = sol.solution(point[6], point[7]);
		System.out.println("4 == " + result);
	
		// result = sol.solution(new int[] {-7, 9});
		
	}

}
