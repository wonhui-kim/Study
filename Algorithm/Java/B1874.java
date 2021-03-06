import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

//백준 1874 스택 수열 (stack)

public class B1874 {
	public static int n;
	public static StringBuilder sb;
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		sb = new StringBuilder();
		Stack<Integer> stack = new Stack<>();
		
		n = Integer.parseInt(br.readLine());
		
		int start = 0;
		while(n-- > 0) {
			int value = Integer.parseInt(br.readLine());
			
			if(value > start) {
				for(int i = start + 1; i<= value; i++) {
					stack.push(i);
					sb.append("+").append("\n");
				}
				start = value;
			}
			
			else if(stack.peek() != value) {
				System.out.print("NO");
				System.exit(0);
			}
			
			stack.pop();
			sb.append("-").append("\n");
		}
		
		System.out.print(sb);
	}
}
