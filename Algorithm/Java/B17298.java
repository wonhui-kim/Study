import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Stack;

//백준 17298 오큰수 (stack)

public class B17298 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int n = Integer.parseInt(br.readLine());
		int[] arr = new int[n];
		int[] nge = new int[n];
		
		Stack<Integer> stack = new Stack<>();
		stack.push(0);
		
		String[] temp = br.readLine().split(" ");
		
		for(int i = 0; i < n; i++) {
			arr[i] = Integer.parseInt(temp[i]);
		}
		
		for(int i = 1; i < n; i++) {
			if(stack.isEmpty()) {
				stack.push(i);
			}
			while(!stack.isEmpty() && arr[stack.peek()] < arr[i]) {
				nge[stack.pop()] = arr[i];
			}
			stack.push(i);
		}
		
		while(!stack.isEmpty()) {
			nge[stack.pop()] = -1;
		}
		
		for(int i = 0; i < n; i++) {
			bw.write(nge[i] + " ");
		}
		bw.flush();
	}
}
