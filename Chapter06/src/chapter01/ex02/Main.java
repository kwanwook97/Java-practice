package chapter01.ex02;

public class Main {
	
	public static void main(String[] args) {
		
		// 10문장 이상 더하지 않을경우에는 이경우가 낫다.
		// 사용하기가 편리하다는 장점이 있다.
		String str = "문자열을 ";
		str += "추가하면 ";
		str += "각 객체가 생성된다.";
		System.out.println("Strig : " + str);

		StringBuffer buffer = new StringBuffer("문자열을 ");
		buffer.append("추가하면 ");
		buffer.append("기존 객체의 내용을 바꿔준다.");
		// buffer는 객체이기 때문에 toString으로 문자열로 바꿔준다음 출력하는 것이 좋다.
		System.out.println("StringBuffer : " + buffer);
		
		buffer.reverse();
		System.out.println("StringBuffer : " + buffer);
	}

}
