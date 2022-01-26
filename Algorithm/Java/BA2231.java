import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BA2231 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String strN = br.readLine();
		int n = Integer.parseInt(strN);
		int result = 0;
		
		for(int i = (n - (strN.length() * 9)); i < n; i++) {
			int num = i;
			int sum = 0;
			
			while(num!=0) {
				int a = num%10;
				sum += a;
				num /= 10;
				
			}
			
			if(sum + i == n) {
				result = i;
				break;
			}
		}
		
		System.out.print(result);
	}
}
