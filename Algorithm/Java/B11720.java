import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class B11720 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int n = Integer.parseInt(br.readLine());
		char[] temp = br.readLine().toCharArray();
		
		int sum = 0;
		for(int i = 0; i < n; i++) {
			sum += temp[i] - '0';
		}
		
		bw.write(String.valueOf(sum));
		bw.flush();
	}
}
