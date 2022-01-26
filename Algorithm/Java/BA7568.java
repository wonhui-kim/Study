import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BA7568 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int n = Integer.parseInt(br.readLine());
		
		int[][] builds = new int[n][2];
		
		for(int i = 0; i < n; i++) {
			String[] temp = br.readLine().split(" ");
			
			builds[i][0] = Integer.parseInt(temp[0]);
			builds[i][1] = Integer.parseInt(temp[1]);
		}
		
		for(int i = 0; i < n; i++) {
			int rank = 1;
			for(int j = 0; j < n; j++) {
				if(builds[i][0] < builds[j][0] && builds[i][1] < builds[j][1]) {
					rank++;
				}
			}
			sb.append(rank).append(" ");
		}
		
		System.out.print(sb);
	}
}
