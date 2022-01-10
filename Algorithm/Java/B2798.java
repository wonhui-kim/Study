import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

//백준 2798 블랙잭 (브루트포스)

public class B2798 {
	
	public static int m;
	public static List<Integer> sumList;
	public static int index = 0;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String[] nm = br.readLine().split(" ");
		int n = Integer.parseInt(nm[0]); //카드 개수
		m = Integer.parseInt(nm[1]); //최종 목적 M
		
		String[] card = br.readLine().split(" ");
		
		int[] cards = new int[n];
		for(int i = 0; i < n; i++) {
			cards[i] = Integer.parseInt(card[i]); //cards 배열에 입력 값 저장
		}
		
		boolean[] visited = new boolean[n];
		
		sumList = new ArrayList<Integer>();
		//조합
		combination(cards, visited, 0, n, 3);
		
		int min = Integer.MAX_VALUE;
		int pos = -1;
		for(int i = 0; i < sumList.size(); i++) {
			int temp = m - sumList.get(i);
			if(temp >= 0 && temp < min) {
				min = temp;
				pos = i;
			}
		}
		
		System.out.println(sumList.get(pos));
	}
	
	static void combination(int[] arr, boolean[] visited, int start, int n, int r) {
	    
		if(r == 0) {
	        sum(arr, visited, n);
	        return;
	    } 

	    for(int i=start; i<n; i++) {
	        visited[i] = true;
	        combination(arr, visited, i + 1, n, r - 1);
	        visited[i] = false;
	    }
	}
	
	public static void sum(int[] arr, boolean[] visited, int n) {
		int sum = 0;
		for(int i = 0; i < n; i++) {
			if(visited[i]) {
				sum += arr[i];
			}
		}
		sumList.add(sum);
	}

}
