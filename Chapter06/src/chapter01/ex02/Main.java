package chapter01.ex02;

public class Main {
	
	public static void main(String[] args) {
		
		// 10���� �̻� ������ ������쿡�� �̰�찡 ����.
		// ����ϱⰡ ���ϴٴ� ������ �ִ�.
		String str = "���ڿ��� ";
		str += "�߰��ϸ� ";
		str += "�� ��ü�� �����ȴ�.";
		System.out.println("Strig : " + str);

		StringBuffer buffer = new StringBuffer("���ڿ��� ");
		buffer.append("�߰��ϸ� ");
		buffer.append("���� ��ü�� ������ �ٲ��ش�.");
		// buffer�� ��ü�̱� ������ toString���� ���ڿ��� �ٲ��ش��� ����ϴ� ���� ����.
		System.out.println("StringBuffer : " + buffer);
		
		buffer.reverse();
		System.out.println("StringBuffer : " + buffer);
	}

}
