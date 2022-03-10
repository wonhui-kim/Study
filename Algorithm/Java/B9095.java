import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

//백준 9095 1,2,3더하기 (dp)

public class B9095 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int t = Integer.parseInt(br.readLine());
		
		int[] dp = new int[11];
		dp[1] = 1;
		dp[2] = 2;
		dp[3] = 4;
		for(int j = 4; j <= 10; j++) {
			dp[j] = dp[j-1] + dp[j-2] + dp[j-3];
		}
		
		StringBuilder sb = new StringBuilder();
		for(int i = 0; i < t; i++) {
			int n = Integer.parseInt(br.readLine());
			sb.append(dp[n]).append('\n');
		}
		
		bw.write(sb.toString());
		bw.flush();
	}
}
