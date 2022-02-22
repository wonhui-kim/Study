import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B2577 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int result = 1;
		for(int i = 0; i < 3; i++) {
			result *= Integer.parseInt(br.readLine());
		}
		
		int[] arr = new int[10];
		while(result > 0) {
			int r = result % 10;
			arr[r]++;
			result /= 10;
		}
		
		for(int i = 0; i < 10; i++) {
			sb.append(arr[i]).append('\n');
		}
		System.out.print(sb);
	}
}
