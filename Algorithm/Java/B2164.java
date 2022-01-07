import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

//���� 2164 ī��2 (Queue)

public class B2164 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		Queue<Integer> queue = new LinkedList<>(); //ť ����
		
		for(int i = 1; i <= n; i++) {
			queue.add(i); //ť�� �� �ֱ�
		}
		
		for(int i = 0; i < n-1; i++) {
			queue.poll(); //1. ù��° �� ����.
			int temp = queue.poll(); //2. ���� �� ���� + ����
			queue.add(temp); //3. ����� �� ť�� �߰�
		}
		
		System.out.print(queue.poll());
	}

}
