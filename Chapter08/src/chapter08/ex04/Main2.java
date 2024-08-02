package chapter08.ex04;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Main2 {

	public static void main(String[] args) {
		
		Map<String, Integer> map = new HashMap<String, Integer>();
		map.put("��öȣ", 99);    
		map.put("�ڵ���", 80);
		map.put("������", 75);
		map.put("�żֺ�", 43);
		map.put("������", 52);
		map.put("�����", 100);
		map.put("������", 80);
		map.put("��ö��", 99);
		map.put("����ȣ", 87);
		map.put("�ֿ���", 75);
		
		// �ش��ϴ� Ű�� �ִ°�? map.containsKey("Ű");
		// �������� Ű�� �����ϴ��� Ȯ��.			
		if (map.containsKey("������")) {
			System.out.println("�������� Ű�� �����մϴ�.");
		} else {
			System.out.println("�������� Ű�� �������� �ʽ��ϴ�.");
		}
				
		
		// �ش��ϴ� ���� �ִ°�? map.containsValue("��");
		// 99��� ���� �ִ��� Ȯ��.
		if (map.containsValue(99)) {
			System.out.println("99��� ���� �ֽ��ϴ�.");
		} else {
			System.out.println("99��� ���� �����ϴ�.");
		}
		
		// �ش������� �л��� ã�¹��
		// 99���� ���� �л��� �̸��� ���Ͻÿ�.
		String result = "";
		
		// ============================================
		// ��� 1: keySet���� key�� ���� value�� ���Ͽ� ���ϴ� ���.
		// 1. map���� set�� �����Ѵ�.
		for(String st : map.keySet()) {
			if(map.get(st) == 99) {    // ���� 99�� ���
				result += st;          // Ű���� �����ش�.
				System.out.println(result + "�� 99���� ���� �л��Դϴ�.");
				break;                 // �Ѹ� ã�� ��� ȿ������ ���.
			}
		}		
						
		
		// ============================================
		// ��� 2: entrySet���� Value�� ������ ���� key�� �������� ���.
		Set<Entry<String, Integer>> entrySet = map.entrySet();  // Map���� EntrySet�� �����Ѵ�.
		for(Entry<String, Integer> entry : entrySet) {          // forEach�� - Entry�������� �����ϸ� �ݺ�. 
			if(entry.getValue() == 99) {                        // Entry(Ű, ��)�� ���� 99�� value�� �ִٸ�
				String key = entry.getKey();                    // Ű�� �����Ѵ�.
				System.out.println(key + "�� 99���� ���� �л��Դϴ�.");  
				break;
			}
		}
		
		// ============================================
		// ��� 3: 
		Set<String> kset = map.keySet();          // 1. map���� keySet�� �����.
		Iterator<String> iter = kset.iterator();  // 2.keySet�� iterator�� �и��Ѵ�.
		String val = "";
		int ival = 0;
		
		while(iter.hasNext()) {           // ����� ���� �ִٸ� �ݺ�
			val = iter.next();            // Ű
			ival = map.get(val);          // ��
			if(ival == 99) {              // ���� 99�� ���
				System.out.println(val + "�� 99���� ���� �л��Դϴ�.");
				break;                    // �������� ����ϰ� ������ �ּ�ó��!
			}
		}		
	}		
}
