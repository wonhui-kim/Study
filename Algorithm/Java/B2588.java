import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//���� 2588 ����

public class B2588 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int a = Integer.parseInt(br.readLine()); //ù��° ����
		String b = br.readLine(); // �ι�° ����
		
		System.out.println(a*(b.charAt(2) - 48)); //char�� - ascii code 
		System.out.println(a*(b.charAt(1) - 48));
		System.out.println(a*(b.charAt(0) - '0'));
		
		System.out.println(a * Integer.parseInt(b));
	}

}
