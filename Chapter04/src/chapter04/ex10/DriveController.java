package chapter04.ex10;

public class DriveController {
	
	public static void main(String[] args) {
		
		// 1. ���̼� ����
		Racer racer = new Racer();		
		
		// 2. �����غ�
		// 3. ���̽� ����
		Car car = null;
		car = new Audi();
		System.out.println(racer.drive(car));
		
		car = new Benz();
		System.out.println(racer.drive(car));
		
		car = new Bmw();
		System.out.println(racer.drive(car));
		
	}
}
