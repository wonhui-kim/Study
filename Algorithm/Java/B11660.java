import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B11660 {
	public static int[][] matrix;
	public static int[][] pSum;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();

		String[] temp = br.readLine().split(" ");
		
		int n = Integer.parseInt(temp[0]);
		int m = Integer.parseInt(temp[1]);
		
		matrix = new int[n][n];
		pSum = new int[n][n];
		
		for(int i = 0; i < n; i++) { //표 채우기
			temp = br.readLine().split(" ");
			int sum = 0;
			for(int j = 0; j < n; j++) {
				matrix[i][j] = Integer.parseInt(temp[j]);
				sum += matrix[i][j];
				pSum[i][j] = sum;
			}
		}
		
		while(m-- > 0) {
			temp = br.readLine().split(" ");
			int s1 = Integer.parseInt(temp[0]);
			int s2 = Integer.parseInt(temp[1]);
			int e1 = Integer.parseInt(temp[2]);
			int e2 = Integer.parseInt(temp[3]);
			
			sb.append(sectionSum(pSum, s1, s2, e1, e2)).append('\n');
		}
		
		System.out.print(sb);
	}
	
	public static int sectionSum(int[][] arr, int s1, int s2, int e1, int e2) {
		int sum = 0;
		
		for(int i = s1-1; i <= e1-1; i++) {
			if(s2-1 == 0) {
				sum += pSum[i][e2-1];
			} else {
				sum += pSum[i][e2-1] - pSum[i][s2-2];
			}			
		}
		
		return sum;
	}
}
