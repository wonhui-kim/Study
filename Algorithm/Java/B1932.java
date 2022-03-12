import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

//백준 1932 정수삼각형 (dp)

public class B1932 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st;
		
		int n = Integer.parseInt(br.readLine());
		int[][] triangle = new int[n][n];
		for(int i = 0; i < n; i++) {
			st = new StringTokenizer(br.readLine());
			for(int j = 0; j <= i; j++) {
				triangle[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		int[][] dp = new int[n][n];
		for(int j = 0; j < n; j++) {
			dp[0][j] = triangle[n-1][j];
		}
		
		for(int i = 1; i < n; i++) {
			for(int j = 0; j < n-i; j++) {
				dp[i][j] = Math.max(dp[i-1][j], dp[i-1][j+1]) + triangle[n-i-1][j];
			}
		}
		
		bw.write(String.valueOf(dp[n-1][0]));
		bw.flush();
	}
}
