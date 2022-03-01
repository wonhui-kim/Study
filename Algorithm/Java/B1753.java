import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

class Node implements Comparable<Node>{
	int end;
	int weight;
	
	Node(int end, int weight){
		this.end = end;
		this.weight = weight;
	}
	
	@Override
	public int compareTo(Node o) {
		return weight - o.weight;
	}
}
public class B1753 {
	public static int[] dist;
	public static ArrayList[] adjList;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine());
		StringBuilder sb = new StringBuilder();
		
		int V = Integer.parseInt(st.nextToken()); //정점의 개수
		int E = Integer.parseInt(st.nextToken()); //간선의 개수
		int start = Integer.parseInt(br.readLine()); //시작 정점 번호
		
		dist = new int[V+1];
		for(int i = 1; i <= V; i++) {
			dist[i] = Integer.MAX_VALUE;
		}
		
		adjList = new ArrayList[V+1];
		for(int i = 1; i <= V; i++) {
			adjList[i] = new ArrayList<Node>();
		}
		
		for(int i = 0; i < E; i++) {
			st = new StringTokenizer(br.readLine());
			int u = Integer.parseInt(st.nextToken());
			int v = Integer.parseInt(st.nextToken());
			int w = Integer.parseInt(st.nextToken());
			
			adjList[u].add(new Node(v, w));
		}
		
		dijkstra(start);
		
		for(int i = 1; i <= V; i++) {
			if(dist[i] == Integer.MAX_VALUE) {
				sb.append("INF").append('\n');
			} else {
				sb.append(dist[i]).append('\n');
			}
		}
		
		bw.write(sb.toString());
		bw.flush();
	}
	
	public static void dijkstra(int start) {
		PriorityQueue<Node> pq = new PriorityQueue<>();
		dist[start] = 0;
		pq.add(new Node(start, 0));
		
		while(!pq.isEmpty()) {
			Node cur = pq.poll();
			
			if(cur.weight > dist[cur.end]) {
				continue;
			}
			
			for(int i = 0; i < adjList[cur.end].size(); i++) {
				Node next = (Node) adjList[cur.end].get(i);
				
				if(dist[next.end] > cur.weight + next.weight) {
					dist[next.end] = cur.weight + next.weight;
					pq.add(new Node(next.end, dist[next.end]));
				}
			}
		}
		
	}
}
