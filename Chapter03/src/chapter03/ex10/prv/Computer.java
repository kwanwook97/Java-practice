package chapter03.ex10.prv;

public class Computer {
	
	private boolean power;
	private int panSpeed;
	private int temp;
	
	// public 메서드나 생성자를 이용해서 접근.
	public Computer(boolean b, int i, int j) {
		this.power = b;
		this.panSpeed = i;
		this.temp = j;
		System.out.println(b + " " + (i + j));
	}
	
	
	// alrt + shift + s를 눌러서 getter/setter를 생성할 수 있다.
	public boolean getComP() {
		return power;
	}
	
	public int getComPS() {
		return panSpeed;
	}
	
	public int getCompT() {
		return temp;
	}
	
}
