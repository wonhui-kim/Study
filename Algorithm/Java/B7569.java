import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

//백준 7569 토마토 (bfs)

class Node {
	int x;
	int y;
	int h;
	
	Node(int x, int y, int h){
		this.x = x;
		this.y = y;
		this.h = h;
	}
}

public class B7569 {
	public static int m, n, h;
	public static int[][][] matrix;
	public static int[] dx = {-1, 0, 1, 0, 0, 0};
	public static int[] dy = {0, -1, 0, 1, 0, 0};
	public static int[] dh = {0, 0, 0, 0, 1, -1};
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String[] temp = br.readLine().split(" ");
		m = Integer.parseInt(temp[0]); //5
		n = Integer.parseInt(temp[1]); //3
		h = Integer.parseInt(temp[2]);
		
		matrix = new int[n][m][h]; //3 x 5 x 1
		
		for(int i = 0; i < h; i++) { //1
			for(int j = 0; j < n; j++) { //3
				temp = br.readLine().split(" ");
				for(int k = 0; k < m; k++) { //5
					matrix[j][k][i] = Integer.parseInt(temp[k]);
				}
			}
		}
		
		bfs();
	}
	public static void bfs() {
		Queue<Node> queue = new LinkedList<>();
		
		for(int i = 0; i < h; i++) {
			for(int j = 0; j < n; j++) {
				for(int k = 0; k < m; k++) {
					if(matrix[j][k][i] == 1) {
						queue.offer(new Node(j, k, i));
					}
				}
			}
		}
		
		while(!queue.isEmpty()) {
			Node ripe = queue.poll();
			
			for(int i = 0; i < 6; i++) {
				int nextX = ripe.x + dx[i];
				int nextY = ripe.y + dy[i];
				int nextH = ripe.h + dh[i];
				
				if(nextX < 0 || nextY < 0 || nextH < 0 || nextX >= n || nextY >= m || nextH >= h)
					continue;
				else if(matrix[nextX][nextY][nextH] == 0) {
					matrix[nextX][nextY][nextH] = matrix[ripe.x][ripe.y][ripe.h] + 1;
					queue.offer(new Node(nextX, nextY, nextH));
				}
			}			
		}
		
		System.out.print(checkTomato());
	}
	
	public static int checkTomato() {
		int max = 0;
		for(int i = 0; i < h; i++) {
			for(int j = 0; j < n; j++) {
				for(int k = 0; k < m; k++) {
					if(matrix[j][k][i] == 0) {
						return -1;
					}
					max = Math.max(max, matrix[j][k][i]);
				}
			}
		}
		
		return max-1;
	}
}
