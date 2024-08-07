package chapter10.exam09;

public class StopFlag extends Thread {

	private boolean stop = false;
	
	// 캡슐화를 통해 외부 사용자가 stop에 대해 수정만 가능하도록 제한
	public void setStop(boolean stop) {
		this.stop = stop;
	}

	@Override
	public void run() {
		
		while (!stop) {
			System.out.println("stopFlag 실행 중...");
		}
		
		System.out.println("자원 정리");
		System.out.println("종료");
	}
	
}
