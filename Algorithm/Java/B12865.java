import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

//���� 12865 ����ѹ賶 (dp)

public class B12865 {
	public static int[][] bag;
	public static Integer[][] dp;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		String[] temp = br.readLine().split(" ");
		int n = Integer.parseInt(temp[0]); //��ǰ ��
		int k = Integer.parseInt(temp[1]); //��ƿ �� �ִ� ����
		
		bag = new int[n][2]; //0�� ����, 1�� ��ġ
		
		for(int i = 0; i < n; i++) {
			temp = br.readLine().split(" ");
			bag[i][0] = Integer.parseInt(temp[0]); //w
			bag[i][1] = Integer.parseInt(temp[1]); //v
		}
		
		dp = new Integer[n][k+1];
		
		bw.write(String.valueOf(knapsack(n-1, k)));
		bw.flush();
	}
	public static int knapsack(int n, int k) {
		if(n < 0) {
			return 0;
		}
		
		if(dp[n][k] == null) {
			if(bag[n][0] > k) {
				dp[n][k] = knapsack(n-1, k);
			}
			else {
				dp[n][k] = Math.max(knapsack(n-1, k), knapsack(n-1, k-bag[n][0])+bag[n][1]);
			}
		}
		return dp[n][k];
	}
}
