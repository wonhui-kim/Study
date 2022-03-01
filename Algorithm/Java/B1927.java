import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;

//백준 1927 최소 힙 (PriorityQueue)

public class B1927 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		PriorityQueue<Integer> pq = new PriorityQueue<>();
		
		int n = Integer.parseInt(br.readLine());
		for(int i = 0; i < n; i++) {
			int x = Integer.parseInt(br.readLine());
			
			if(x == 0) {
				if(pq.isEmpty()) {
					sb.append(0).append('\n');
				} else {
					sb.append(pq.poll()).append('\n');
				}
			} else {
				pq.add(x);
			}
		}
		
		System.out.print(sb);
	}
}
