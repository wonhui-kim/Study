import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

//백준 2164 카드2 (Queue)

public class B2164 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		Queue<Integer> queue = new LinkedList<>(); //큐 선언
		
		for(int i = 1; i <= n; i++) {
			queue.add(i); //큐에 값 넣기
		}
		
		for(int i = 0; i < n-1; i++) {
			queue.poll(); //1. 첫번째 값 삭제.
			int temp = queue.poll(); //2. 다음 값 삭제 + 저장
			queue.add(temp); //3. 저장된 값 큐에 추가
		}
		
		System.out.print(queue.poll());
	}

}
