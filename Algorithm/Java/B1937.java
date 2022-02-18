import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

//πÈ¡ÿ 1937 øÂΩ…¿Ô¿Ã ∆«¥Ÿ (dp)

public class B1937 {
	public static int n;
	public static int[][] matrix;
	public static int[][] dp;
	public static int[] dx = {-1, 0, 1, 0};
	public static int[] dy = {0, -1, 0, 1};
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));	
		
		n = Integer.parseInt(br.readLine());
		matrix = new int[n][n];
		dp = new int[n][n];
		
		for(int i = 0; i < n; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			for(int j = 0; j < n; j++) {
				matrix[i][j] = Integer.parseInt(st.nextToken());
			}
		}

		int max = 0;
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < n; j++) {
				max = Math.max(max, dfs(i,j));
			}
		}
		//print(dp, n);
		
		bw.write(String.valueOf(max));
		bw.flush();		
	}
	
	public static int dfs(int x, int y) {
		if(dp[x][y] != 0) {
			return dp[x][y];
		}
		
		dp[x][y] = 1;
		
		for(int i = 0; i < 4; i++) {
			int nextX = x + dx[i];
			int nextY = y + dy[i];
			
			if(nextX < 0 || nextY < 0 || nextX >= n || nextY >= n) {
				continue;
			}
			
			if(matrix[x][y] < matrix[nextX][nextY]) {
				dp[x][y] = Math.max(dp[x][y], dfs(nextX, nextY) + 1);
				dfs(nextX, nextY);
			}
		}
		return dp[x][y];
	}
	
	public static void print(int[][] arr, int size) {
		for(int i = 0; i < size; i++) {
			for(int j = 0; j < size; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
	}
}
