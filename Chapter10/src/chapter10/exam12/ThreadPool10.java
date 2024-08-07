package chapter10.exam12;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class ThreadPool10 {

	public static void main(String[] args) throws InterruptedException {
		// 1. Thread Pool을 생성한다.
		int n = Runtime.getRuntime().availableProcessors();
		ExecutorService pool = Executors.newFixedThreadPool(n);
		
		// 2. 수행할 작업을 만든다.
		Runnable runn = new Runnable() {
			
			@Override
			public void run() {				
				System.out.println(Thread.currentThread().getName() + " : pool 실행");				
			}
		};
		
		// 3. 작업을 요청한다.
		for(int i=0; i<10; i++) {
			pool.execute(runn); // 빌려달라고 요청
			
		}		
			
		// 4. pool을 종료한다.
		pool.shutdown();
		boolean end = pool.awaitTermination(2L, TimeUnit.SECONDS);		
		
		System.out.println("정상적으로 종료되었는가? " + end);
	}

}
