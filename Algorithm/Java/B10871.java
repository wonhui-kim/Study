import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B10871 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		String[] temp = br.readLine().split(" ");
		int n = Integer.parseInt(temp[0]);
		int x = Integer.parseInt(temp[1]);
		
		temp = br.readLine().split(" ");
		for(int i = 0; i < n; i++) {
			int a = Integer.parseInt(temp[i]);			
			if(a < x) {
				sb.append(a).append(" ");
			}
		}
		System.out.print(sb);
	}
}
