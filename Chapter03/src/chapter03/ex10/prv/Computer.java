package chapter03.ex10.prv;

public class Computer {
	
	private boolean power;
	private int panSpeed;
	private int temp;
	
	// public �޼��峪 �����ڸ� �̿��ؼ� ����.
	public Computer(boolean b, int i, int j) {
		this.power = b;
		this.panSpeed = i;
		this.temp = j;
		System.out.println(b + " " + (i + j));
	}
	
	
	// alrt + shift + s�� ������ getter/setter�� ������ �� �ִ�.
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
