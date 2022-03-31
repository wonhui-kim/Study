import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class B2475 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int cnt = 0;
		for(int i = 0; i < 5; i++) {
			int temp = Integer.parseInt(st.nextToken());
			
			cnt += (temp * temp);
		}
		
		bw.write(String.valueOf(cnt%10));
		bw.flush();
	}
}
