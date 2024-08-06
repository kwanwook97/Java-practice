package chapter10.exam06;

public class Main {

	public static void main(String[] args) throws InterruptedException {
		/* 양보를 통해 실행순서가 변경되기도 하지만,
		 * 그 기회를 상대 스레드가 잡지 못하면 자신이 실행하게 된다.
		 */
		WorkThread th = new WorkThread();
		th.setName("thread A");
		th.start();
		
		WorkThread th2 = new WorkThread();
		th2.setName("thread B");
		th2.start();
		
		th.yield = true; // A에게 양보하라고 한다.
		Thread.sleep(500); // 0.5초 후에...
		
		th2.yield = true; // B에게 양보하라고 한다.
		th.yield = false;
		Thread.sleep(500); // 0.5초 후에...
		
		th.stop = true;
		th2.stop = true;
	}

}
