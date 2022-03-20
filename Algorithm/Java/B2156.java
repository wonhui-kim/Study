import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

//백준 2156 포도주 시식 (dp)

public class B2156 {
	public static int[] arr;
	public static Integer[] dp;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int n = Integer.parseInt(br.readLine());
		arr = new int[n+1];
		for(int i = 1; i <= n; i++) {
			arr[i] = Integer.parseInt(br.readLine());
		}
		
		dp = new Integer[n+1];
		dp[0] = 0;
		dp[1] = arr[1];
		if(n > 1) {
			dp[2] = arr[1] + arr[2];
		}
		
		bw.write(String.valueOf(recur(n)));
		bw.flush();
	}
	
	public static int recur(int n) {
		if(dp[n] == null) {
			dp[n] = Math.max(recur(n-1), Math.max(recur(n-2), recur(n-3)+arr[n-1])+arr[n]);
		}
		return dp[n];
	}
}
