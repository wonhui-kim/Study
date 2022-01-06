import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.NoSuchElementException;

//백준 2644 촌수계산 (bfs)

class Queue<T> {
	class Node<T> {
		private T data;
		private Node<T> next;
		
		public Node(T data) { //생성자
			this.data = data;
		}
	}
	
	private Node<T> first;
	private Node<T> last;
	
	public void enqueue(T data) {
		Node<T> t = new Node<T>(data);
		
		if(last != null) { //마지막 노드가 존재할 때
			last.next = t; //새로운 노드 t를 뒤에 갖다 붙인다.
		}
		last = t; //마지막 노드가 t가 된다.
		
		if(first == null) { //큐가 비어있으면(첫번째 노드조차 없으면)
			first = last; //첫번째 노드가 마지막 노드(새로 삽입한)가 된다.
		}
	}
	
	public T dequeue() { //처음 들어온 맨 앞의 데이터를 반환해야 함.
		if(first == null) { //큐가 비어있으면
			throw new NoSuchElementException();
		}
		
		T data = first.data;
		first = first.next;
		if(first == null) { //큐에 노드가 하나만 있었을 경우
			last = null; // 하나의 노드가 나가므로 마지막 노드도 null이 됨.
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
		
		public Node(int data) { //노드에 데이터 삽입
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
			nodes[i] = new Node(i); //nodes[1] = 1, ... nodes[0]은 버림.
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
		Queue<Node> queue = new Queue<Node>(); //큐 생성
		queue.enqueue(root); //1.큐에 넣기
		root.visited = true; //2.방문 표시
		
		int flag = 0;
		while(flag == 0) {
			if(queue.isEmpty()) {
				flag = 1;
				count = -1;
			} else {
				Node r = queue.dequeue(); //큐에서 하나 빼기
				count++;
				
				for(Node n : r.adjacent) { //r의 인접노드 반복				
					if(n.visited == false) {
						n.visited = true; //1.방문 표시
						queue.enqueue(n); //2.큐에 넣기
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
		Graph g = new Graph(n); //그래프 생성
		
		String[] s = br.readLine().split(" "); //밝혀야 할 촌수
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
