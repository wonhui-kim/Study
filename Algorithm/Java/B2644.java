import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.List;

//πÈ¡ÿ 2644 √Ãºˆ∞ËªÍ (bfs)

public class B2644 {
	public static List<Integer>[] adjList;
	public static boolean[] visited;
	public static int result = -1;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int n = Integer.parseInt(br.readLine());
		
		visited = new boolean[n+1];
		adjList = new ArrayList[n+1];
		for(int i = 1; i <= n; i++) {
			adjList[i] = new ArrayList<>();
		}
		
		String[] temp = br.readLine().split(" "); //π‡«Ùæﬂ «“ √Ãºˆ
		int a = Integer.parseInt(temp[0]);
		int b = Integer.parseInt(temp[1]);
		
		int numOfEdge = Integer.parseInt(br.readLine());
		
		while(numOfEdge-- > 0) {
			temp = br.readLine().split(" ");
			
			int e1 = Integer.parseInt(temp[0]);
			int e2 = Integer.parseInt(temp[1]);
			
			adjList[e1].add(e2);
			adjList[e2].add(e1);
		}
		
		dfs(a, b, 0);
		bw.write(String.valueOf(result));
		bw.flush();
	}
	
	public static void dfs(int start, int end, int cnt) {
		if(start == end) {
			result = cnt;
			return;
		}
		
		visited[start] = true;
		for(int i = 0; i < adjList[start].size(); i++) {
			int next = adjList[start].get(i);
			if(!visited[next]) {
				dfs(next, end, cnt+1);
			}
		}
	}

}
