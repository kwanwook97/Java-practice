package chapter10.exam13;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class RunMain {

	public static void main(String[] args) throws InterruptedException, ExecutionException {
		
		int n = Runtime.getRuntime().availableProcessors();
		ExecutorService pool = Executors.newFixedThreadPool(n);
		
		Runnable run = new Runnable() {
			
			@Override
			public void run() {
				
				try {
					for (int i = 1; i <= 10; i++) {
						System.out.println("작업 처리중 : " + i);
						Thread.sleep(500);
					}					
					
				} catch (Exception e) {
					System.out.println("예외 발생으로 빠져나옴");
				}
				
			}
		};		
		
//		Future<Integer> f = (Future<Integer>) pool.submit(run);
		
		// <?>는 와일드카드라고 하며, 어떤 객체를 받을지 모른다는 뜻이다.
		Future<?> f = pool.submit(run);
		f.get();    // Join과 같이 blocking을 수행해준다.
		
		/* Runnable로 구현한 내용도 blocking을 하고 싶을 수 있어서
		 * execute()뿐만 아니라 submit()도 사용할 수 있게 해준 것.
		 */
		
		System.out.println("=====작업 종료=====");		
		pool.shutdown();
		
	}

}
