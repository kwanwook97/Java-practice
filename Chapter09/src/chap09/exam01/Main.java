package chap09.exam01;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		//Scanner : 사용자로부터 데이터를 입력받는 클래스
		Scanner scan = new Scanner(System.in);
		
		System.out.print("이름>");
		String inputStr = scan.nextLine();
		System.out.println("입력 받은 값 : "+inputStr);
		System.out.println();
		
		System.out.print("나이> ");
		int age = scan.nextInt();
		System.out.println("입력 받은 값 : "+age);
		
	}

}