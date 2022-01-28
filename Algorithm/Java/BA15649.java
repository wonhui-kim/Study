import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class BA15649 {
	public static int n, m;
	public static boolean[] visited;
	public static char[] result;
	public static StringBuilder sb;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		sb = new StringBuilder();
		
		n = Integer.parseInt(st.nextToken());
		m = Integer.parseInt(st.nextToken());
		visited = new boolean[n+1];
		result = new char[m*2];
		Arrays.fill(result, ' ');
		
		bt(0);
		System.out.print(sb);
	}
	
	public static void bt(int depth) {
		if(depth == m) {
			sb.append(result).append('\n');
			return;
		}
		
		for(int i = 1; i <= n; i++) {
			if(!visited[i]) {
				visited[i] = true;
				result[depth*2] = (char)(i + '0');
				bt(depth+1);
				visited[i] = false;
			}
		}
	}
}
