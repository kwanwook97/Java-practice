package chapter08.ex02;

import java.util.ArrayList;
import java.util.LinkedList;

public class Main {

	public static void main(String[] args) {
		// 1. ��������
		ArrayList<String> arr = new ArrayList<String>();
		LinkedList<String> lnk = new LinkedList<String>();
		
		// 2. ���(����)�غ�
		for(int i=1; i<=100; i++) {
			arr.add("data");
			lnk.add("data");
		}

		long startTime = 0;
		long endTime = 0;
		
		// 3. A���(�ð�)	
		startTime = System.currentTimeMillis();
		
		// ====[A �޸��� ����]======================================================
		// 4. A�޸���		
		for(int i=1; i<=100000; i++) {         // 1�ʺ��� 10���ʱ���
			arr.add(55, "add data");
		}
		// 5. A����(�ð�)
		endTime = System.currentTimeMillis();
		// 6. ���(�����ð�-��߽ð�)
		System.out.println("ArrayList ��� : " + (endTime-startTime) + "ms");
		
		// ====[B �޸��� ����]======================================================
		// 3. B���(�ð�)
		startTime = System.currentTimeMillis();
		// 4. B�޸���
		for(int i=1; i<=100000; i++) {         // 1�ʺ��� 10���ʱ���
			lnk.add(55, "add data");
		}
		// 5. B����(�ð�)		
		endTime = System.currentTimeMillis();
		// 6. ���(�����ð�-��߽ð�)
		System.out.println("LinkedList ��� : " + (endTime-startTime) + "ms");
	}

}
