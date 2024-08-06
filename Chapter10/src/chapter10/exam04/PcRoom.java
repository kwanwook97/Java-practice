package chapter10.exam04;

public class PcRoom {

	public static void main(String[] args) {
		
		// 1. 컴퓨터를 1대 준비
		Computer com = new Computer();
		
		// 2. User1과 User2를 불러 컴퓨터를 사용하라고 한다.		
		// 하나의 컴퓨터 객체를 두개의 쓰레드가 함께 사용하는 Case이므로
		// 동기화가 되어있지 않으면, 데이터간섭이 일어날 수있다.
		User1 user1 = new User1(com);
		user1.start(); // 500
		User2 user2 = new User2(com);
		user2.start(); // 100

	}

}
