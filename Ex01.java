public class Ex01 {
// 1) 정수 num1과 num2가 매개변수로 주어졌을 때, 같으면 1 다르면 -1을 return하도록 함수 작성하기.
	int solution(int num1, int num2) {
	    int answer = 0;
	    if(num1 == num2){
	        answer = 1;  
	    } else {
	        answer = -1;
	    }
	    return answer;
	}
// 또는
	int solution(int num1, int num2) {
	    int answer = 0;
	    answer = num1 == num2 ? 1 : -1;
	    return answer;
	}

// 2) 양꼬치 가게에서 양꼬치를 10인분을 먹으면 음료수 1개를 서비스로 줄 때  양꼬치 n개와 음료수 k개를 먹었다면, 총 얼마를 지불해야 하는지 return하도록 함수완성하기.
// (양꼬치는 1인분에 12,000원 음료수는 2,000원)
	int solution(int n, int k) {
	    int answer = 0;
	    int service = n / 10;
	    answer = n * 12000 + (k - service) * 2000;
	    return answer;
    }
}
