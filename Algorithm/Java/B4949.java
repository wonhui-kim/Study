import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

//백준 4949 균형잡힌 세상 (stack)

public class B4949 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		while(true) {
			String temp = br.readLine();
			if(temp.equals(".")) {
				break;
			}
			sb.append(vps(temp)).append('\n');
		}
		
		System.out.print(sb);
	}
	
	public static String vps(String s) {
		Stack<Character> stack = new Stack<>();
		
		for(int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			
			if(c == '(' || c == '[') {
				stack.push(c);
			}
			
			if(c == ')') {
				if(!stack.isEmpty() && stack.peek() == '(') { //isEmpty 검사가 먼저!
					stack.pop();
				} else {
					return "no";
				}
			}
			
			if(c == ']') {
				if(!stack.isEmpty() && stack.peek() == '[') {
					stack.pop();
				} else {
					return "no";
				}
			}			
		}
		
		if(stack.isEmpty())
			return "yes";
		else
			return "no";
	}
}
