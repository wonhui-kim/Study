import java.util.LinkedList;
import java.util.NoSuchElementException;
import java.util.Stack;

class Queue<T> {
	class Node<T> {
		private T data;
		private Node<T> next;
		
		public Node(T data) {
			this.data = data;
		}
	}
	
	private Node<T> first;
	private Node<T> last;
	
	public void enqueue(T item) { //추가 시 item 받아서 새로운 Node 생성
		Node<T> t = new Node<T>(item);
		
		if(last != null) { //마지막 Node 존재 시
			last.next = t; //마지막 Node 뒤에 새로운 노드 붙이기
		}
		last = t; //마지막 Node는 t
		
		if(first == null) { //Node가 하나도 존재하지 않는 경우(queue가 비어있음)
			first = last; //첫번째 노드 = 마지막 노드
		}
	}
	
	public T dequeue() {
		if(first == null) { // queue가 비어있는 경우
			throw new NoSuchElementException();
		}
		
		T data = first.data; //데이터 백업
		first = first.next;
		if(first == null) {
			last = null;
		}
		return data;
	}
	
	public T peek() {
		if(first == null) { // queue가 비어있는 경우
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
		boolean marked; //방문 확인용
		
		public Node (int data){
			this.data = data;
			this.marked = false;
			adjacent = new LinkedList<Node>();
		}
	}
	
	Node[] nodes;
	Graph(int size){
		nodes = new Node[size];
		for(int i = 0; i < size; i++) {
			nodes[i] = new Node(i);
		}
	}
	
	void addEdge(int i, int j) { //두 노드 사이 간선 저장
		Node n1 = nodes[i];
		Node n2 = nodes[j];
		
		if(!n1.adjacent.contains(n2)) { //서로의 LinkedList에 존재하지 않으면 추가
			n1.adjacent.add(n2);
		}
		if(!n2.adjacent.contains(n1)) {
			n2.adjacent.add(n1);
		}
	}
	
	void dfs() { //그냥 호출 시
		dfs(0); //0부터 시작
	}
	
	void dfs(int index) {
		Node root = nodes[index];
		Stack<Node> stack = new Stack<Node>();
		stack.push(root); //루트를 스택에 추가
		root.marked = true; //방문 표시
		
		while(!stack.isEmpty()) { //스택에 데이터가 없을 때까지 반복
			Node r = stack.pop();
			for(Node n : r.adjacent) { //r의 인접 노드 검사
				if(n.marked == false) { //아직 방문하지 않은 노드일 경우
					n.marked = true; //방문 표시
					stack.push(n); //스택에 추가
				}
			}
			visit(r); //출력
		}
	}
	
	void bfs(int index) {
		Node root = nodes[index];
		Queue<Node> queue = new Queue<Node>();
		queue.enqueue(root); //큐에 추가
		root.marked = true;
		while(!queue.isEmpty()) { //큐에 데이터가 없을 때까지 반복
			Node r = queue.dequeue();
			for(Node n : r.adjacent) {
				if(n.marked == false) {
					n.marked = true;
					queue.enqueue(n);
				}
			}
			visit(r);
		}
	}
	
	void dfsR(Node r) { //dfs 재귀호출(recursion)
		if(r == null) return; //받은 노드가 null일 때
		r.marked = true;
		visit(r); //1)출력 먼저
		for(Node n : r.adjacent) { //r의 인접 노드들
			if(n.marked == false) { //중 아직 방문하지 않은 노드
				dfsR(n);
			}
		}
	}
	
	void dfsR(int index) {
		Node r = nodes[index];
		dfsR(r);
	}
	
	void dfsR() {
		dfsR(0);
	}
	
	void visit(Node n) {
		System.out.print(n.data + " ");
	}
}

public class PracticeDfsBfs {

	public static void main(String[] args) {
		/*     0
		 *    / 
		 *   1 - 3    7
		 *   |   | \ /
		 *   | / |  5
		 *   |   |   \
		 *   2 - 4     6 - 8 
		 */
		Graph g = new Graph(9);
		g.addEdge(0, 1);
		g.addEdge(1, 2);
		g.addEdge(1, 3);
		g.addEdge(2, 4);
		g.addEdge(2, 3);
		g.addEdge(3, 4);
		g.addEdge(3, 5);
		g.addEdge(5, 6);
		g.addEdge(5, 7);
		g.addEdge(6, 8);
		
		//g.dfs(); //0부터 시작
		//g.bfs(0);
		g.dfsR();
	}

}
