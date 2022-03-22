import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

//백준 2442 별 찍기-5

public class B2442 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		//000010000 2*0 + 1   414
		//000111000 2*1 + 1   333
		//001111100 2*2 + 1   252
		//011111110 2*3 + 1   171
		//111111111 2*4 + 1   0
		
		int n = Integer.parseInt(br.readLine());
		
		StringBuilder sb = new StringBuilder();
		String star = "*";
		String empty = " ";
		for(int i = 0; i < n; i++) {
			sb.append(empty.repeat(n-i-1));
			sb.append(star.repeat(2*i+1)).append('\n');
		}
		
		bw.write(sb.toString());
		bw.flush();
	}
}
