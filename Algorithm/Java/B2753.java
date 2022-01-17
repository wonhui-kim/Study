import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//πÈ¡ÿ 2753 ¿±≥‚ (if)

public class B2753 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int year = Integer.parseInt(br.readLine());
		System.out.print(isLeapYear(year));
	}
	
	public static int isLeapYear(int y) {
		if(y % 400 == 0)
			return 1;
		if(y%4 == 0 && y%100 != 0)
			return 1;
		
		return 0;
	}
}
