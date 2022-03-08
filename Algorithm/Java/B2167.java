import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class B2167 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		int[][] matrix = new int[n+1][m+1];
		
		for(int i = 1; i <= n; i++) {
			st = new StringTokenizer(br.readLine());
			int sum = 0;
			for(int j = 1; j <= m; j++) {
				sum += Integer.parseInt(st.nextToken());
				matrix[i][j] = sum;
			}
		}
		
		StringBuilder sb = new StringBuilder();
		int k = Integer.parseInt(br.readLine());
		for(int i = 0; i < k; i++) {
			st = new StringTokenizer(br.readLine());
			int x1 = Integer.parseInt(st.nextToken());
			int y1 = Integer.parseInt(st.nextToken());
			int x2 = Integer.parseInt(st.nextToken());
			int y2 = Integer.parseInt(st.nextToken());
			
			sb.append(sectionSum(matrix, x1, y1, x2, y2)).append('\n');
		}
		bw.write(sb.toString());
		bw.flush();
	}
	public static int sectionSum(int[][] matrix, int x1, int y1, int x2, int y2) {
		int sum = 0;
		for(int i = x1; i <= x2; i++) {
			sum += matrix[i][y2] - matrix[i][y1-1];
		}
		return sum;
	}
}
