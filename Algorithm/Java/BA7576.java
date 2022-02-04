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
public class BA7576 {
	public static int n, m;
	public static int[][] matrix;
	public static int[] dx = {-1, 0, 1, 0};
	public static int[] dy = {0, -1, 0, 1};
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String[] temp = br.readLine().split(" ");
		m = Integer.parseInt(temp[0]); //가로-열 ex)6
		n = Integer.parseInt(temp[1]); //세로-행 ex)4
		
		matrix = new int[n][m];
		
		for(int i = 0; i < n; i++) { // 4
			temp = br.readLine().split(" "); // 0 0 0 0 0 1
			for(int j = 0; j < m; j++) { // 6
				matrix[i][j] = Integer.parseInt(temp[j]);
			}
		}
		bfs();
	}
	
	public static void bfs() {
		Queue<Node> queue = new LinkedList<>();
		
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < m; j++) {
				if(matrix[i][j] == 1) { //익은 토마토 위치를 큐에 담는다.
					queue.offer(new Node(i, j));
				}
			}
		}
		
		while(!queue.isEmpty()) {
			Node ripe = queue.poll();
			
			for(int i = 0; i < 4; i++) {
				int nextX = ripe.x + dx[i];
				int nextY = ripe.y + dy[i];
				
				if(nextX < 0 || nextY < 0 || nextX >= n || nextY >= m)
					continue;
				else if(matrix[nextX][nextY] == 0) {
					matrix[nextX][nextY] = matrix[ripe.x][ripe.y] + 1;
					queue.offer(new Node(nextX, nextY));
				}
			}			
		}
		
		System.out.print(checkTomato());
		
	}
	
	public static int checkTomato() {
		int max = 0;
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < m; j++) {
				if(matrix[i][j] == 0)
					return -1;
				max = Math.max(max, matrix[i][j]);
			}
		}
		return max-1;
	}
	
	public static void print() {
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < m; j++) {
				System.out.print(matrix[i][j]);
			}
			System.out.println();
		}
	}
	
	
}
