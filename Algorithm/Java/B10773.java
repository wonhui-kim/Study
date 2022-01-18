import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

//백준 10773 제로 (스택)

public class B10773 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int k = Integer.parseInt(br.readLine());
		Stack<Integer> s = new Stack<>();
		
		int cnt = 0;
		for(int i = 0; i < k; i++) {
			int num = Integer.parseInt(br.readLine()); //3 0
			
			if(num != 0) {
				s.push(num);
				cnt += s.peek();
			}
			else {
				cnt -= s.pop();
			}
		}
		
		System.out.print(cnt);
	}
}
