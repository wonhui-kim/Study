import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class B2443 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int n = Integer.parseInt(br.readLine());
		
		//090
		//171
		//252
		//333
		//414
		
		StringBuilder sb = new StringBuilder();
		String star = "*";
		String empty = " ";
		for(int i = 0; i < n; i++) {
			String temp = empty.repeat(i);
			temp += star.repeat(2*(n-i)-1);
			sb.append(temp).append('\n');
		}
		
		bw.write(sb.toString());
		bw.flush();
	}
}
