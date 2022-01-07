import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class B1260 {

	static int[][] graph;
	static boolean[] visited;
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String[] s = br.readLine().split(" ");
		int n = Integer.parseInt(s[0]); //정점 개수
		int m = Integer.parseInt(s[1]); //간선 개수
		int v = Integer.parseInt(s[2]); //시작 정점
		
		graph = new int[n+1][n+1];
		visited = new boolean[n+1];
		
		for(int i = 0; i < m; i++) {
			String[] edge = br.readLine().split(" ");
			int e1 = Integer.parseInt(edge[0]);
			int e2 = Integer.parseInt(edge[1]);
			
			graph[e1][e2] = 1;
			graph[e2][e1] = 1;
		}
		
		dfsR(v);
		Arrays.fill(visited, false); //visited 배열 초기화
		System.out.println();
		bfs(v);
		
	}
	
	public static void dfsR(int v) {
		visited[v] = true;
		System.out.print(v + " ");
		
		for(int i = 1; i < graph.length; i++) {
			if(graph[v][i] == 1 && !visited[i]) {
				dfsR(i);
			}
		}
	}
	
	public static void bfs(int v) {
		Queue<Integer> queue = new LinkedList();
		queue.add(v); //큐에 시작점 추가
		visited[v] = true; //방문 표시
		
		while(!queue.isEmpty()) {
			int node = queue.poll();
			
			for(int i = 1; i < graph.length; i++) {
				if(graph[node][i] == 1 && !visited[i]) {
					queue.add(i);
					visited[i] = true;
				}
			}
			System.out.print(node + " ");
		}
	}
}
