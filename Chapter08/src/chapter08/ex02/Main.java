package chapter08.ex02;

import java.util.ArrayList;
import java.util.LinkedList;

public class Main {

	public static void main(String[] args) {
		// 1. 선수등장
		ArrayList<String> arr = new ArrayList<String>();
		LinkedList<String> lnk = new LinkedList<String>();
		
		// 2. 장소(조건)준비
		for(int i=1; i<=100; i++) {
			arr.add("data");
			lnk.add("data");
		}

		long startTime = 0;
		long endTime = 0;
		
		// 3. A출발(시간)	
		startTime = System.currentTimeMillis();
		
		// ====[A 달리기 시작]======================================================
		// 4. A달린다		
		for(int i=1; i<=100000; i++) {         // 1초부터 10만초까지
			arr.add(55, "add data");
		}
		// 5. A도착(시간)
		endTime = System.currentTimeMillis();
		// 6. 결과(도착시간-출발시간)
		System.out.println("ArrayList 결과 : " + (endTime-startTime) + "ms");
		
		// ====[B 달리기 시작]======================================================
		// 3. B출발(시간)
		startTime = System.currentTimeMillis();
		// 4. B달린다
		for(int i=1; i<=100000; i++) {         // 1초부터 10만초까지
			lnk.add(55, "add data");
		}
		// 5. B도착(시간)		
		endTime = System.currentTimeMillis();
		// 6. 결과(도착시간-출발시간)
		System.out.println("LinkedList 결과 : " + (endTime-startTime) + "ms");
	}

}
