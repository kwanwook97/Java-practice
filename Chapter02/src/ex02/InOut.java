package ex02;

import java.util.List;

public class InOut {

	public static void main(String[] args) {
		// 10��¥�� �迭����.
		int[] score = new int[10];
		
		// �ֱ�
		// 0�� �濡 10�ֱ�
		score[0] = 10;  // ���ȣ�� ������ �־�� �Ѵ�.
		
		// 1�� �濡 50�ֱ�
		score[1] = 50;
		
		// 2�� �濡 70�ֱ�
		score[2] = 70;
		
		// ũ��Ȯ��
		int len = score.length;
		System.out.println("�迭�� ���� : " + len);

		int sum = 0;
		
		// 0~9���濡 10~100������ ���� �ֱ�.
		for (int i = 0; i < score.length; i++) {
			sum += 10;
			score[i] = sum;
			System.out.println(i + "������ �� : "+ score[i]);			
		}
		
	}
}

//
//ArrayList<String> list = new ArrayList<String>();
//List.add("apple");
//List.add("banana");
//
//for (String str : list){         
//	
//}
//
//
//for (String str:list){           
//    System.out.println(str);
//} // �ߺ� ����
//
//System.out.println(list.get(0)); // ����(�ε���) ����
//System.out.println(list.get(list.size()-1)); // �� �� ���� ��������
//
//System.out.println("----"); // ���м�
//
//list.remove(3); // ���� ����
//list.set(1, "orange"); // ���� ����(������ ������ �ε���, ������ ��)
//
//for (String str:list){
//    System.out.println(str);
//}
//









