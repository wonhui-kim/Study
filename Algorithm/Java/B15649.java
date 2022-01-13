import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//백준 15649 N과 M(1) (백트래킹)

public class B15649 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String[] nm = br.readLine().split(" ");
		
		int n = Integer.parseInt(nm[0]);
		int m = Integer.parseInt(nm[1]);
		
		int[] arr = new int[n];
		int[] output = new int[n];
		boolean[] visited = new boolean[n];
		
		for(int i = 0; i < n; i++) {
			arr[i] = i + 1;
		}
		
		//순열
		permutation(arr, output, visited, 0, n, m);
	}
	
	public static void permutation(int[] arr, int[] output, boolean[] visited, int depth, int n, int r) {
		if(depth == r) {
			print(output, r);
			return;
		}
		
		for(int i = 0; i < n; i++) {
			if(visited[i] != true) {
				visited[i] = true;
				output[depth] = arr[i];
				permutation(arr, output, visited, depth+1, n, r);
				visited[i] = false;
			}
		}
		
	}
	
	public static void print(int[] arr, int r) {
		for(int i = 0; i < r; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}
}
