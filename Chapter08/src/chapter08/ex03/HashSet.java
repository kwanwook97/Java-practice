package chapter08.ex03;

import java.util.Iterator;
import java.util.Set;

public class HashSet {

	public static void main(String[] args) {
		
		// Ŭ���� �̸��� �� ������ϴ� ����		
		// ���� ��üȭ�Ϸ��� Ŭ������ ���� Ŭ������ �̸��� ��ģ�ٸ� Ǯ ��Ű�� ��η� ��üȭ�� ����ȴ�.
		// ������ ����� ���� �ƴ����� �������� �����ʴ�.
		Set<String> set = new java.util.HashSet<String>();
		
		// ������ �߰�
		set.add("JAVA");
		set.add("JSP");
		set.add("DB");
		set.add("SPRING BOOT");
		set.add("JAVA"); // �ߺ�
		System.out.println(set.size());
		System.out.println(set);
		
		Set<Member> member = new java.util.HashSet<Member>();
		member.add(new Member());
		member.add(new Member()); // �ߺ�
		System.out.println(member.size());
		
		// �ϳ��� ������
		// 1. Iterator�� �ϳ��� �ɰ��� ���� �����.
		Iterator<String> iter = set.iterator();
		
		// 2. next()�� �̿��Ͽ� �ϳ��� ������.		
		while(iter.hasNext()) {
			String item = iter.next();
			System.out.println(item);
		}
		
		// ������ ����(index�� ���� ������ ���� �����θ� ������ �Ѵ�.
		set.remove("DB");
		System.out.println();
		for(String item : set) {
			System.out.println("���� for : " + item);
		}
		
		// clear() / isEmpty
		if(!set.isEmpty()) {
			set.clear();
		}
		
		System.out.println(set);
	}
}

class Member{}