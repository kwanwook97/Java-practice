package chapter08.ex06;

public class Job {
	// Queue는 FIFO구조로 먼저 넣은 값이 먼저 나오는 구조이다.
	// 큐는 LinkedList와 비슷한 구조로 되어있다.
	// 데이터는 offer로 넣고 poll로 빼낸다.
	
	private String command = "";
	private String to;
	
	public Job(String command, String to) {
		this.command = command;
		this.to = to;
	}
	
	public String getCommand() {
		return command;
	}
	
	public String getTo() {
		return to;
	}

}
