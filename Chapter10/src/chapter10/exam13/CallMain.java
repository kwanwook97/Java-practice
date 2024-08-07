package chapter10.exam13;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class CallMain {

	public static void main(String[] args) throws InterruptedException, ExecutionException {

		// 1. 대여소 세우기
		int n = Runtime.getRuntime().availableProcessors();
		ExecutorService pool = Executors.newFixedThreadPool(n);
		
		// 2. Callable로 작업 요청서 만들기 (1~100까지 더한 합을 반환하는 작업)				
		Callable<Integer> call = new Callable<Integer>() {
			
			@Override
			public Integer call() throws Exception {
				int sum = 0;
				for (int i = 1; i <= 100; i++) {
					sum += i;
					
				}
				System.out.println(sum);
				return sum;
			}
		};
		
		// 3. 작업 요청하기(대여)
		// call의 작업을 완료하고 submit에반환받아야 다음이 수행된다? 
		Future<Integer> f = pool.submit(call);
		System.out.println("1~100까지의 합은 : " + f.get());		
		
		// 4. 1초 기다렸다가 문닫기
		pool.shutdown();
		
	}
}
