import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

//백준 10815 숫자 카드 (binary search)

public class B10815 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		StringBuilder sb = new StringBuilder();
		
		int n = Integer.parseInt(br.readLine());
		int[] arr = new int[n];
		
		st = new StringTokenizer(br.readLine());
		for(int i = 0; i < n; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		Arrays.sort(arr); //오름차순 정렬
		
		int m = Integer.parseInt(br.readLine());
		st = new StringTokenizer(br.readLine());
		for(int i = 0; i < m; i++) {
			int r = binarySearch(arr, Integer.parseInt(st.nextToken()));
			sb.append(r).append(' ');
		}
		System.out.print(sb);
	}
	public static int binarySearch(int[] arr, int target) {
		int start = 0;
		int end = arr.length - 1;
		int mid = (start+end)/2;
		
		while(end-start >= 0) {
			if(target == arr[mid]) {
				return 1;
			} else if(target > arr[mid]) {
				start = mid + 1;
			} else {
				end = mid - 1;
			}
			mid = (start+end)/2;
		}		
		return 0;
	}
}
