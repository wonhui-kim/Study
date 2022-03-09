import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;

public class B2839 {
	public static final int Max = 100000;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	
		int n = Integer.parseInt(br.readLine());
		int[] dp = new int[n+1];
		Arrays.fill(dp, Max);
		
		if(n >= 3) {
			dp[3] = 1;
		}
		if(n >= 5) {
			dp[5] = 1;
		}
		
		for(int i = 6; i <= n; i++) {
			dp[i] = Math.min(dp[i-3]+1, dp[i-5]+1);
		}
		
		for(int i = 0; i <= n; i++) {
			if(dp[i] >= Max) {
				dp[i] = -1;
			}
		}
		
		bw.write(String.valueOf(dp[n]));
		bw.flush();
	}
}
