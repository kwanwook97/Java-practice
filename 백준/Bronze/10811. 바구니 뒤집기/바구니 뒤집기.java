import java.lang.StringBuilder;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main{
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		// 첫번째 줄을 입력받는다.
		// N : 바구니 개수, M : 역순으로 변경할 횟수.
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());

		int i = 0;
		int j = 0;
		int[] arr = new int[n];    // 바구니를 배열로 생성.
		int temp = 0;

		// 배열에 값 넣기
		for(int k=0; k<arr.length; k++) {
			arr[k] = k+1;
		}
		
		// 역순변경 시작.
		for(int a=0; a<m; a++){
			st = new StringTokenizer(br.readLine(), " ");			
			i = Integer.parseInt(st.nextToken())-1;       // i번째부터
			j = Integer.parseInt(st.nextToken())-1;       // j번째까지

			// i부터 j까지 역순으로 교체한다.
			while (i < j) {
				temp = arr[i];
				arr[i++] = arr[j];
				arr[j--] = temp;
			}	
		}
		
		for(int l : arr) {
			sb.append(l).append(" ");
		}
		
        System.out.println(sb);
	}
}
