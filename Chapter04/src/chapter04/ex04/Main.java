package chapter04.ex04;

public class Main {

	public static void main(String[] args) {
		MyCar car = new MyCar();
		car.start();
		System.out.println(car.run() + "km�� �޸���.");
		
		car.turbo = true;
		System.out.println(car.run() + "km�� �޸���.");
		
		car.stop();

	}

}
