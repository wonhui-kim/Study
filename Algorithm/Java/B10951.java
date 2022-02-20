import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B10951 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		String input;
		
		while((input=br.readLine()) != null) {
			
			int a = input.charAt(0) - '0';
			int b = input.charAt(2) - '0';
			
			sb.append(a+b).append('\n');
		}
		System.out.print(sb);
	}
}
