package chapter08.ex01;

import java.util.ArrayList;
import java.util.List;

public class Main2 {

	public static void main(String[] args) {
		
		List<Integer> score = new ArrayList<Integer>();
		score.add(70);  // index 0
		score.add(80);  // index 1
		score.add(50);  // index 2
		score.add(90);  // index 3
		score.add(100); // index 4
		score.add(90);  // index 5
		
		// ������ ���� - Ư�� �ε����� ���� �����.
		int prev = score.set(3, 95);     // ���� �ѹ� �ǵ��� �� �ִ�!
		System.out.println("���� �� �� : " + prev);
		System.out.println(score);
		
		// Ư�� �� �˻�(���Կ���)		
		System.out.println("95 �ֳ���? " + score.contains(95));
		
		// Ư���� �˻�(index ��ȯ)		
		System.out.println("95�� ��ġ : " +score.indexOf(95));
		
		// ��� ������ ����		
		score.clear();		
		// score�� ������ ���� �ʹٸ�, ���� ��ü�� �ٽ� �����ϴ� ���� ����.
		score = new ArrayList<Integer>();
		
		// �����Ͱ� ���翩��Ȯ��
		System.out.println(score.isEmpty());
		
	}
}
