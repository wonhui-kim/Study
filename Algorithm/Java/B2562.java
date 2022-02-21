import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B2562 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int max = Integer.parseInt(br.readLine());
		int cnt = 1;
		int idx = 1;
		for(int i = 1; i < 9; i++) {
			int num = Integer.parseInt(br.readLine());
			cnt++;
			if(max < num) {
				max = num;
				idx = cnt;
			}
		}
		sb.append(max).append('\n').append(idx);
		System.out.print(sb);
	}
}
