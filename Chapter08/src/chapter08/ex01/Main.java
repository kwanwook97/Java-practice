package chapter08.ex01;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		
		// ArrayList ����
//		ArrayList<String> list = new ArrayList<String>(3);   // �ʱⰪ�� ������ �� ������, �Ѿ�� �������. 
		List<String> list = new ArrayList<String>(3); 
		
		// ������ �߰�
		list.add("collection");  // 0�� index�� ����.
		list.add("thread");      // 1�� index�� ����.
		list.add("java IO");     // 2�� index�� ����.
		list.add("network");     // 3�� index�� ����. <- �迭�̿����� ���ܹ߻�.
		list.add(3, "lambda");   // Ư�� index�� �����ؼ� ���� �� �ִ�.
								 // �ش� �ڸ��� ���� index�� ��ĭ�ڷ� �и���.
		System.out.println(list); // println���ε� �� �� �ִ�.		
		
		// length�� �ƴ� list.size()�� ũ�⸦ �� �� �ִ�.
		// list.get�� Ư�� index�� ���� ������ �� �ִ�.
		for(int i=0; i<list.size(); i++) {
			System.out.println("[" + i + "] " + list.get(i));
		}			
		
		// ������ ������ list.remove�� ����Ѵ�.
		String val = list.remove(0);
		System.out.println("���� ���� �� : " + val);
		System.out.println(list);
		
		// ���ڿ��ε� ���������� �� �� �ִ�.
		boolean success = list.remove("network");
		System.out.println("network�� �������� ���� : " + success); // �����޶�� ���� �������� ��� 1���� �����ش�.
		
		// for-each���� ����� ���.
		for(String str : list) {
			System.out.println(str);
		}
		
		// =========================================================
		// �迭�� ArraysŬ������ �޼ҵ带 ����ؾ� �迭�� ���� ����� �� �ִ�.
		String[] arr = new String[2];
		arr[0] = "array";
		arr[1] = "thread";
		System.out.println(Arrays.toString(arr));
		
	}

}
