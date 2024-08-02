package chapter08.ex06;

import java.util.LinkedList;
import java.util.Queue;

public class JobQueue {
	
	public static void main(String[] args) {
		
		// ť�� �������̽��̱� ������ ��ü�� ������ �� LinkedList�� ����Ѵ�.
		// LinkedList ��������� ������� ���ϰ�, ť�� ��ɸ� ����� �� �ְԵȴ�.
		Queue<Job> queue = new LinkedList<Job>();
		
		// ť�� ������ �ִ´�.
		queue.offer(new Job("send SMS", "Alice"));
		queue.offer(new Job("send Mail", "Bryan"));
		queue.offer(new Job("send KATALK", "Criss"));
		queue.offer(new Job("send Mail", "Denis"));
		queue.offer(new Job("send SMS", "Erick"));
		
		// Queue�� �Ѹ��� ���� �װ�, �Ѹ��� ���� Ȯ���ϴ� ��� ����Ѵ�.
		Job job = queue.poll();
		System.out.println(job.getCommand() + " to " + job.getTo() + " size : " + queue.size());
		
		// while�� ���� ť�� ��� ���� ������ ����ϱ�
		while (!queue.isEmpty()) {
			job = queue.poll();
			System.out.println(job.getCommand() + "to " + job.getTo() + "size : " + queue.size());
		}
		
	}

}
