import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

//백준 2941 크로아티아 알파벳 (string)

public class B2941 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		String s = br.readLine();
		
		int cnt = 0;
		for(int i = 0; i < s.length(); i++) {
			if(s.charAt(i) == 'c') {
				if(i < s.length() - 1) {
					if(s.charAt(i+1) == '=') {
						i++;
					} else if(s.charAt(i+1) == '-') {
						i++;
					}
				}
				cnt++;
			} else if(s.charAt(i) == 'd') {
				if(i < s.length() - 2) {
					if(s.charAt(i+1) == 'z' && s.charAt(i+2) == '=') {
						i+=2;
					} 
				}
				if(i < s.length() - 1) {
					if(s.charAt(i+1) == '-') {
						i++;
					}
				}
				cnt++;
			} else if(s.charAt(i) == 'l' || s.charAt(i) == 'n') {
				if(i < s.length() - 1) {
					if(s.charAt(i+1) == 'j') {
						i++;
					}
				}
				cnt++;
			} else if(s.charAt(i) == 's' || s.charAt(i) == 'z') {
				if(i < s.length() - 1) {
					if(s.charAt(i+1) == '=') {
						i++;
					}
				}
				cnt++;
			} else {
				cnt++;
			}
		}
		
		bw.write(String.valueOf(cnt));
		bw.flush();
	}
}
