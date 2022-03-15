import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class B5622 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		String input = br.readLine();
		int cnt = 0;
		for(int i = 0; i < input.length(); i++) {
			char c = input.charAt(i);
			if(c >= 'A' && c <= 'C') {
				cnt += 3;
			} else if(c >= 'D' && c <= 'F') {
				cnt += 4;
			} else if(c >= 'G' && c <= 'I') {
				cnt += 5;
			} else if(c >= 'J' && c <= 'L') {
				cnt += 6;
			} else if(c >= 'M' && c <= 'O') {
				cnt += 7;
			} else if(c >= 'P' && c <= 'S') {
				cnt += 8;
			} else if(c >= 'T' && c <= 'V') {
				cnt += 9;
			} else if(c >= 'W' && c <= 'Z') {
				cnt += 10;
			}
		}
			
		bw.write(String.valueOf(cnt));
		bw.flush();
	}
}
