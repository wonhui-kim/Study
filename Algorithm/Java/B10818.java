import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class B10818 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st;
		
		int n = Integer.parseInt(br.readLine());
		
		st = new StringTokenizer(br.readLine());
		int max = Integer.parseInt(st.nextToken());
		int min = max;
		for(int i = 1; i < n; i++) {
			int temp = Integer.parseInt(st.nextToken());
			max = Math.max(max, temp);
			min = Math.min(min, temp);
		}
		
		bw.write(String.valueOf(min) + " " + String.valueOf(max));
		bw.flush();
	}
}
