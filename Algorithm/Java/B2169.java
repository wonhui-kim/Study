import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class B2169 {
	public static int n, m;
	public static int[][] matrix;
	public static int[][] dp;
	public static int[][] temp;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		n = Integer.parseInt(st.nextToken());
		m = Integer.parseInt(st.nextToken());
		
		matrix = new int[n+1][m+1];
		for(int i = 1; i <= n; i++) {
			st = new StringTokenizer(br.readLine());
			for(int j = 1; j <= m; j++) {
				matrix[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		
		dp = new int[n+1][m+1];
		dp[1][1] = matrix[1][1]; //ÃÊ±âÈ­
		for(int j = 2; j <= m; j++) {
			dp[1][j] = matrix[1][j] + dp[1][j-1];
		}
		
		temp = new int[2][m+2];
		for(int i = 2; i <= n; i++) {
			temp[0][0] = dp[i-1][1];
			for(int j = 1; j <= m; j++) {
				temp[0][j] = Math.max(temp[0][j-1], dp[i-1][j]) + matrix[i][j];
			}
			temp[1][m+1] = dp[i-1][m];
			for(int j = m; j >= 1; j--) {
				temp[1][j] = Math.max(temp[1][j+1], dp[i-1][j]) + matrix[i][j];
			}
			for(int j = 1; j <= m; j++) {
				dp[i][j] = Math.max(temp[0][j], temp[1][j]);
			}
		}
		
		bw.write(String.valueOf(dp[n][m]));
		bw.flush();		
	}
	
	public static void print(int[][] arr, int n, int m) {
		for(int i = 0; i <= n; i++) {
			for(int j = 0; j <= m; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
	}
}
