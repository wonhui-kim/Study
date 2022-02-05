import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

class Node {
	int x;
	int y;
	
	Node(int x, int y){
		this.x = x;
		this.y = y;
	}
}

public class B7562 {
	public static int[][] matrix;
	public static boolean[][] visited;
	public static int[] dx = {-2, -1, 1, 2, 2, 1, -1, -2};
	public static int[] dy = {1, 2, 2, 1, -1, -2, -2, -1};
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int tc = Integer.parseInt(br.readLine());
		
		while(tc-- > 0) {
			int l = Integer.parseInt(br.readLine());
			matrix = new int[l][l];
			visited = new boolean[l][l];
			
			String[] start = br.readLine().split(" ");
			int sX = Integer.parseInt(start[0]);
			int sY = Integer.parseInt(start[1]);
			
			String[] end = br.readLine().split(" ");
			int eX = Integer.parseInt(end[0]);
			int eY = Integer.parseInt(end[1]);
			
			
			bfs(l, sX, sY);
			sb.append(matrix[eX][eY]).append('\n');
		}
		System.out.print(sb);
	}
	
	public static void bfs(int line, int sX, int sY) {
		Queue<Node> queue = new LinkedList<>();
		queue.offer(new Node(sX, sY)); //시작 위치 큐에 담기
		visited[sX][sY] = true; //시작 위치 방문 표시
		
		while(!queue.isEmpty()) {
			Node temp = queue.poll();
			
			for(int i = 0; i < 8; i++) {
				int nextX = temp.x + dx[i];
				int nextY = temp.y + dy[i];
				
				if(nextX < 0 || nextY < 0 || nextX >= line || nextY >= line)
					continue;
				else if(!visited[nextX][nextY]) {
					visited[nextX][nextY] = true;
					matrix[nextX][nextY] = matrix[temp.x][temp.y] + 1;
					queue.offer(new Node(nextX, nextY));
				}
			}
		}
		
	}
}
