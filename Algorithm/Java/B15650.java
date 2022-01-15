import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

//πÈ¡ÿ 15650 N∞˙M(2)

public class B15650 {
	public static int n;
	public static int m;
	public static char[] result;
	public static boolean[] visited;
	public static StringBuilder sb;
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		sb = new StringBuilder();
		
		n = Integer.parseInt(st.nextToken());
		m = Integer.parseInt(st.nextToken());

		result = new char[m*2];
		Arrays.fill(result, ' ');
		
		visited = new boolean[n+1];
		
		bt(0, 1);
		System.out.print(sb);
	}
	
	public static void bt(int depth, int cur) {
		if(depth == m) {
			sb.append(result).append('\n');
			return;
		}
		
		for(int i = cur; i <= n; i++) {
			if(!visited[i]) {
				visited[i] = true;
				result[depth*2] = (char) (i + '0');
				bt(depth+1, i);
				visited[i] = false;
			}
		}
	}

}
