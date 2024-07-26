package ex02;

import java.util.List;

public class InOut {

	public static void main(String[] args) {
		// 10개짜리 배열생성.
		int[] score = new int[10];
		
		// 넣기
		// 0번 방에 10넣기
		score[0] = 10;  // 방번호를 지정후 넣어야 한다.
		
		// 1번 방에 50넣기
		score[1] = 50;
		
		// 2번 방에 70넣기
		score[2] = 70;
		
		// 크기확인
		int len = score.length;
		System.out.println("배열의 길이 : " + len);

		int sum = 0;
		
		// 0~9번방에 10~100까지의 값을 넣기.
		for (int i = 0; i < score.length; i++) {
			sum += 10;
			score[i] = sum;
			System.out.println(i + "번방의 값 : "+ score[i]);			
		}
		
	}
}

//
//ArrayList<String> list = new ArrayList<String>();
//List.add("apple");
//List.add("banana");
//
//for (String str : list){         
//	
//}
//
//
//for (String str:list){           
//    System.out.println(str);
//} // 중복 가능
//
//System.out.println(list.get(0)); // 순서(인덱스) 있음
//System.out.println(list.get(list.size()-1)); // 맨 끝 원소 가져오기
//
//System.out.println("----"); // 구분선
//
//list.remove(3); // 원소 제거
//list.set(1, "orange"); // 원소 수정(수정할 원소의 인덱스, 수정할 값)
//
//for (String str:list){
//    System.out.println(str);
//}
//









