import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;

public class BA2606 {
	public static LinkedList[] adjList;
	public static boolean[] visited;
	public static int cnt;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		int e = Integer.parseInt(br.readLine());
		
		visited = new boolean[n+1];
		cnt = 0;
		
		adjList = new LinkedList[n+1];
		for(int i = 0; i <= n; i++) {
			adjList[i] = new LinkedList<Integer>();
		}
		
		for(int i = 0; i < e; i++) {
			String[] temp = br.readLine().split(" ");
			
			int e1 = Integer.parseInt(temp[0]);
			int e2 = Integer.parseInt(temp[1]);
			
			adjList[e1].add(e2);
			adjList[e2].add(e1);
		}
		
		dfsR(1);
		System.out.println(cnt - 1);
	}
	
	public static void dfsR(int index) {
		visited[index] = true;
		cnt++;
		
		for(Object adj : adjList[index]) {
			if(visited[(int)adj] == false) {
				dfsR((int)adj);
			}
		}
	}
}
