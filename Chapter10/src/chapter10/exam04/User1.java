package chapter10.exam04;

public class User1 extends Thread {
	
	private Computer com;
	
	public User1(Computer com) {
		setName("user 1");
		this.com = com;
	}
	
	@Override
	public void run() {
		// user1은 받아온 컴퓨터를 가지고 게임해서 500점을 만들어 놓는다.
		com.setScore(500);
	}

}
