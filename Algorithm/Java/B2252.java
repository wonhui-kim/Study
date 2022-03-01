import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

//���� 2252 �� ����� (topological sorting)

public class B2252 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken()); //�л� ��
		int m = Integer.parseInt(st.nextToken()); //Ű �� ȸ��
		
		ArrayList<Integer>[] list = new ArrayList[n+1];
		for(int i = 1; i <= n; i++) {
			list[i] = new ArrayList<Integer>();
		}
		
		int[] indegree = new int[n+1]; //���� ���� ����
		for(int i = 0; i < m; i++) {
			st = new StringTokenizer(br.readLine());
			
			int x = Integer.parseInt(st.nextToken());
			int y = Integer.parseInt(st.nextToken());
			
			list[x].add(y);
			indegree[y]++;
		}
		
		Queue<Integer> queue = new LinkedList<Integer>(); //ť ����
		for(int i = 1; i <= n; i++) {
			if(indegree[i] == 0) {
				queue.add(i);
			}
		}
		
		while(!queue.isEmpty()) {
			int cur = queue.poll();
			sb.append(cur).append(' ');
			
			for(int i = 0; i < list[cur].size(); i++) {
				int next = list[cur].get(i);
				indegree[next]--;
				if(indegree[next] == 0) {
					queue.add(next);
				}
			}
		}
		
		System.out.print(sb);
	}
}
