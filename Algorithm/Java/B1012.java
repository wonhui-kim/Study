import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

//백준 1012 유기농배추 (dfs)

public class B1012 {
	public static int m, n, k;
	public static int[][] matrix;
	public static boolean[][] visited;
	public static int[] dx = {-1, 0, 1, 0}; //상좌하우
	public static int[] dy = {0, -1, 0, 1};
	public static int cnt;
	public static StringBuilder sb;
	public static List<Integer> result = new ArrayList<>();
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		sb = new StringBuilder();
		
		int t = Integer.parseInt(br.readLine());
		
		while(t-- > 0) {
			cnt = 0;
			
			String[] mnk = br.readLine().split(" ");
			m = Integer.parseInt(mnk[0]);
			n = Integer.parseInt(mnk[1]);
			k = Integer.parseInt(mnk[2]);
			
			visited = new boolean[m][n];
			matrix = new int[m][n];
			
			for(int i = 0; i < k; i++) {
				String[] xy = br.readLine().split(" ");
				
				int x = Integer.parseInt(xy[0]);
				int y = Integer.parseInt(xy[1]);
				
				matrix[x][y] = 1;
			}
			
			solution();
			sb.append(cnt).append('\n');
		}
		
		System.out.print(sb);
	}
	
	public static void solution() {
		for(int i = 0; i < m; i++) {
			for(int j = 0; j < n; j++) {
				if(matrix[i][j] == 1 && !visited[i][j]) {
					dfs(i, j);
					cnt++;
				}
			}
		}
	}
	
	public static void dfs(int r, int c) {
		visited[r][c] = true;
		
		for(int i = 0; i < 4; i++) {
			int nextR = r + dx[i];
			int nextC = c + dy[i];
			
			if(nextR < 0 || nextC < 0 || nextR >= m || nextC >= n) continue;
			else if(matrix[nextR][nextC] == 1 && visited[nextR][nextC] == false) {
				dfs(nextR, nextC);
			}
		}
	}
}