import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BA2667 {
	public static int n;
	public static int[][] matrix;
	public static boolean[][] visited;
	public static int[] dx = {-1, 0, 1, 0}; //»óÁÂÇÏ¿ì
	public static int[] dy = {0, -1, 0, 1};
	public static int cnt;
	public static List<Integer> result = new ArrayList<>();
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		n = Integer.parseInt(br.readLine());		
		matrix = new int[n][n];
		visited = new boolean[n][n];
		
		for(int i = 0; i < n; i++) {
			char[] temp = br.readLine().toCharArray();
			for(int j = 0; j < n; j++) {
				matrix[i][j] = (char)(temp[j] - '0');
			}
		}
		
		solution();
		Collections.sort(result);
		
		bw.write(result.size() + "\n");
		for(int i = 0; i < result.size(); i++) {
			bw.write(result.get(i) + "\n");
		}
		
		bw.flush();
	}
	
	public static void solution() {
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < n; j++) {
				if(matrix[i][j] == 1 && visited[i][j] == false) {
					cnt = 0;
					dfs(i, j);
					result.add(cnt);
				}
			}
		}
	}
	
	public static void dfs(int r, int c) {
		visited[r][c] = true;
		cnt++;
		
		for(int i = 0; i < 4; i++) {
			int nextR = r + dx[i];
			int nextC = c + dy[i];
			
			if(nextR < 0 || nextC < 0 || nextR >= n || nextC >= n) continue;
			else if(matrix[nextR][nextC] == 1 && visited[nextR][nextC] == false) {
				dfs(nextR, nextC);
			}
		}
	}
}
