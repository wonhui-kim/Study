import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

//백준 2208 보석 줍기

public class B2208 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken()); //보석 개수
		int m = Integer.parseInt(st.nextToken()); //연속 최소 개수
		
		int[] arr = new int[n];
		int[] dp = new int[n];
		for(int i = 0; i < n; i++) {
			arr[i] = Integer.parseInt(br.readLine());
		}
		
		for(int i = 0; i <= n-m; i++) {
			int sum = 0;
			for(int j = i; j < i+m; j++) {
				sum += arr[j];
			}
			int temp = 0;
			int max = 0;
			for(int j = i+m; j < n; j++) {
				temp += arr[j];
				max = Math.max(max, temp);
			}
			
			dp[i] = sum + max;
		}
		
		int max = -1000;
		for(int i = 0; i < n; i++) {
			max = Math.max(max, dp[i]);
		}
		
		if(max < 0) {
			max = 0;
		}
		
		
		bw.write(String.valueOf(max));
		bw.flush();
	}
}
