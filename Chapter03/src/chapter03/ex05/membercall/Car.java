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
			System.out.println("�õ��� �ɷȽ��ϴ�.");
		}else {
			System.out.println("�̹� �õ��� �ɷ��ֽ��ϴ�.");
		}
	}
	
	void change(int gear) {
		this.gear = gear;
		System.out.println(this.gear + "������ ����Ǿ����ϴ�.");
	}
	
	
		
}
