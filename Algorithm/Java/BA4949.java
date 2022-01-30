import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class BA4949 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		while(true) {
			char[] temp = br.readLine().toCharArray();
			
			if(temp[0] == '.') {
				break;
			}
			
			sb.append(balance(temp)).append('\n');
		}
		
		System.out.print(sb);
	}
	
	public static String balance(char[] arr) {
		Stack<Character> stack = new Stack<>();
		
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] == '(' || arr[i] == '[') {
				stack.push(arr[i]);
			}
			if(arr[i] == ')') {
				if(!stack.isEmpty() && stack.peek() == '(') {
					stack.pop();
				}
				else {
					return "no";
				}
			}
			if(arr[i] == ']') {
				if(!stack.isEmpty() && stack.peek() == '[') {
					stack.pop();
				}
				else {
					return "no";
				}
			}
		}
		
		if(stack.isEmpty()) {
			return "yes";
		} else {
			return "no";
		}
		
	}
}
