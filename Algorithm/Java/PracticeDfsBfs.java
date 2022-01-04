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
	
	public void enqueue(T item) { //�߰� �� item �޾Ƽ� ���ο� Node ����
		Node<T> t = new Node<T>(item);
		
		if(last != null) { //������ Node ���� ��
			last.next = t; //������ Node �ڿ� ���ο� ��� ���̱�
		}
		last = t; //������ Node�� t
		
		if(first == null) { //Node�� �ϳ��� �������� �ʴ� ���(queue�� �������)
			first = last; //ù��° ��� = ������ ���
		}
	}
	
	public T dequeue() {
		if(first == null) { // queue�� ����ִ� ���
			throw new NoSuchElementException();
		}
		
		T data = first.data; //������ ���
		first = first.next;
		if(first == null) {
			last = null;
		}
		return data;
	}
	
	public T peek() {
		if(first == null) { // queue�� ����ִ� ���
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
		boolean marked; //�湮 Ȯ�ο�
		
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
	
	void addEdge(int i, int j) { //�� ��� ���� ���� ����
		Node n1 = nodes[i];
		Node n2 = nodes[j];
		
		if(!n1.adjacent.contains(n2)) { //������ LinkedList�� �������� ������ �߰�
			n1.adjacent.add(n2);
		}
		if(!n2.adjacent.contains(n1)) {
			n2.adjacent.add(n1);
		}
	}
	
	void dfs() { //�׳� ȣ�� ��
		dfs(0); //0���� ����
	}
	
	void dfs(int index) {
		Node root = nodes[index];
		Stack<Node> stack = new Stack<Node>();
		stack.push(root); //��Ʈ�� ���ÿ� �߰�
		root.marked = true; //�湮 ǥ��
		
		while(!stack.isEmpty()) { //���ÿ� �����Ͱ� ���� ������ �ݺ�
			Node r = stack.pop();
			for(Node n : r.adjacent) { //r�� ���� ��� �˻�
				if(n.marked == false) { //���� �湮���� ���� ����� ���
					n.marked = true; //�湮 ǥ��
					stack.push(n); //���ÿ� �߰�
				}
			}
			visit(r); //���
		}
	}
	
	void bfs(int index) {
		Node root = nodes[index];
		Queue<Node> queue = new Queue<Node>();
		queue.enqueue(root); //ť�� �߰�
		root.marked = true;
		while(!queue.isEmpty()) { //ť�� �����Ͱ� ���� ������ �ݺ�
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
	
	void dfsR(Node r) { //dfs ���ȣ��(recursion)
		if(r == null) return; //���� ��尡 null�� ��
		r.marked = true;
		visit(r); //1)��� ����
		for(Node n : r.adjacent) { //r�� ���� ����
			if(n.marked == false) { //�� ���� �湮���� ���� ���
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
		
		//g.dfs(); //0���� ����
		//g.bfs(0);
		g.dfsR();
	}

}
