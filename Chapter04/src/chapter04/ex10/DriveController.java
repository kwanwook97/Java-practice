package chapter04.ex10;

public class DriveController {
	
	public static void main(String[] args) {
		
		// 1. 레이서 섭외
		Racer racer = new Racer();		
		
		// 2. 차량준비
		// 3. 레이스 시작
		Car car = null;
		car = new Audi();
		System.out.println(racer.drive(car));
		
		car = new Benz();
		System.out.println(racer.drive(car));
		
		car = new Bmw();
		System.out.println(racer.drive(car));
		
	}
}
