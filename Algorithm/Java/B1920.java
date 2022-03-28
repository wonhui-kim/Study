import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

//백준 1920 수 찾기 (binary search)

public class B1920 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int n = Integer.parseInt(br.readLine()); //a 그룹
		int[] a = new int[n];
		StringTokenizer st = new StringTokenizer(br.readLine());
		for(int i = 0; i < n; i++) {
			a[i] = Integer.parseInt(st.nextToken());
		}
		
		Arrays.sort(a); //이분탐색 위해 정렬 필수
		
		int m = Integer.parseInt(br.readLine());
		st = new StringTokenizer(br.readLine());
		
		StringBuilder sb = new StringBuilder();
		for(int i = 0; i < m; i++) {
			sb.append(binarySearch(a, Integer.parseInt(st.nextToken()))).append('\n');
		}
		
		bw.write(sb.toString());
		bw.flush();
		
	}
	public static int binarySearch(int[] arr, int target) {
		int start = 0;
		int end = arr.length - 1;
		int mid = (start+end)/2;
		
		while(end-start >= 0) {
			if(arr[mid] == target) {
				return 1;
			} else if(arr[mid] > target) {
				end = mid - 1;
			} else if(arr[mid] <= target) {
				start = mid + 1;
			}
			mid = (start+end)/2;
		}
		
		return 0;
	}
}
