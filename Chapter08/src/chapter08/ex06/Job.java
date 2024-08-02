package chapter08.ex06;

public class Job {
	// Queue�� FIFO������ ���� ���� ���� ���� ������ �����̴�.
	// ť�� LinkedList�� ����� ������ �Ǿ��ִ�.
	// �����ʹ� offer�� �ְ� poll�� ������.
	
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
