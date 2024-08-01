package chapter08.ex01;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		
		// ArrayList 선언
//		ArrayList<String> list = new ArrayList<String>(3);   // 초기값을 지정할 수 있으나, 넘어가도 상관없다. 
		List<String> list = new ArrayList<String>(3); 
		
		// 데이터 추가
		list.add("collection");  // 0번 index에 들어간다.
		list.add("thread");      // 1번 index에 들어간다.
		list.add("java IO");     // 2번 index에 들어간다.
		list.add("network");     // 3번 index에 들어간다. <- 배열이였으면 예외발생.
		list.add(3, "lambda");   // 특정 index를 지정해서 넣을 수 있다.
								 // 해당 자리의 값은 index가 한칸뒤로 밀린다.
		System.out.println(list); // println으로도 볼 수 있다.		
		
		// length가 아닌 list.size()로 크기를 알 수 있다.
		// list.get로 특정 index의 값을 꺼내올 수 있다.
		for(int i=0; i<list.size(); i++) {
			System.out.println("[" + i + "] " + list.get(i));
		}			
		
		// 데이터 삭제는 list.remove를 사용한다.
		String val = list.remove(0);
		System.out.println("내가 지운 값 : " + val);
		System.out.println(list);
		
		// 문자열로도 지워졌는지 알 수 있다.
		boolean success = list.remove("network");
		System.out.println("network를 지웠는지 여부 : " + success); // 지워달라는 값이 여러개일 경우 1개만 지워준다.
		
		// for-each문을 사용한 방법.
		for(String str : list) {
			System.out.println(str);
		}
		
		// =========================================================
		// 배열은 Arrays클래스의 메소드를 사용해야 배열의 값을 출력할 수 있다.
		String[] arr = new String[2];
		arr[0] = "array";
		arr[1] = "thread";
		System.out.println(Arrays.toString(arr));
		
	}

}
