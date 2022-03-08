import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class B11660 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken()); //표의 크기
		int m = Integer.parseInt(st.nextToken()); //구하는 횟수
		
		int[][] matrix = new int[n+1][n+1];
		for(int i = 1; i <= n; i++) {
			st = new StringTokenizer(br.readLine());
			int sum = 0;
			for(int j = 1; j <= n; j++) {
				sum += Integer.parseInt(st.nextToken());
				matrix[i][j] = sum;
			}
		}
		
		StringBuilder sb = new StringBuilder();
		for(int i = 0; i < m; i++) {
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
	public static void print(int[][] matrix, int size) {
		for(int i = 1; i <= size; i++) {
			for(int j = 1; j <= size; j++) {
				System.out.print(matrix[i][j] + " ");
			}
			System.out.println();
		}
	}
}
