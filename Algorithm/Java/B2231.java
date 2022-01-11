import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//백준 2231 분해합 (브루트포스)

public class B2231 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		int m = 0;
		
		for(int i = 0; i < n; i++) {
			int sum = 0;
			int temp = i;
			
			while(temp > 0) {
				sum += temp % 10;
				temp /= 10;
			}
			
			if(sum + i == n) {
				m = i;
				break;
			}
		}
		
		System.out.println(m);
	}

}
