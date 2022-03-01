import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

//백준 11404 플로이드 (Floyd-Warshall)

public class B11404 {
	public static final int MAX = 1000000000;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine()); //도시 개수
		int m = Integer.parseInt(br.readLine()); //버스 개수
		
		int[][] matrix = new int[n+1][n+1];
		for(int i = 1; i <= n; i++) {
			for(int j = 1; j <= n; j++) {
				if(i==j) {
					matrix[i][j] = 0;
				} else {
					matrix[i][j] = MAX; //최대 비용 저장
				}
			}
		}
		StringTokenizer st;
		for(int i = 0; i < m; i++) {
			st = new StringTokenizer(br.readLine());
			
			int a = Integer.parseInt(st.nextToken()); //시작 도시
			int b = Integer.parseInt(st.nextToken()); //도착 도시
			int c = Integer.parseInt(st.nextToken()); //비용
			
			matrix[a][b] = Math.min(matrix[a][b], c);
		}
		
		floydWarshall(matrix, n);
		
		print(matrix, n);
	}
	
	public static void floydWarshall(int[][] arr, int size) {
		for(int k = 1; k <= size; k++) {
			for(int i = 1; i <= size; i++) {
				for(int j = 1; j <= size; j++) {
					arr[i][j] = Math.min(arr[i][j], arr[i][k] + arr[k][j]);
				}
			}
		}
	}
	
	public static void print(int[][] arr, int size) {
		for(int i = 1; i <= size; i++) {
			for(int j = 1; j <= size; j++) {
				if(arr[i][j] == MAX) {
					arr[i][j] = 0;
				}
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
	}
}
