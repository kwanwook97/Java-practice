package chapter03.ex04.smember;

public class Main {

	public static void main(String[] args) {

		// �Ϲݸ������ ��üȭ�ؼ� ����Ѵ�.
		Sub sb = new Sub();
		
		System.out.println(Sub.plus(1, 2));
		System.out.println(Sub.minus(3, 4));
		
		// static����� ��üȭ�ؼ� ������� �ʴ´�.
		System.out.println(sb.multi(5, 6));
		
		// static����� ��� ����ϳ�?
		// �������� ���� �����´�.
		System.out.println(Sub.sField);
		System.out.println(Sub.plus(5, 4));
		System.out.println(Sub.minus(6, 3));
		
		// ����� ��ü������ �ҷ��� ���� �ִ�.
		// ������� �Ǽ��� �����ϴ� �κ��̶� ����� ������ ��� �Ѵ�.
		// ��ü�� ���� ������ ã�Ƽ� ���������� �����ϴ� ���̶� ȿ������ ��������.
		System.out.println(sb.sField);
		System.out.println(sb.plus(1, 2));
		System.out.println(sb.minus(4, 3));
		
		// static�� �Ϲݺ����� ����.
		Sub sb2 = new Sub();
		
		// �Ϲ��ʵ�� ��� �Ѱ����� �����ص� �ٸ��ʿ� ������ ���� �ʴ´�.
		sb2.field = 1000;
		System.out.println("sub.field = " + sb.field);
		System.out.println("sub.field = " + sb2.field);
		
		// ����ƽ �ʵ�� �ش簴ü�� ������ �ǵ帮�Ƿ� ��ο��� ������ �ش�.
		sb2.sField = 3000;
		System.out.println("sub.field = " + sb.sField);
		System.out.println("sub.field = " + sb2.sField);

		
	}

}
