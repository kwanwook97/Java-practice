package chapter10.exam04;

public class Computer {
	
	private int score = 0;
	
	/* 비동기 방식
	public void setScore(int score) {
		this.score = score;  // 점수를 넣고 => 2초 휴식 => 점수확인
							 // 다른 쓰레드가 들어와서 값을 바꾸고 나가면 데이터간섭이 일어난다.
		try {
			Thread.sleep(2000); // 2초 휴식
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println(Thread.currentThread().getName() + " : " + this.score);
	}
	*/
	
	/* 동기화 메서드 방식 : 메서드 안에 오직하나의 쓰레드만이 들어갈 수 있도록 한다.
	// 나머지는 메서드 밖에 줄 서 있는다.
	// synchronized가 붙으면 이 메서드를 하나의 쓰레드가 사용중 일때 다른 쓰레드가 사용하지 못한다.
	public synchronized void setScore(int score) {
		this.score = score;  
							 
		try {
			Thread.sleep(2000); // 2초 휴식
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println(Thread.currentThread().getName() + " : " + this.score);
	}
	*/
	
	// 동기화블록 방식 : 메서드 안에 여러 쓰레드가 들어갈 수 있으나, 특정영역에는 혼자만 들어갈 수 있다.
	public void setScore(int score) {
		
		synchronized (this) { // 현재 사용중인 객체 = Computer
							  // 두개의 쓰레드가 Computer클래스로 생성한 하나의 객체를 함께 사용하고 있다면
							  // 동기화를 해주는 것.
							  // 만약, Computer클래스로 생성한 모든 객체에 대해 동기화를 해주고 싶다면 .class를 사용한다.
							  // 1. 일반 메소드의 동기화는 이 메소드를 가진 객체를 기준으로 이루어진다.
							  // 2. static 메소드의 동기화는 이 메소드를 가진 클래스의 클래스 객체를 기준으로 이루어진다.
							  // 3. 
			this.score = score;  
			
			try {
				Thread.sleep(2000); // 2초 휴식
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
			System.out.println(Thread.currentThread().getName() + " : " + this.score);			
		}					
	}
	
}
