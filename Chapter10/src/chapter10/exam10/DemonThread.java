package chapter10.exam10;

public class DemonThread extends Thread {

	@Override
	public void run() {
		
		try {
			while (true) {
				Thread.sleep(500);
				System.out.println("work스레드 실행중");
				
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
	}
	
	
}
