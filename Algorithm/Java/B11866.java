import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

//���� 11866 �似Ǫ�� ����0 (queue)

public class B11866 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int n = Integer.parseInt(st.nextToken());
		int k = Integer.parseInt(st.nextToken());
		
		Queue<Integer> queue = new LinkedList<>();
		
		for(int i = 1; i <= n; i++) {
			queue.offer(i);
		}
		
		System.out.print('<');
		while(!queue.isEmpty()) {
			for(int i = 0; i < k-1; i++) {
				queue.offer(queue.poll());
			}
			System.out.print(queue.poll());
			
			if(queue.size() != 0) {
				System.out.print(", ");
			}
		}
		
		System.out.print('>');
	}
}
