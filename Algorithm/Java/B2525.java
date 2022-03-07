import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

//백준 2525 오븐 시계

public class B2525 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int hour = Integer.parseInt(st.nextToken());
		int minute = Integer.parseInt(st.nextToken());
		
		int time = Integer.parseInt(br.readLine()); //소요 시간
		
		minute += time % 60;
		hour += time / 60;
		
		if(minute >= 60) {
			minute -= 60;
			hour++;
		}
		if(hour >= 24) {
			hour -= 24;
		}
		
		bw.write(String.valueOf(hour) + " " + String.valueOf(minute));
		bw.flush();
	}
}
