import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

//백준 11048 이동하기 (dp)

public class B11048 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		String[] temp = br.readLine().split(" ");
		int n = Integer.parseInt(temp[0]);
		int m = Integer.parseInt(temp[1]);
		
		int max = -1;
		int[][] maze = new int[n+1][m+1];		
		for(int i = 1; i <= n; i++) { //3
			temp = br.readLine().split(" ");
			for(int j = 1; j <= m; j++) { //4
				maze[i][j] = Integer.parseInt(temp[j-1]);
				max = Math.max(maze[i-1][j-1], Math.max(maze[i][j-1], maze[i-1][j]));
				maze[i][j] += max;
			}
		}
		
		bw.write(String.valueOf(maze[n][m]));
		bw.flush();
	}
}
