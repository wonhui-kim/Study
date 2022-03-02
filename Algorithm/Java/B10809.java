import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;

public class B10809 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int[] alpha = new int[26];
		Arrays.fill(alpha, -1);
		
		char[] temp = br.readLine().toCharArray();
		for(int i = 0; i < temp.length; i++) {
			if(alpha[temp[i]-97] == -1) {
				alpha[temp[i]-97] = i;
			}			
		}
		
		StringBuilder sb = new StringBuilder();
		for(int i = 0; i < alpha.length; i++) {
			sb.append(alpha[i]).append(" ");
		}
		
		bw.write(sb.toString());
		bw.flush();
	}
}
