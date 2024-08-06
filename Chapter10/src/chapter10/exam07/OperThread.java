package chapter10.exam07;

public class OperThread extends Thread {
	
	private int sum;
	
	// 캡슐화를 통해서 외부에서 sum에 대한 값을 건드리지 못하게하고
	// 오직 볼 수 있는 메소드만 열어주었다.
	public int getSum() {
		return sum;
	}
	
	@Override
	public void run() {
		for(int i=1; i<=100; i++) {
			sum += i;
		}
	}

}
