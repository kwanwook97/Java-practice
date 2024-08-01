package chapter08.ex04;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Main {

	public static void main(String[] args) {
		
		Map<String, Integer> map = new HashMap<String, Integer>();
		// add가 아니라 put을 사용한다.
		map.put("kim", 23);  // 이름, 나이
		map.put("lee", 26);  
		map.put("park", 26); // 값의 중복
		map.put("kim", 30);  // 키의 중복
		
		System.out.println("map size : " + map.size());
		System.out.println(map);
		
		// 단일 값 가져오기
		System.out.println(map.get("lee"));
		
		// 삭제
		int age = map.remove("park"); 
		System.out.println("내가 지운 값 : " + age);
		
		/* 맵의 모든 값 하나씩 뽑아오기 */
		// ====================================================
		// 1. key만 Set형태로 뽑아오기.
		Set<String> keySet = map.keySet();
		
		// 2. Set을 하나씩 가져올 수 있도로 쪼개기(iterator)
		Iterator<String> iter = keySet.iterator();		
		
		// 3. Key를 하나씩 가져와서 해당되는 value가져오기.
		while(iter.hasNext()) {
			String key = iter.next();
			int val = map.get(key);
			System.out.println(key + " : " + val);
		}
		
		// ====================================================
		// Entry(키:값)을 Set형태로 뽑아오기		
		// 1. Entry를 Set형태로 가져온다.
		Set<Entry<String, Integer>> entrySet = map.entrySet();
		// 2. Iterator를 사용하여 하나씩 쪼갠다.
		Iterator<Entry<String, Integer>> entry = entrySet.iterator();
		// 3. 하나씩 Entry(key:value)를 가져와 키와 값을 각각 추출한다.
		while (entry.hasNext()) {
			Entry<String, Integer> en = entry.next();
			String key = en.getKey();
			int val = en.getValue();
			System.out.println(key + " = " + val);
			
		}
		// ====================================================
		// keySet과 향상된 for문을 이용한 방법.
		for(String key : map.keySet()) {
			System.out.println(key + " : " + map.get(key));
		}
	}

}
