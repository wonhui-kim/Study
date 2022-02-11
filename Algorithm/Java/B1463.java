import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

//백준 1463 1로만들기 (dp)

public class B1463 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int n = Integer.parseInt(br.readLine());
		int[] dp = new int[n+1];
		
		dp[0] = dp[1] = 0;
		
		for(int i = 2; i <= n; i++) {
			dp[i] = dp[i-1] + 1;
			if(i%2==0) {
				dp[i] = Math.min(dp[i], dp[i/2]+1);
			}
			if(i%3==0) {
				dp[i] = Math.min(dp[i], dp[i/3]+1);
			}
		}
		
		bw.write(String.valueOf(dp[n]));
//		bw.write(String.valueOf(solution(n)));
		bw.flush();
	}
	
//	public static int solution(int n) {		
//		if(n == 0 || n == 1) {
//			return 0;
//		}
//		if(dp[n] > 0) {
//			return dp[n];
//		}
//		dp[n] = solution(n-1) + 1; //ex)dp[10] = dp[9]+1
//		if(n%3 == 0) {
//			dp[n] = Math.min(dp[n], solution(n/3)+1); //ex)dp[9] = dp[3]+1 (횟수)
//		}
//		if(n%2 == 0) {
//			dp[n] = Math.min(dp[n], solution(n/2)+1);
//		}
//		
//		return dp[n];
//	}
}
