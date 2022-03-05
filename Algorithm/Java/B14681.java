import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class B14681 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int x = Integer.parseInt(br.readLine());
		int y = Integer.parseInt(br.readLine());
		
		int n = -1;
		if(x > 0) {
			n = (y > 0) ? 1 : 4;
		} else {
			n = (y > 0) ? 2 : 3;
		}
		
		bw.write(String.valueOf(n));
		bw.flush();
	}
}
