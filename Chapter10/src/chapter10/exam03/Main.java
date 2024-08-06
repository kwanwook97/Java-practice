package chapter10.exam03;

public class Main {

	public static void main(String[] args) {
		
		Thread th = null;
		
		th = new WorkThread(); // Thread-0		
		th.setName("첫째 쓰레드");
		th.start();
		
		th = new WorkThread(); // Thread-1
		th.setName("둘째 쓰레드");
		th.start();
		
		th = new WorkThread(); // Thread-2
		th.setName("막내 쓰레드");
		th.start();

	}

}
