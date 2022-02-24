import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class B3052 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int[] rest = new int[42];
		for(int i = 0; i < 10; i++) {
			int r = Integer.parseInt(br.readLine()) % 42;
			rest[r]++;
		}
	
		int cnt = 0;
		for(int i = 0; i < 42; i++) {
			if(rest[i] > 0) {
				cnt++;
			}
		}
		
		bw.write(String.valueOf(cnt));
		bw.flush();
	}
}
