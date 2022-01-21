import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

//น้มุ 18258 ลฅ2 (queue)

public class B18258 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		Queue<Integer> queue = new LinkedList<>();
		
		int n = Integer.parseInt(br.readLine());
		
		int x = 0;
		for(int i = 0; i < n; i++) {
			String[] temp = br.readLine().split(" ");
			
			switch(temp[0]) {
				case "push":
					x = Integer.parseInt(temp[1]);
					queue.add(x);
					break;
				case "pop":
					if(!queue.isEmpty()) {
						sb.append(queue.poll()).append('\n');
					} else {
						sb.append(-1).append('\n');
					}
					break;
				case "size":
					sb.append(queue.size()).append('\n');
					break;
				case "empty":
					if(queue.isEmpty()) {
						sb.append(1).append('\n');
					} else {
						sb.append(0).append('\n');
					}
					break;
				case "front":
					if(!queue.isEmpty()) {
						sb.append(queue.peek()).append('\n');
					} else {
						sb.append(-1).append('\n');
					}
					break;
				case "back":
					if(!queue.isEmpty()) {
						sb.append(x).append('\n');
					} else {
						sb.append(-1).append('\n');
					}
					break;
			}
		}
		
		System.out.print(sb);
	}
}
