import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

//백준 16948 데스 나이트 (bfs)
class Node {
	int r, c, count;
	
	Node(int r, int c, int count) {
		this.r = r;
		this.c = c;
		this.count = count;
	}
}
public class B16948 {
	static int n;
	static int r1, c1;
	static int r2, c2;
	
	public static int[][] matrix;
	public static boolean[][] visited;
	public static int[] dr = {-2, -2, 0, 0, 2, 2};
	public static int[] dc = {-1, 1, -2, 2, -1, 1};
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		n = Integer.parseInt(br.readLine());
		matrix = new int[n+1][n+1];
		visited = new boolean[n+1][n+1];
		
		String[] s = br.readLine().split(" ");
		
		r1 = Integer.parseInt(s[0]);
		c1 = Integer.parseInt(s[1]);
		r2 = Integer.parseInt(s[2]);
		c2 = Integer.parseInt(s[3]);
		
		bfs();
	}
	
	public static void bfs() {
		Queue<Node> queue = new LinkedList<Node>();
		queue.add(new Node(r1, c1, 0));
		visited[r1][c1] = true;
		
		while(!queue.isEmpty()) {
			Node temp = queue.poll();
			
			for(int i = 0; i < 6; i++) {
				int nextR = temp.r + dr[i];
				int nextC = temp.c + dc[i];
				
				if(nextR < 0 || nextC < 0 || nextR > n || nextC > n || visited[nextR][nextC]) continue;
				
				if(nextR == r2 && nextC == c2) {
					System.out.println(temp.count+1); //종료
					System.exit(0);
				}
				
				visited[nextR][nextC] = true;
				queue.add(new Node(nextR, nextC, temp.count+1));
			}
		}
		
		System.out.println(-1);
	}
}
