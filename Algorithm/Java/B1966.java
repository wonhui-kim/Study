import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

//백준 1966 프린터큐 (queue)

class Document {
	int index;
	int priority;
	
	Document(int index, int priority){
		this.index = index;
		this.priority = priority;
	}
}

public class B1966 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
	
		int tc = Integer.parseInt(br.readLine());
		
		while(tc-- > 0) {
			String[] tempNM = br.readLine().split(" ");
			int n = Integer.parseInt(tempNM[0]);
			int m = Integer.parseInt(tempNM[1]);
			
			Queue<Document> queue = new LinkedList<>();
			
			String[] docs = br.readLine().split(" ");
			
			for(int i = 0; i < n; i++) {
				queue.offer(new Document(i, Integer.parseInt(docs[i])));
			}
			
			int result = 1;
			
			while(!queue.isEmpty()) {
				Document out = queue.poll();
				boolean isMax = true;
				
				Iterator<Document> it = queue.iterator();
				while(it.hasNext()) {
					Document next = (Document) it.next();
					
					if(out.priority < next.priority) {
						isMax = false;
						break;
					}
				}
				
				if(isMax == false) {
					queue.offer(out);
				} else {
					if(out.index == m) {
						sb.append(result).append('\n');
					} else {
						result++;
					}
				}
			}
			
		}
		
		System.out.print(sb);
	}
}
