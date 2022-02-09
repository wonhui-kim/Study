import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B2742 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int n = Integer.parseInt(br.readLine());
		
		for(int i = n; i > 0; i--) {
			sb.append(i).append('\n');
		}
		System.out.print(sb);
	}
}
