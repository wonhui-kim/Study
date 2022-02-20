import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class B1110 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int n = Integer.parseInt(br.readLine());
		int tmp = n;
		
		int sum = -1;
		int next = -1;
		
		int cnt = 0;
		while(next != n) {
			cnt++;
			sum = (tmp%10) + ((tmp/10)%10);
			next = (tmp%10)*10 + (sum%10);
			tmp = next;
		}
		
		bw.write(String.valueOf(cnt));
		bw.flush();
	}
}
