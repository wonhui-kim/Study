import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

//백준 2458 키 순서 (Floyd-Warshall)

public class B2458 {
	public static int n, m;
	public static int[][] matrix;
	public static int INF = 501;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		n = Integer.parseInt(st.nextToken()); //학생 수
		m = Integer.parseInt(st.nextToken()); //비교 횟수
		
		matrix = new int[n+1][n+1];
		for(int i = 1; i <= n; i++) {
			Arrays.fill(matrix[i], INF);
		}
		
		for(int i = 0; i < m; i++) {
			st = new StringTokenizer(br.readLine());
			
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			
			matrix[a][b] = 1;
		}
		
		floydWarshall();
		bw.write(String.valueOf(check()));
		bw.flush();		
	}
	
	public static void floydWarshall() {
		for(int k = 1; k <= n; k++) {
			for(int i = 1; i <= n; i++) {
				for(int j = 1; j <= n; j++) {
					matrix[i][j] = Math.min(matrix[i][j], matrix[i][k]+matrix[k][j]);
				}
			}
		}
	}
	
	public static int check() {
		int cnt = 0;
		
		for(int i = 1; i <= n; i++) {
			matrix[i][i] = 0;
			boolean flag = true;
			for(int j = 1; j <= n; j++) {
				if(Math.min(matrix[i][j], matrix[j][i]) == INF) {
					flag = false;
					break;
				}
			}
			if(flag) {
				cnt++;
			}
		}
		return cnt;
	}
}
