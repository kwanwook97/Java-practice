package chapter10.exam05;

public class WorkThread extends Thread {

	@Override
	public void run() {

		long cnt = 0;

		// 실행
		for (int i = 1; i < 100000000; i++) {
			cnt++;
		} // (스레드 STATUS : RUNNABLE)

		try {
			Thread.sleep(1500); // 1.5초 정지 (스레드 STATUS : TIMED WATING)
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		cnt = 0; // 실행
		for (int i = 1; i < 100000000; i++) {
			cnt++;
		} // (스레드 STATUS : RUNNABLE)
		  // 실행하고 나서 STATUS : RUNNABLE이 바로 찍힌다.
	}     // (스레드 STATUS : TERMINATED)
}
