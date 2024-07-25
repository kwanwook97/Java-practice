package Ex01;

public class StmtWhile {

//	public static void main(String[] args) {
//		
//		int cup = 1;
//		
//		while (true) {  // 조건이 참이면 while은 계속 반복한다.
//			System.out.println(cup + "잔 떠오기");
//			cup++;
//			if (cup > 10) {
//				break;
//			}
//		}
//		// unreachable code : 위 while문이 문한으로 반복되기 때문에 아래 코드까지 닿을수 없다는 뜻.
//		// 해결방법 1 : 아래코드를 지운다.
//		// 해결방법 2 : 위 반복문이 끝날수 있는 조건을 정해준다.
//		cup = 1;
//		System.out.println("다 떠왔습니다.");
//		
//	}
	
	public static void main(String[] args) {
		int cnt = 10;
		// while : 조건체크 -> 반복실행.
		while (cnt<10) { // cnt가 10보다 작은지 확인.
			cnt++; // 증가
		}
		System.out.println("while cnt : " + cnt);
		
		//do while : 일단실행 -> 조건체크
		cnt = 10;
		do {
			cnt++;
		} while (cnt<10);
		System.out.println("do while cnt : " + cnt);
		// while과 do while은 조건이 부합할 때는 같은 결과를 낸다.
		// 하지만 조건이 맞지않는 경우 다른결과를 낸다.
		// 예 : 선불제 버스와 후불제 버스의 차이.
	}
}















