import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class B2056 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st;
		
		int n = Integer.parseInt(br.readLine());
		
		//각 작업 시간
		int[] time = new int[n+1];
		//각 누적 작업 시간
		int[] acc = new int[n+1];
		//선행 작업 수
		int[] indegree = new int[n+1];
		
		ArrayList<ArrayList<Integer>> list = new ArrayList<>();
		for(int i = 0; i<= n; i++) {
			list.add(new ArrayList<>());
		}
		
		Queue<Integer> q = new LinkedList<>();
		for(int i = 1; i <= n; i++) {
			st = new StringTokenizer(br.readLine());
			time[i] = Integer.parseInt(st.nextToken());
			
			int num = Integer.parseInt(st.nextToken());
			indegree[i] = num; //선행 작업 개수
			
			if(num == 0) {
				acc[i] = time[i];
				q.add(i);
			}
			
			for(int j = 0; j < num; j++) {
				list.get(Integer.parseInt(st.nextToken())).add(i);
			}
		}
		
		
		while(!q.isEmpty()) {
			for(int i = 0; i < q.size(); i++) {
				int cur = q.poll();
				for(int next : list.get(cur)) {
					indegree[next]--;
					acc[next] = Math.max(acc[next], acc[cur]+time[next]);
					
					if(indegree[next] == 0) {
						q.add(next);
					}
				}
			}
		}
		
		int max = 0;
		for(int candidate : acc) {
			max = Math.max(max, candidate);
		}
		
		bw.write(String.valueOf(max));
		bw.flush();
	}
}
