import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.PriorityQueue;

//백준 11279 최대 힙 (PriorityQueue)

public class B11279 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		PriorityQueue<Integer> priorityQueue = new PriorityQueue<>(Collections.reverseOrder());
		
		int n = Integer.parseInt(br.readLine());
		for(int i = 0; i < n; i++) {
			int x = Integer.parseInt(br.readLine());
			
			if(x == 0) {
				if(priorityQueue.isEmpty()) {
					sb.append(0).append('\n');
				} else {
					sb.append(priorityQueue.poll()).append('\n');
				}
			} else {
				priorityQueue.add(x);
			}
		}
		
		System.out.print(sb);
	}
}
