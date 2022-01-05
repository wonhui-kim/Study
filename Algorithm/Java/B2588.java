import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//백준 2588 곱셈

public class B2588 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int a = Integer.parseInt(br.readLine()); //첫번째 숫자
		String b = br.readLine(); // 두번째 숫자
		
		System.out.println(a*(b.charAt(2) - 48)); //char형 - ascii code 
		System.out.println(a*(b.charAt(1) - 48));
		System.out.println(a*(b.charAt(0) - '0'));
		
		System.out.println(a * Integer.parseInt(b));
	}

}
