import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

//백준 1516 게임 개발 (Topological sort)

public class B1516 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st;
		
		int n = Integer.parseInt(br.readLine()); //건물 종류 수
		int[] time = new int[n+1];//각 작업 당 소요 시간
		int[] dp = new int[n+1];
		int[] indegree = new int[n+1];
		
		ArrayList<ArrayList<Integer>> list = new ArrayList<>();
		for(int i = 0; i <= n; i++) {
			list.add(new ArrayList<>());
		}
		
		for(int i = 1; i <= n; i++) {
			st = new StringTokenizer(br.readLine());
			
			time[i] = Integer.parseInt(st.nextToken());
			
			while(true) {
				int temp_num = Integer.parseInt(st.nextToken());
				
				if(temp_num == -1) {
					break;
				}
				
				list.get(temp_num).add(i);
				indegree[i]++;
			}
		}
		
		Queue<Integer> q = new LinkedList<>();
		for(int i = 1; i <= n; i++) {
			if(indegree[i] == 0) { //선행 작업이 없으면 큐에 삽입
				dp[i] = time[i];
				q.add(i);
			}
		}
		
		while(!q.isEmpty()) {
			int cur = q.poll();
			for(int next : list.get(cur)) {
				indegree[next]--;
				dp[next] = Math.max(dp[next], time[next]+dp[cur]);
				
				if(indegree[next] == 0) {
					q.add(next);
				}
			}
		}
		
		StringBuilder sb = new StringBuilder();
		for(int i = 1; i <= n; i++) {
			sb.append(dp[i]).append('\n');
		}
		
		bw.write(sb.toString());
		bw.flush();
	}

}
