package chapter01.ex01;

public class StringUtils {

	public static void main(String[] args) {

		String string = "abcdefg";
		
		String strResult;
		int intResult;
		boolean boolResult;
		
		// String���� ��밡���� �޼��� ��..
		
		/*���ڿ� ��*/
		// equals : �� ���ڿ����� ���� ���Ͽ� ������ true, Ʋ���� false��ȯ.
		boolResult = string.equals("abc");
	    System.out.println("�� ���ڴ� ������? " + boolResult);		
		
	    // compareTo : �� ���� ���Ͽ� ���������� ���ٸ� 0�� ��ȯ.
	    // �տ��� ���� Ž���ϴٰ� �ٸ� ���ڸ� �߰��ϸ� ���̸� ����ϰ� �����.
	    // ���� ���� �ٸ��ٸ�, p(112) - j(106) = 6(ASCII)�� ��ȯ�ȴ�.
	    string = "[img]uploadFile.png";
		intResult = string.compareTo("[img]uploadFile.jpg");
		System.out.println("�� ���ڰ� ������? " + intResult);
	    
		// contains : ������ ���ڿ� �ȿ� ������ ���� ���ԵǾ� �ִ��� Ȯ��.
		// true/false�� ��ȯ.
		boolResult = string.contains("png");
		System.out.println("png�� ���ԵǾ� �ִ°�? " + boolResult);		
		
	    /*���ڿ� ��ü*/ 
		// replace : Ư�� ���ڿ��� �߰��ϸ� ������ ���ڿ��� �����Ͽ� ���ο� ������ ��������.
		String newStr = string.replace("png", "mp4");
		System.out.println("���� ���ڿ� : " + string);
		System.out.println("���ο� ���ڿ� : " + newStr);
		
		/*���� ����*/
		string = "my name is kwanwook";
		newStr = string.replace(" ", "");
		System.out.println(string + "=> " + newStr);
		
		// �յ��� ���鸸 ����
		string = " ������ �� ���ٻ� ";
		newStr = string.trim();
		System.out.println(string);
		System.out.println(newStr);
		
		/*���۰� �� üũ*/
		string = "[img]uploadFile.png"; 		
		// Ư�� ���ڿ��� �����ϴ°�?
		boolResult = string.startsWith("[img]");				
		System.out.println("[img] ���ۿ��� : " + boolResult);		
		
		// Ư�� ���ڿ��� �����°�?
		boolResult = string.endsWith(".png");
		System.out.println(".png�� �������� ���� : " + boolResult);
		
		/*�ݺ�*/
		newStr = "*".repeat(4);
		System.out.println("010-1234-" + newStr);								
		
	}

}
