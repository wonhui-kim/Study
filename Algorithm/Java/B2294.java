import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

//백준 2294 동전2 (dp)

public class B2294 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int n = Integer.parseInt(st.nextToken());
		int k = Integer.parseInt(st.nextToken());
		
		int[] coins = new int[n];
		for(int i = 0; i < n; i++) {
			coins[i] = Integer.parseInt(br.readLine());
		}
		
		int[] dp = new int[k+1];

		for(int i = 1; i <= k; i++) {
			dp[i] = Integer.MAX_VALUE-1; //?왜 -1
		}
		
		for(int i = 0; i < n; i++) {
			for(int j = coins[i]; j <= k; j++) {
				dp[j] = Math.min(dp[j], dp[j-coins[i]]+1);
			}
		}
		
		if(dp[k] == Integer.MAX_VALUE-1) {
			bw.write(String.valueOf(-1));
		} else {
			bw.write(String.valueOf(dp[k]));
		}
		bw.flush();
	}
}
