package chapter08.ex04;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Main2 {

	public static void main(String[] args) {
		
		Map<String, Integer> map = new HashMap<String, Integer>();
		map.put("김철호", 99);    
		map.put("박동빈", 80);
		map.put("박은비", 75);
		map.put("신솔비", 43);
		map.put("한은정", 52);
		map.put("김민지", 100);
		map.put("김윤경", 80);
		map.put("정철수", 99);
		map.put("안은호", 87);
		map.put("최영일", 75);
		
		// 해당하는 키가 있는가? map.containsKey("키");
		// 박은비라는 키가 존재하는지 확인.			
		if (map.containsKey("박은비")) {
			System.out.println("박은비라는 키가 존재합니다.");
		} else {
			System.out.println("박은비라는 키가 존재하지 않습니다.");
		}
				
		
		// 해당하는 값이 있는가? map.containsValue("값");
		// 99라는 값이 있는지 확인.
		if (map.containsValue(99)) {
			System.out.println("99라는 값이 있습니다.");
		} else {
			System.out.println("99라는 값이 없습니다.");
		}
		
		// 해당점수의 학생을 찾는방법
		// 99점을 받은 학생의 이름을 구하시오.
		String result = "";
		
		// ============================================
		// 방법 1: keySet으로 key를 통해 value를 구하여 비교하는 방법.
		// 1. map에서 set을 추출한다.
		for(String st : map.keySet()) {
			if(map.get(st) == 99) {    // 값이 99인 경우
				result += st;          // 키값을 더해준다.
				System.out.println(result + "는 99점을 맞은 학생입니다.");
				break;                 // 한명만 찾을 경우 효율적인 방법.
			}
		}		
						
		
		// ============================================
		// 방법 2: entrySet으로 Value를 꺼내온 다음 key를 가져오는 방식.
		Set<Entry<String, Integer>> entrySet = map.entrySet();  // Map에서 EntrySet을 추출한다.
		for(Entry<String, Integer> entry : entrySet) {          // forEach문 - Entry형식으로 추출하며 반복. 
			if(entry.getValue() == 99) {                        // Entry(키, 값)중 값이 99인 value가 있다면
				String key = entry.getKey();                    // 키를 추출한다.
				System.out.println(key + "가 99점을 맞은 학생입니다.");  
				break;
			}
		}
		
		// ============================================
		// 방법 3: 
		Set<String> kset = map.keySet();          // 1. map에서 keySet을 떼어낸다.
		Iterator<String> iter = kset.iterator();  // 2.keySet을 iterator로 분리한다.
		String val = "";
		int ival = 0;
		
		while(iter.hasNext()) {           // 출력할 값이 있다면 반복
			val = iter.next();            // 키
			ival = map.get(val);          // 값
			if(ival == 99) {              // 값이 99인 경우
				System.out.println(val + "가 99점을 맞은 학생입니다.");
				break;                    // 여러명을 출력하고 싶으면 주석처리!
			}
		}		
	}		
}
