package chapter04.ex04;

public class MyCar extends ParentCar {

	public boolean turbo = false;
	
	// �Ϻθ� ����(��쿡 ���� �θ� �޼��带 �״�� ���.)
	// ������� �θ������ �״�� ����Ѵ�.
	// public int run(boolean turbo){  �̷��� �ȵ�.
	
	@Override
	public int run() {
		
		if(turbo == true) {
			return 200;           // 200km
		}else {
			return super.run();   // 60km
		}
		
	}	
	
	/* Override (alrt + shift + s) ����.
	�θ��� run�޼��带 �����⸸ ���ΰ� ������ �ٲ㼭 ���.
	
	@Override
	public int run() {
		return 200;
	}
	*/
}
