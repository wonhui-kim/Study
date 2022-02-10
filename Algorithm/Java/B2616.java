import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B2616 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		
		int[] train = new int[n+1];
		int[] pSum = new int[n+1];
		
		String[] passenger = br.readLine().split(" ");
		for(int i = 1; i <= n; i++) {
			train[i] = Integer.parseInt(passenger[i-1]);
			pSum[i] = pSum[i-1] + train[i];
			
		}
		
		int max = Integer.parseInt(br.readLine());
		
		int[][] dp = new int[4][n+1];
		for(int i = 1; i <= 3; i++) {
			for(int j = i*max; j <= n; j++) {
				dp[i][j] = Math.max(dp[i][j-1], dp[i-1][j-max]+pSum[j]-pSum[j-max]);
			}
		}
		System.out.print(dp[3][n]);
	}
}
