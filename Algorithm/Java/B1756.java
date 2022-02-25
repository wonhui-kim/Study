import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

//¹éÁØ 1756 ÇÇÀÚ ±Á±â (binary search)

public class B1756 {
	public static int min, depth;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st;
		
		st = new StringTokenizer(br.readLine());
		int d = Integer.parseInt(st.nextToken()); //±íÀÌ °³¼ö
		int n = Integer.parseInt(st.nextToken()); //¹ÝÁ× °³¼ö
		
		int oven[] = new int[d];
		st = new StringTokenizer(br.readLine());
		for(int i = 0; i < d; i++) {
			oven[i] = Integer.parseInt(st.nextToken()); //¿Àºì ±íÀÌ
		}
		reset(oven); //¿Àºì ±íÀÌ Àç¼³Á¤
		
		min = Integer.MAX_VALUE;
		depth = d-1;
		st = new StringTokenizer(br.readLine());
		for(int i = 0; i < n; i++) {
			binarySearch(oven, Integer.parseInt(st.nextToken()), 0, depth);;
		}
		min++;
		
		
		bw.write(String.valueOf(min));
		bw.flush();
	}
	public static void reset(int[] arr) { //Áö¸§ Àç¼³Á¤
		for(int i = 1; i < arr.length; i++) {
			if(arr[i] > arr[i-1]) {
				arr[i] = arr[i-1];
			}
		}
	}
	public static void binarySearch(int[] arr, int target, int top, int bottom) {
		int result = -1;
		while(top <= bottom) {
			int mid = (top+bottom)/2;
			if(target <= arr[mid]) {
				result = mid;
				top = mid + 1;
			} else {
				bottom = mid - 1;
			}
		}
		min = Math.min(min, result);
		depth = result - 1;
	}
}
