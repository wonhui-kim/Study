import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class B2523 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int n = Integer.parseInt(br.readLine());
		
		StringBuilder sb = new StringBuilder();
		String star = "*";
		for(int i = n; i > 0; i--) {
			sb.append(star.repeat(i)).append("\n");
			if(i < n) {
				sb.insert(0, star.repeat(i) +"\n");
			}
		}
		
		bw.write(sb.toString());
		bw.flush();
	}
}
