import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B4344 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;
		
		int c = Integer.parseInt(br.readLine());
		int[] student;
		for(int i = 0; i < c; i++) {
			st = new StringTokenizer(br.readLine());
			int n = Integer.parseInt(st.nextToken());
			student = new int[n];
			int sum = 0;
			for(int j = 0; j < n; j++) {
				student[j] = Integer.parseInt(st.nextToken());
				sum += student[j];
			}
			int avg = sum/n;
			int cnt = 0;
			for(int j = 0; j < n; j++) {
				if(student[j] > avg) {
					cnt++;
				}
			}
			double ratio = (1.0*cnt/n) * 100;
			sb.append(String.format("%.3f", ratio)).append("%\n");
		}
		System.out.print(sb);
	}
}
