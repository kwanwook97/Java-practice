package chapter07.ex03;

public class Main {
	
	// JVM에게 던진다.
	public static void main(String[] args) throws Exception{
		
		Sub sub = new Sub();
		// method1에게 일을 시킨다.
		sub.method1();
		
//		try {
//			sub.method1();
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
						
	}
}
