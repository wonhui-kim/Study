import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//백준 7568 덩치 (브루트포스)

class Body {
	int height;
	int weight;
	
	public Body(int height, int weight) {
		this.height = height;
		this.weight = weight;
	}
}

public class B7568 {
	
	public static int n;
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		n = Integer.parseInt(br.readLine());
		
		Body[] list = new Body[n];
		
		for(int i = 0; i < n; i++) {
			String[] temp = br.readLine().split(" ");
			int height = Integer.parseInt(temp[0]);
			int weight = Integer.parseInt(temp[1]);
			
			list[i] = new Body(height, weight); //배열 생성
		}
		
		ranking(list);		
	}
	
	public static void ranking(Body[] list) {
		for(int i = 0; i < n; i++) {
			int rank = 1;
			for(int j = 0; j < n; j++) {
				if(i==j) continue; //같은 경우 skip
				
				if(list[i].height < list[j].height && list[i].weight < list[j].weight) {
					rank++;
				}
			}
			System.out.print(rank + " ");
		}
	}
	
}
