import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

//백준 9251 LCS (dp)

public class B9251 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		char[] first = br.readLine().toCharArray();
		char[] second = br.readLine().toCharArray();
		int[][] lcs = new int[first.length+1][second.length+1];
		
		for(int i = 0; i <= first.length; i++) {
			for(int j = 0; j <= second.length; j++) {
				if(i==0 || j==0) {
					lcs[i][j] = 0;
				} else if(first[i-1] == second[j-1]) {
					lcs[i][j] = lcs[i-1][j-1] + 1;
				} else {
					lcs[i][j] = Math.max(lcs[i-1][j], lcs[i][j-1]);
				}
			}
		}
		
		bw.write(String.valueOf(lcs[first.length][second.length]));
		bw.flush();
	}
}
