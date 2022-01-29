import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BA9012 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int k = Integer.parseInt(br.readLine());
		int sum = 0;
		
		for(int i = 0; i < k; i++) {
			char[] temp = br.readLine().toCharArray();
			
			if(temp[0] == ')' || temp[temp.length-1] == '(') {
				sb.append("NO").append('\n');
			} else {
				int j = 0;
				for(j = 0; j < temp.length; j++) {
					if(temp[j] == '(') {
						sum++;
					}
					if(temp[j] == ')') {
						sum--;
					}
					if(sum < 0) {
						sb.append("NO").append('\n');
						break;
					}
				}
				
				if(j == temp.length) {
					if(sum == 0) {
						sb.append("YES").append('\n');
					} else {
						sb.append("NO").append('\n');
					}
				}				
			}			
			sum = 0;
		}
		
		System.out.print(sb);
	}
	
}
