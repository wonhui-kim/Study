import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class B2445 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int n = Integer.parseInt(br.readLine());
		//181
		//262
		//343
		//424 
		//505 (10)
		//
		
		StringBuilder sb = new StringBuilder();
		String star = "*";
		String empty = " ";
		for(int i = n; i > 0; i--) {
			String temp = star.repeat(i);
			temp += empty.repeat(2 * (n-i));
			temp += star.repeat(i);
			
			sb.append(temp).append('\n');
			if(i < n) {
				sb.insert(0, temp + "\n");
			}
		}
		
		bw.write(sb.toString());
		bw.flush();
	}
}
