import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

//백준 2908 상수

public class B2908 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		String a = st.nextToken();
		String b = st.nextToken();
		
		int ca = 0;
		int ten = 1;
		for(int i = 0; i < a.length(); i++) {
			ca += (a.charAt(i) - '0') * ten;
			ten *= 10;
		}
		int cb = 0;
		ten = 1;
		for(int i = 0; i < b.length(); i++) {
			cb += (b.charAt(i) - '0') * ten;
			ten *= 10;
		}
		
		if(ca > cb) {
			bw.write(String.valueOf(ca));
		} else {
			bw.write(String.valueOf(cb));
		}
		bw.flush();
	}
}
