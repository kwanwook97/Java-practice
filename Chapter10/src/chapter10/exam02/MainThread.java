package chapter10.exam02;

public class MainThread {

	public static void main(String[] args) throws InterruptedException {
		
		// 1. 해야할 일 생성
		Thread thread = new Job();
		// 2. 워크쓰레드 생성 => job자체가 쓰레드이기 때문에 쓰레드를 생성하지 않아도 됨. 
		
		// 3. 워크쓰레드 실행
		thread.start();
		
		for (int i = 0; i <= 5; i++) {
			System.out.println("main thread run...");
			Thread.sleep(500);
		}

	}

}
