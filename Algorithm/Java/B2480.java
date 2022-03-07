import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

//백준 2480 주사위 세개 (if)

public class B2480 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int a = Integer.parseInt(st.nextToken());
		int b = Integer.parseInt(st.nextToken());
		int c = Integer.parseInt(st.nextToken());
		
		int prize = 0;
		if(a == b && b == c) { //a=b=c인 경우
			prize = 10000 + (a*1000);
		} else if (a == b || b == c || c == a) { //2개만 같은 경우
			int same = -1;
			if(a == b) {
				same = a;
			} else if(b == c){
				same = b;
			} else {
				same = c;
			}
			
			prize = 1000 + (same*100);
		} else {
			prize = Math.max(a, Math.max(b, c)) * 100;
		}
		
		bw.write(String.valueOf(prize));
		bw.flush();
	}
}
