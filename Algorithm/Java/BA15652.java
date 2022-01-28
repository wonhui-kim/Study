import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class BA15652 {
	public static int n, m;
	public static char[] result;
	public static StringBuilder sb;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		sb = new StringBuilder();
		
		n = Integer.parseInt(st.nextToken());
		m = Integer.parseInt(st.nextToken());
		
		result = new char[m*2];
		Arrays.fill(result, ' ');
		
		bt(0, 1);
		System.out.print(sb);
	}
	public static void bt(int depth, int cur) {
		if(depth == m) {
			sb.append(result).append('\n');
			return;
		}
		for(int i = cur; i <= n; i++) {
			result[depth*2] = (char)(i + '0');
			bt(depth+1, i);
		}
	}
}
