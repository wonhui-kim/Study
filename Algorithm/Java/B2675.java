import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

//백준 2657 문자열 반복 (string)

public class B2675 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	
		StringBuilder sb = new StringBuilder();
		
		int t = Integer.parseInt(br.readLine());
		StringTokenizer st;
		for(int i = 0; i < t; i++) {
			st = new StringTokenizer(br.readLine());
			int r = Integer.parseInt(st.nextToken());
			char[] c = st.nextToken().toCharArray();
			
			for(int j = 0; j < c.length; j++) {
				for(int k = 0; k < r; k++) {
					sb.append(c[j]);
				}
			}
			sb.append('\n');
		}
		
		bw.write(sb.toString());
		bw.flush();
	}
}
