package chapter07.ex01;

public class ClassCastException {

	public static void main(String[] args) {
		
		// �θ����¿��� ��� ���·� ���ư� �� �߸� ���ư��� ���
		// Object�� Java�� �ֻ��� ��ü�μ� �ȴ��°� ���� ���̴�.
		Object value = 1234; // int -> Object(������)

		// ����� ����ȯ�� ���� �ڽ����·� �ٽ� ���ư���.
		String str = (String)value;			
		
	}

}
