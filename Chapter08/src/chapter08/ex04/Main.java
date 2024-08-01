package chapter08.ex04;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Main {

	public static void main(String[] args) {
		
		Map<String, Integer> map = new HashMap<String, Integer>();
		// add�� �ƴ϶� put�� ����Ѵ�.
		map.put("kim", 23);  // �̸�, ����
		map.put("lee", 26);  
		map.put("park", 26); // ���� �ߺ�
		map.put("kim", 30);  // Ű�� �ߺ�
		
		System.out.println("map size : " + map.size());
		System.out.println(map);
		
		// ���� �� ��������
		System.out.println(map.get("lee"));
		
		// ����
		int age = map.remove("park"); 
		System.out.println("���� ���� �� : " + age);
		
		/* ���� ��� �� �ϳ��� �̾ƿ��� */
		// ====================================================
		// 1. key�� Set���·� �̾ƿ���.
		Set<String> keySet = map.keySet();
		
		// 2. Set�� �ϳ��� ������ �� �ֵ��� �ɰ���(iterator)
		Iterator<String> iter = keySet.iterator();		
		
		// 3. Key�� �ϳ��� �����ͼ� �ش�Ǵ� value��������.
		while(iter.hasNext()) {
			String key = iter.next();
			int val = map.get(key);
			System.out.println(key + " : " + val);
		}
		
		// ====================================================
		// Entry(Ű:��)�� Set���·� �̾ƿ���		
		// 1. Entry�� Set���·� �����´�.
		Set<Entry<String, Integer>> entrySet = map.entrySet();
		// 2. Iterator�� ����Ͽ� �ϳ��� �ɰ���.
		Iterator<Entry<String, Integer>> entry = entrySet.iterator();
		// 3. �ϳ��� Entry(key:value)�� ������ Ű�� ���� ���� �����Ѵ�.
		while (entry.hasNext()) {
			Entry<String, Integer> en = entry.next();
			String key = en.getKey();
			int val = en.getValue();
			System.out.println(key + " = " + val);
			
		}
		// ====================================================
		// keySet�� ���� for���� �̿��� ���.
		for(String key : map.keySet()) {
			System.out.println(key + " : " + map.get(key));
		}
	}

}
