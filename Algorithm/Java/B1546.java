import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class B1546 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int n = Integer.parseInt(br.readLine());
		double[] score = new double[n];
		StringTokenizer st = new StringTokenizer(br.readLine());
		score[0] = Integer.parseInt(st.nextToken());
		double max = score[0];
		for(int i = 1; i < n; i++) {
			score[i] = Integer.parseInt(st.nextToken());
			max = Math.max(max, score[i]);
		}
		
		double sum = 0;
		for(int i = 0; i < n; i++) {
			score[i] = score[i]/max*100;
			sum += score[i];
		}
		
		bw.write(String.valueOf(sum/n));
		bw.flush();
	}
}
