import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class BA10828 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int n = Integer.parseInt(br.readLine());
		Stack<Integer> stack = new Stack<>();
		
		while(n-- > 0) {
			String[] temp = br.readLine().split(" ");
			
			switch(temp[0]) {
				case "push":
					stack.push(Integer.parseInt(temp[1]));
					break;
				case "pop":
					if(stack.isEmpty()) {
						sb.append(-1).append('\n');
					} else {
						sb.append(stack.pop()).append('\n');
					}
					break;
				case "top":
					if(stack.isEmpty()) {
						sb.append(-1).append('\n');
					} else {
						sb.append(stack.peek()).append('\n');
					}
					break;
				case "size":
					sb.append(stack.size()).append('\n');
					break;
				case "empty":
					if(stack.isEmpty()) {
						sb.append(1).append('\n');
					} else {
						sb.append(0).append('\n');
					}
					break;
			}
		}
		
		System.out.print(sb);
	}
}
