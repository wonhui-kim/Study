import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

//백준 1149 RGB거리 (dp)

public class B1149 {
	public static int[][] cost;
	public static int[][] dp;
	public static final int RED = 0;
	public static final int GREEN = 1;
	public static final int BLUE = 2;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st;
		
		int n = Integer.parseInt(br.readLine()); //집의 수
		cost = new int[n][3];
		for(int i = 0; i < n; i++) {
			st = new StringTokenizer(br.readLine());
				
			cost[i][RED] = Integer.parseInt(st.nextToken());
			cost[i][GREEN] = Integer.parseInt(st.nextToken());
			cost[i][BLUE] = Integer.parseInt(st.nextToken());
		}
		
		dp = new int[n][3];
		dp[0][RED] = cost[0][RED];
		dp[0][GREEN] = cost[0][GREEN];
		dp[0][BLUE] = cost[0][BLUE];
		
		bw.write(String.valueOf(Math.min(paint(n-1, RED), Math.min(paint(n-1, GREEN), paint(n-1, BLUE)))));
		bw.flush();
	}
	public static int paint(int k, int color) {
		if(dp[k][color] == 0) {
			if(color == RED) {
				dp[k][RED] = Math.min(paint(k-1, GREEN), paint(k-1, BLUE)) + cost[k][color];
			}
			else if(color == GREEN) {
				dp[k][GREEN] = Math.min(paint(k-1, RED), paint(k-1, BLUE)) + cost[k][color];
			} else {
				dp[k][BLUE] = Math.min(paint(k-1, RED), paint(k-1, GREEN)) + cost[k][color];
			}
		}
		return dp[k][color];
	}
}
