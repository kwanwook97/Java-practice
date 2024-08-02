package chapter08.ex05;

import java.util.Stack;

public class TowelBox {	
	public static void main(String[] args) {
		
		// Stack��ü���� - Towel��ü���� �Է¹޵��� �Ѵ�.
		Stack<Towel> box = new Stack<Towel>();
		
		// ���ǳֱ� - stack�� ���� �������� -push()�� ����Ѵ�.
		box.push(new Towel("red"));
		box.push(new Towel("orange"));
		box.push(new Towel("yello"));
		box.push(new Towel("green"));
		box.push(new Towel("blue"));
		box.push(new Towel("navy"));
		box.push(new Towel("purple"));
		
		// ������ ���徿 ������.
		Towel t = box.pop();                                                   // stack���� pop�� ���� Towel��ü�� �����µ�		
		System.out.println(t.getColor() + "���� ����, " + box.size() + "�� ����"); // Towel��ü�� getColor�޼��带 ���.
		// ���� ������ '�޼��� ü�̴�'�� �� �ִ�.(������ ������ ��ü�� �߰������� ���𰡸� �� �� �ִ� ��.)
		System.out.println(box.pop().getColor() + "���� ����, " + box.size() + "�� ����");
		// peek�� ���� ������ ���� �ƴ϶�, �ٽ� ����ִ´�.
		System.out.println(box.peek().getColor() + "���� ����, " + box.size() + "�� ����");
		
		// ������ 5���� ��� ��������
		// ���� for�� pop()�� ������� �ʱ� ������ ���������� ������ �ȴ�. (�߿�!)
		while(!box.isEmpty()) {      // isEmpty()��� 'size() > 0'�� ��밡��.
			System.out.println(box.pop().getColor() + "���� ����, " + box.size() + "�� ����");
		}		
				
	}
	
}
