package chapter05.ex03;

// interface는 상속(extends)이아닌 구현(implements)을 받는다.
public class Windows implements MouseEvent, KeyEvent {
	
	// MouseEvent로 부터 강제 오버라이드 된 메서드들.
	@Override
	public void click(int btn) {
		System.out.println(btn + "번 버튼 클릭");

	}

	@Override
	public void dblClick(int btn) {
		System.out.println(btn + "번 버튼 더블클릭");

	}

	@Override
	public double[] move() {
		
		return null;
	}

	// KeyEvent로 부터 강제 오버라이드 된 메서드들.
	@Override
	public void keyDown(int key) {
		System.out.println(key + "번 키를 눌렀다.");
		
	}

	@Override
	public void keyUp(int key) {
		System.out.println(key + "번 키를 땠다.");
		
	}
	
	
}
