import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B11021 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int t = Integer.parseInt(br.readLine());
		
		for(int i = 1; i <= t; i++) {
			String[] temp = br.readLine().split(" ");
			
			int a = Integer.parseInt(temp[0]);
			int b = Integer.parseInt(temp[1]);
			
			sb.append("Case #"+ i + ": ").append(a+b).append('\n');
		}
		
		System.out.print(sb);
	}
}
