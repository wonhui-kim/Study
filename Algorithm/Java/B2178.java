import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

//백준 2178 미로 탐색

class Node {
	int n;
	int m;
	
	Node(int n, int m) {
		this.n = n;
		this.m = m;
	}
}

public class B2178 {
	public static int n, m;
	public static int[][] maze;
	public static boolean[][] visited;
	
	public static int[] dx = {-1, 1, 0, 0}; //상하
	public static int[] dy = {0, 0, -1, 1}; //좌우
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String[] nm = br.readLine().split(" "); 
		n = Integer.parseInt(nm[0]);
		m = Integer.parseInt(nm[1]);
		
		maze = new int[n][m];
		visited = new boolean[n][m];
		
		for(int i = 0; i < n; i++) { //4
			String temp = br.readLine();
			for(int j = 0; j < m; j++) {
				maze[i][j] = temp.charAt(j) - '0'; //미로에 입력값 저장
			}
		}
		
		bfs();
		System.out.print(maze[n-1][m-1]);
	}
	
	public static void bfs() {
		Queue<Node> queue = new LinkedList<Node>();
		queue.add(new Node(0, 0)); //시작은 1, 1 == 0,0
		visited[0][0] = true;
		
		while(!queue.isEmpty()) {
			Node temp = queue.poll();
			
			for(int i = 0; i < 4; i++) {
				int nextN = temp.n + dx[i];
				int nextM = temp.m + dy[i];
				
				if(nextN < 0 || nextM < 0 || nextN >= n || nextM >= m)
					continue;
				if(maze[nextN][nextM] == 1 && !visited[nextN][nextM]) {
					visited[nextN][nextM] = true;
					maze[nextN][nextM] = maze[temp.n][temp.m] + 1;
					queue.add(new Node(nextN, nextM));
				}
			}
		}
		
	}

}
