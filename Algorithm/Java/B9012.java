import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

//น้มุ 9012 ฐýศฃ (stack)

public class B9012 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int t = Integer.parseInt(br.readLine());
		
		for(int i = 0; i < t; i++) {
			String temp = br.readLine();
			sb.append(vps(temp)).append('\n');
		}
		
		System.out.print(sb);
	}
	
	public static String vps (String s) {
		Stack<Character> stack = new Stack<>();
		
		for(int j = 0; j < s.length(); j++) {
			char c = s.charAt(j);
			
			if(c == '(') {
				stack.push(c);
			}
			else {
				if(!stack.isEmpty()) {
					stack.pop();
				} else {
					return "NO";
				}
			}
		}
		
		if(stack.isEmpty())
			return "YES";
		else
			return "NO";
	}
}
