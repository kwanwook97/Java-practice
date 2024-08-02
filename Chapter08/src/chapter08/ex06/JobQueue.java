package chapter08.ex06;

import java.util.LinkedList;
import java.util.Queue;

public class JobQueue {
	
	public static void main(String[] args) {
		
		// 큐는 인터페이스이기 때문에 객체를 생성할 때 LinkedList를 사용한다.
		// LinkedList 고유기능은 사용하지 못하고, 큐의 기능만 사용할 수 있게된다.
		Queue<Job> queue = new LinkedList<Job>();
		
		// 큐에 할일을 넣는다.
		queue.offer(new Job("send SMS", "Alice"));
		queue.offer(new Job("send Mail", "Bryan"));
		queue.offer(new Job("send KATALK", "Criss"));
		queue.offer(new Job("send Mail", "Denis"));
		queue.offer(new Job("send SMS", "Erick"));
		
		// Queue는 한명은 일을 쌓고, 한명은 일을 확인하는 경우 사용한다.
		Job job = queue.poll();
		System.out.println(job.getCommand() + " to " + job.getTo() + " size : " + queue.size());
		
		// while을 통해 큐의 모든 내용 꺼내서 출력하기
		while (!queue.isEmpty()) {
			job = queue.poll();
			System.out.println(job.getCommand() + "to " + job.getTo() + "size : " + queue.size());
		}
		
	}

}
