package chapter10.exam10;

public class MainThread {

	public static void main(String[] args) throws InterruptedException {
		
		// 워크스레드는 메인스레드 종료여부와 상관없이 본인의 일을 계속한다. 
		Thread demon = new DemonThread();
		demon.setDaemon(true);      // setDaemon을 통해 워크스레드 -> 데몬스레드 변경.
									// 데몬 스레드는 메인스레드 종료와 함께 종료된다.(Life Cycle이 동일하다.)
		demon.start();		
		
		Thread.sleep(3000);
		
		System.out.println("메인 스레드 종료");
	}

}
