package chapter10.exam09;

public class Main {

	public static void main(String[] args) throws InterruptedException {
		
		StopFlag flag = new StopFlag();
		
		flag.start();
		Thread.sleep(500); // 1초 후
		flag.setStop(true); // stop플래그 true로 변경
		
		Inter inter = new Inter();
		inter.start();
		Thread.sleep(500);
		inter.interrupt();  // 강제로 인터럽트를 걸어준다.
		
	}

}
