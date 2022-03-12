import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

//백준 1157 단어 공부 (String)

public class B1157 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int[] alpha = new int[26];
		String s = br.readLine();
		
		for(int i = 0; i < s.length(); i++) {
			if(s.charAt(i) >= 'A' && s.charAt(i) <= 'Z') {
				alpha[s.charAt(i) - 'A']++;
			} else {
				alpha[s.charAt(i) - 'a']++;
			}
		}
		
		int max = -1;
		char ch = '?';
		for(int i = 0; i < alpha.length; i++) {
			if(alpha[i] > max) {
				max = alpha[i];
				ch = (char)(i + 'A');
			} else if(alpha[i] == max) {
				ch = '?';
			}
		}
		
		bw.write(ch);
		bw.flush();
	}
}
