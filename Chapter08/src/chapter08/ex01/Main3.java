package chapter08.ex01;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main3 {

	public static void main(String[] args) {

		// List와 Array는 비슷하다. 
		// 배열을 List로 바꾸는 방법.
		
		String[] arr = {"List", "Set", "Map"};
		
		// 1. Array -> List(Interface) 
		List<String> list = Arrays.asList(arr); // 이때, 배열의 데이터타입은 클래스형태여야 한다.		
		System.out.println(list.size());
		System.out.println(list.get(1));
		list.set(2, "HashMap");
//		list.add("test");         // 아직 배열의 형태를 벗어난 것은 아니므로 추가는 안된다.
		
		// 2. 진짜 ArrayList로 변환해야 한다.
		// List값을 ArrayList에 넣는방법.
		ArrayList<String> arrList = new ArrayList<String>();
		arrList.addAll(list);
		arrList.add("collection");
		System.out.println(arrList);
		
	}

}
