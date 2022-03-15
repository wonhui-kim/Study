import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

//백준 111048 이동하기 (dp)

public class B11048 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		int[][] maze = new int[n+1][m+1];
		
		int max = 0;
		for(int i = 1; i <= n; i++) { //미로 입력받기
			st = new StringTokenizer(br.readLine());
			for(int j = 1; j <= m; j++) {
				maze[i][j] = Integer.parseInt(st.nextToken());
				max = Math.max(maze[i-1][j-1], Math.max(maze[i-1][j], maze[i][j-1]));
				maze[i][j] += max;
			}
		}
		
		bw.write(String.valueOf(maze[n][m]));
		bw.flush();
	}
}
