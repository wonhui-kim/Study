import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

public class B10815 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int n = Integer.parseInt(br.readLine()); //상근이 카드 개수
		int[] own = new int[n];
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		for(int i = 0; i < n; i++) {
			own[i] = Integer.parseInt(st.nextToken());
		}
		
		Arrays.sort(own); //오름차순 정렬
		
		int m = Integer.parseInt(br.readLine()); //주어진 카드 개수
		
		StringBuilder sb = new StringBuilder();
		st = new StringTokenizer(br.readLine());
		for(int i = 0; i < m; i++) {
			sb.append(binarySearch(Integer.parseInt(st.nextToken()), own)).append(' ');
		}
		
		bw.write(sb.toString());
		bw.flush();
	}
	public static int binarySearch(int target, int[] arr) {
		int start = 0;
		int end = arr.length - 1;
		int mid = (start+end)/2;
		
		while(end-start >= 0) {
			if(arr[mid] == target) {
				return 1;
			} else if(arr[mid] <= target) {
				start = mid + 1;
			} else if(arr[mid] > target) {
				end = mid - 1;
			}
			mid = (start+end)/2;
		}
		
		return 0;
	}
}
