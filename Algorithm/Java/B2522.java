import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class B2522 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int n = Integer.parseInt(br.readLine());
		
		//21
		//12
		//03
		
		StringBuilder sb = new StringBuilder();
		String star = "*";
		String empty = " ";
		for(int i = 0; i < n; i++) {
			String temp = empty.repeat(i);
			temp += star.repeat(n-i);
			sb.append(temp).append('\n');
			
			if(i > 0) {
				sb.insert(0, temp + '\n');
			}
		}
		
		bw.write(sb.toString());
		bw.flush();
	}
}
