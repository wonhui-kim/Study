import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

//백준 2798 블랙잭 (brute force) 2

public class BA2798 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		int[] card = new int[n];
		
		String[] temp = br.readLine().split(" ");
		for(int i = 0; i < n; i++) {
			card[i] = Integer.parseInt(temp[i]);
		}
		
		int result = sum(card, n, m);
		
		System.out.print(result);				
	}	
	
	public static int sum(int card[], int n, int m) {
		int result = 0;
		
		for(int i = 0; i < n-2; i++) { //첫번째 카드
			for(int j = i+1; j < n-1; j++) {
				for(int k = j+1; k < n; k++) {
					int sum = card[i] + card[j] + card[k];
					if(sum == m) {
						result = sum;
					}
					if(result < sum && sum < m) {
						result = sum;
					}
				}
			}
		}
		
		return result;
	}
}
