import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

//백준 2293 동전1 (dp)

public class B2293 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int n = Integer.parseInt(st.nextToken()); //동전 구성
		int k = Integer.parseInt(st.nextToken()); //금액 
		
		int[] coins = new int[n];
		for(int i = 0; i < n; i++) {
			coins[i] = Integer.parseInt(br.readLine());
		}
		
		int[] dp = new int[k+1];
		dp[0] = 1;
		for(int i = 0; i < n; i++) {
			for(int j = coins[i]; j <= k; j++) {
				dp[j] += dp[j - coins[i]];
			}
		}
		bw.write(String.valueOf(dp[k]));
		bw.flush();
	}
}
