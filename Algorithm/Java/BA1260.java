import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Queue;

public class BA1260 {
	public static int n, m, v;
	public static boolean[] visited;
	public static LinkedList[] adjList;
	public static StringBuilder sb;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		sb = new StringBuilder();
		
		String[] nmv = br.readLine().split(" ");
		
		n = Integer.parseInt(nmv[0]);
		m = Integer.parseInt(nmv[1]);
		v = Integer.parseInt(nmv[2]);
		
		visited = new boolean[n+1];
		
		adjList = new LinkedList[n+1];
		for(int i = 0; i <= n; i++) {
			adjList[i] = new LinkedList<Integer>();
		}
		
		for(int i = 0; i < m; i++) {
			String[] edge = br.readLine().split(" ");
			
			int e1 = Integer.parseInt(edge[0]);
			int e2 = Integer.parseInt(edge[1]);
			
			adjList[e1].add(e2);
			adjList[e2].add(e1);
		}
		
		for(int i = 1; i <= n; i++) {
			Collections.sort(adjList[i]);
		}
		
		dfsR(v);
		sb.append('\n');
		for(int i = 1; i <= n; i++) {
			visited[i] = false;
		}
		bfs(v);
		System.out.print(sb);
	}
	
	public static void dfsR(int index) {
		visited[index] = true;
		sb.append(index).append(" ");
		
		for(Object adj : adjList[index]) {
			if(visited[(int)adj] == false) {
				dfsR((int)adj);
			}
		}
	}
	
	public static void bfs(int index) {
		Queue<Integer> queue = new LinkedList<>();
		queue.offer(index);
		visited[index] = true;
		
		while(!queue.isEmpty()) {
			int temp = queue.poll();
			
			for(Object adj : adjList[temp]) {
				if(visited[(int)adj] == false) {
					visited[(int)adj] = true;
					queue.offer((int)adj);
				}
			}
			sb.append(temp).append(" ");
		}
		
	}
}
