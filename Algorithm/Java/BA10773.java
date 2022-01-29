import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class BA10773 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int k = Integer.parseInt(br.readLine());
		Stack<Integer> stack = new Stack<>();
		
		int sum = 0;
		for(int i = 0; i < k; i++) {
			int temp = Integer.parseInt(br.readLine());
			
			if(temp!=0) {
				stack.push(temp);
				sum += temp;
			}
			else {
				sum -= stack.pop();
			}
		}
		
		System.out.print(sum);
	}
}
