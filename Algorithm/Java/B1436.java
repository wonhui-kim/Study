import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//백준 1436 영화감독 숌 (브루트포스)

public class B1436 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	
		int n = Integer.parseInt(br.readLine());
		
		int count = 1;
		int number = 666;
		
		while(count != n) {
			
			if(number < 5660) {
				number += 1000;
			} else {
				number++;
			}
			
			if(String.valueOf(number).contains("666")) {
				count++;
			}
		}
		
		System.out.println(number);
	}
}
