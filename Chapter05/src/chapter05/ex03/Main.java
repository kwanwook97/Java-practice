package chapter05.ex03;

public class Main {

	public static void main(String[] args) {
		
		MouseEvent mouse = null;
		// �������� �θ�-�ڽ� ���谡 �ƴϰ� �������迡���� ��밡���ϴ�.
		mouse = new Windows();
		mouse.click(1);
		mouse.dblClick(2);
		
		mouse = new Mac();
		mouse.click(0);
		mouse.dblClick(0);
		
		// default �޼��� ���.
		mouse.wheel(1);    
		mouse.wheel(2);
		
		// static �޼��� ���.
		MouseEvent.setDpi(75);
		
		// ���߱����� �������̽��� ��� �������� ����ϸ�
		// �� ������ �������̽��� �޼���(�������̵��� �޼��� ����)�� ��밡���ϴ�.
		KeyEvent key = null;
		mouse = new Windows();
		key = new Windows();
		
	}

}
