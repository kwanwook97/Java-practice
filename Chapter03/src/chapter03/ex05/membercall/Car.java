package chapter03.ex05.membercall;

public class Car {
	int gear = 0;
	boolean on = false;
	
	public Car() {
		this.gear = 0;
		this.on = false;
	}
	
	void start() {
		if(on == false) {
			on = true;
			System.out.println("시동이 걸렸습니다.");
		}else {
			System.out.println("이미 시동이 걸려있습니다.");
		}
	}
	
	void change(int gear) {
		this.gear = gear;
		System.out.println(this.gear + "단으로 변경되었습니다.");
	}
	
	
		
}
