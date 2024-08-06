package chapter10.exam02;

//익명 객체를 사용한 방법
public class AnnonyMain {

	public static void main(String[] args) throws InterruptedException {
		
		// 1. 해야할 일 생성 (상속받는 익명객체 만들기 : 자동완성이 안된다.)
		Thread thread = new Thread() {

			@Override
			public void run() {
				for (int i = 0; i <= 5; i++) {
					System.out.println("work thread run...");
					try {
						Thread.sleep(500);
					} catch (Exception e) {
						e.printStackTrace();
					}
				}
			}
			
		};
		// 2. 워크쓰레드 생성 => job자체가 쓰레드이기 때문에 쓰레드를 생성하지 않아도 됨. 
		
		// 3. 워크쓰레드 실행
		thread.start();
		
		/*main thread*/
		for (int i = 1; i <= 5; i++) {
			System.out.println("main thread run...");
			Thread.sleep(500); // 쓰레드에게 0.5초 쉬라는 의미
		}
		
	}

}
