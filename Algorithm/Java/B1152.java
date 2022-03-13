import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

//백준 1152 단어의 개수 (string)

public class B1152 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int cnt = 0;
		while(st.hasMoreTokens()) {
			st.nextToken();
			cnt++;
		}
		
		bw.write(String.valueOf(cnt));
		bw.flush();
	}
}