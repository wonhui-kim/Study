import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

//���� 11659 �����ձ��ϱ�4 (Prefix sum)

public class B11659 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int n = Integer.parseInt(st.nextToken()); //���� ����
		int m = Integer.parseInt(st.nextToken()); //���� ���ؾ� �ϴ� Ƚ��
		
		int[] arr = new int[n+1];
		
		st = new StringTokenizer(br.readLine()); //n���� ��
		int acc = 0;
		for(int i = 1; i <= n; i++) {
			acc += Integer.parseInt(st.nextToken());
			arr[i] += acc;
		}
		
		StringBuilder sb = new StringBuilder();
		for(int k = 0; k < m; k++) {
			st = new StringTokenizer(br.readLine());
			int i = Integer.parseInt(st.nextToken());
			int j = Integer.parseInt(st.nextToken());
			
			sb.append(arr[j] - arr[i-1]).append('\n');
		}
		
		bw.write(sb.toString());
		bw.flush();
	}
}
