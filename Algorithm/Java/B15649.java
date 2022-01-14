import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B15649 {
	public static int n, m;
	public static char[] result;
	public static boolean[] visited;
	public static StringBuilder sb;
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		sb = new StringBuilder();
		
		String[] nm = br.readLine().split(" ");
		
		n = Integer.parseInt(nm[0]);
		m = Integer.parseInt(nm[1]);
		
		result = new char[2*m];
		visited = new boolean[n+1];
		
		for(int i = 1; i < 2*m; i+=2) {
			result[i] = ' ';
		}
		
		dfs(0);
		System.out.print(sb);
	}
	
	public static void dfs(int depth) {
		if(depth == m) {
			sb.append(result).append('\n');
			return;
		}
		
		for(int i = 1; i <= n; i++) {
			if(!visited[i]) {
				visited[i] = true;
				result[depth*2] = (char)(i+'0');
				
				dfs(depth+1);
				
				visited[i] = false;
			}
		}
	}
}
