package chapter08.ex01;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main3 {

	public static void main(String[] args) {

		// List�� Array�� ����ϴ�. 
		// �迭�� List�� �ٲٴ� ���.
		
		String[] arr = {"List", "Set", "Map"};
		
		// 1. Array -> List(Interface) 
		List<String> list = Arrays.asList(arr); // �̶�, �迭�� ������Ÿ���� Ŭ�������¿��� �Ѵ�.		
		System.out.println(list.size());
		System.out.println(list.get(1));
		list.set(2, "HashMap");
//		list.add("test");         // ���� �迭�� ���¸� ��� ���� �ƴϹǷ� �߰��� �ȵȴ�.
		
		// 2. ��¥ ArrayList�� ��ȯ�ؾ� �Ѵ�.
		// List���� ArrayList�� �ִ¹��.
		ArrayList<String> arrList = new ArrayList<String>();
		arrList.addAll(list);
		arrList.add("collection");
		System.out.println(arrList);
		
	}

}
