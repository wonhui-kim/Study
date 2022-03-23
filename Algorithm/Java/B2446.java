import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class B2446 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int n = Integer.parseInt(br.readLine());
		
		//9 2*4+1 090
		//7       171 
		//5       252
		//3 2*1+1 333
		//1 2*0+1 414
		//3
		//5
		//7
		//9
		
		StringBuilder sb = new StringBuilder();
		String star = "*";
		String empty = " ";
		for(int i = 0; i < n; i++) {
			String temp = empty.repeat(n-i-1);
			temp += star.repeat(2*i+1);
			
			if(i > 0) {
				sb.insert(0, temp + "\n");
			} 
			sb.append(temp).append('\n');
		}
		
		bw.write(sb.toString());
		bw.flush();
	}
}
