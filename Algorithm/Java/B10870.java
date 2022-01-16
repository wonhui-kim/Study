import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//���� 10870 �Ǻ���ġ �� 5 (���)

public class B10870 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		
		System.out.print(fibo(n));
	}
	
	public static int fibo(int n) {
		if(n==0 || n==1) {
			return n;
		}
		
		return fibo(n-1) + fibo(n-2);
	}
}
