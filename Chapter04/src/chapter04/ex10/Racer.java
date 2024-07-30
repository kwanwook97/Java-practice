package chapter04.ex10;

public class Racer {
	
	/*	
	public String drive(Benz car) {
		return car.run();
	}
		
	public String drive(Bmw car) {
		return car.run();
	}
	
	public String drive(Audi car) {
		return car.run();
	}
	*/
	
	// Car를 상속받았으면 이 메서드를 다 사용할 수 있다.
	public String drive(Car car) {
		return car.run();
	}
}
