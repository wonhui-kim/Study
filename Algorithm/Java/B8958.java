import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B8958 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int tc = Integer.parseInt(br.readLine());
		int score = 0;
		for(int i = 0; i < tc; i++) {
			score = 0;
			char[] temp = br.readLine().toCharArray();
			
			int acc = 0;			
			for(int j = 0; j < temp.length; j++) {
				if(temp[j] == 'O') {
					acc++;
					score += acc;
				} else {
					acc = 0;
				}
			}
			sb.append(score).append('\n');
		}
		System.out.print(sb);
	}
}
