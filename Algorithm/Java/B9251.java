import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

//백준 9251 LCS (dp)

public class B9251 {
	public static char[] first, second;
	public static Integer[][] dp;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		first = br.readLine().toCharArray();
		second = br.readLine().toCharArray();
		dp = new Integer[first.length][second.length];
		
		bw.write(String.valueOf(lcs(first.length-1, second.length-1)));
		bw.flush();
	}
	
	public static int lcs(int x, int y) {
		if(x == -1 || y == -1) {
			return 0;
		}
		
		if(dp[x][y] == null) {
			dp[x][y] = 0;
			
			if(first[x] == second[y]) {
				dp[x][y] = lcs(x-1, y-1) + 1;
			} else {
				dp[x][y] = Math.max(lcs(x-1, y), lcs(x, y-1));
			}
		}
		
		return dp[x][y];
	}
}
