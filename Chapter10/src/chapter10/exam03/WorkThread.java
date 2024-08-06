package chapter10.exam03;

public class WorkThread extends Thread {

	@Override
	public void run() {
		for (int i = 0; i <= 5; i++) {			
			System.out.println(getName() + "thread가 출력한 내용.");
			// 원래는 Thread.getName()을 사용해야하지만, 상속받았기 때문에 getName()을 바로사용.
			
		}
	}
	
}
