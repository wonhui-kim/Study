import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class BA2164 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		
		Queue<Integer> queue = new LinkedList<>();
		
		for(int i = 1; i <= n; i++) {
			queue.offer(i);
		}
		
		int temp = 0;
		while(true) {			
			if(queue.size() >= 2) {
				queue.poll();
				temp = queue.poll();
				queue.offer(temp);
			} else {
				temp = queue.poll();
				break;
			}			
		}
		
		System.out.print(temp);
	}
}
