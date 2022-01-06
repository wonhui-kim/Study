import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.NoSuchElementException;

//���� 2644 �̼���� (bfs)

class Queue<T> {
	class Node<T> {
		private T data;
		private Node<T> next;
		
		public Node(T data) { //������
			this.data = data;
		}
	}
	
	private Node<T> first;
	private Node<T> last;
	
	public void enqueue(T data) {
		Node<T> t = new Node<T>(data);
		
		if(last != null) { //������ ��尡 ������ ��
			last.next = t; //���ο� ��� t�� �ڿ� ���� ���δ�.
		}
		last = t; //������ ��尡 t�� �ȴ�.
		
		if(first == null) { //ť�� ���������(ù��° ������� ������)
			first = last; //ù��° ��尡 ������ ���(���� ������)�� �ȴ�.
		}
	}
	
	public T dequeue() { //ó�� ���� �� ���� �����͸� ��ȯ�ؾ� ��.
		if(first == null) { //ť�� ���������
			throw new NoSuchElementException();
		}
		
		T data = first.data;
		first = first.next;
		if(first == null) { //ť�� ��尡 �ϳ��� �־��� ���
			last = null; // �ϳ��� ��尡 �����Ƿ� ������ ��嵵 null�� ��.
		}
		
		return data;		
	}
	
	public T peek() {
		if(first == null) {
			throw new NoSuchElementException();
		}
		return first.data;
	}
	
	public boolean isEmpty() {
		return first == null;
	}
}

class Graph {
	class Node {
		int data;
		LinkedList<Node> adjacent;
		boolean visited;
		
		public Node(int data) { //��忡 ������ ����
			this.data = data;
			adjacent = new LinkedList<Node>();
			this.visited = false;
		}
	}

	Node[] nodes;
	int count = 0;
	
	Graph(int size) {
		nodes = new Node[size + 1];
		for(int i = 0; i < size + 1; i++) {
			nodes[i] = new Node(i); //nodes[1] = 1, ... nodes[0]�� ����.
		}
	}
	
	void addEdge(int i, int j) { //1, 2
		Node n1 = nodes[i]; 
		Node n2 = nodes[j];
		
		if(!n1.adjacent.contains(n2)) {
			n1.adjacent.add(n2);
		}
		if(!n2.adjacent.contains(n1)) {
			n2.adjacent.add(n1);
		}
	}
	
	void bfs(int index, int key) {
		Node root = nodes[index];
		Queue<Node> queue = new Queue<Node>(); //ť ����
		queue.enqueue(root); //1.ť�� �ֱ�
		root.visited = true; //2.�湮 ǥ��
		
		int flag = 0;
		while(flag == 0) {
			if(queue.isEmpty()) {
				flag = 1;
				count = -1;
			} else {
				Node r = queue.dequeue(); //ť���� �ϳ� ����
				count++;
				
				for(Node n : r.adjacent) { //r�� ������� �ݺ�				
					if(n.visited == false) {
						n.visited = true; //1.�湮 ǥ��
						queue.enqueue(n); //2.ť�� �ֱ�
					}
					if(n.data == key) {
						flag = 1;
					}
				}
			}
		}
	}
	
	void visit(Node n) {
		System.out.print(n.data + " ");
	}
}

public class B2644 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		Graph g = new Graph(n); //�׷��� ����
		
		String[] s = br.readLine().split(" "); //������ �� �̼�
		int a = Integer.parseInt(s[0]);
		int b = Integer.parseInt(s[1]);
		
		int numOfEdge = Integer.parseInt(br.readLine());
		
		for(int i = 0; i < numOfEdge; i++) {
			s = br.readLine().split(" ");
			int e1 = Integer.parseInt(s[0]);
			int e2 = Integer.parseInt(s[1]);

			g.addEdge(e1, e2);
		}
		
		g.bfs(a, b);
		System.out.println(g.count);
	}

}
