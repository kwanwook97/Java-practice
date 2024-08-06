package chapter10.exam01;

// 익명 객체를 사용한 방법
public class Annony {

	public static void main(String[] args) throws InterruptedException {
		
		// 1. 해야할 일 생성
		Runnable run = new Runnable() {
			
			@Override
			public void run() {
				for (int i = 0; i <= 5; i++) {
					System.out.println("워크 쓰레드가 돌고 있다.");
												
					try {
						Thread.sleep(500);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
			}
		};
		
		// 2. 워크쓰레드 생성
		Thread work = new Thread(run);
		// 3. 쓰레드 실행
		work.start();
				
		/*main thread*/
		for (int i = 1; i <= 5; i++) {
			System.out.println("메인 쓰레드가 돌아가고 있었다.");
			Thread.sleep(500); // 쓰레드에게 0.5초 쉬라는 의미
		}
	}
}
