import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

//백준 11053 가장 긴 증가하는 부분수열 (dp)

public class B11053 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int n = Integer.parseInt(br.readLine());
		int[] arr = new int[n];
		int[] dp = new int[n];
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		for(int i = 0; i < n; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		
		for(int i = 0; i < n; i++) {
			dp[i] = 1;
			for(int j = 0; j < i; j++) {
				if(arr[j] < arr[i] && dp[j] >= dp[i]) {
					dp[i] = dp[j] + 1;
				}
			}
		}
		
		int max = -1;
		for(int i = 0; i < n; i++) {
			max = Math.max(max, dp[i]);
		}
		
		bw.write(String.valueOf(max));
		bw.flush();
	}
}
