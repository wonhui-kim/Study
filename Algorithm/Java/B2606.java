import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;

//백준 2606 바이러스 (dfs, bfs)

class Graph {
	class Node {
		int data;
		LinkedList<Node> adjacent;
		boolean marked;
		
		Node(int data) {
			this.data = data;
			this.marked = false;
			adjacent = new LinkedList<Node>();
		}
	}
	Node[] nodes;
	int count = 0;
	
	Graph(int size) {
		nodes = new Node[size];
		for(int i = 0; i < size; i++) {
			nodes[i] = new Node(i+1);
		}
	}
	
	public void addEdge(int i, int j) {
		Node n1 = nodes[i];
		Node n2 = nodes[j];
		
		if(!n1.adjacent.contains(n2)) {
			n1.adjacent.add(n2);
		}
		if(!n2.adjacent.contains(n1)) {
			n2.adjacent.add(n1);
		}
	}
	
	public void dfsR(Node r) {
		if(r == null) return;
		r.marked = true;
		count();
		for(Node n : r.adjacent) {
			if(n.marked == false) {
				dfsR(n);
			}
		}
	}
	
	public void dfsR(int index) {
		dfsR(nodes[index - 1]);
	}
	
	public void count() {
		count++;
	}
}

public class B2606 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int numberOfComputer = Integer.parseInt(br.readLine());
		Graph g = new Graph(numberOfComputer);
		
		int numberOfEdge = Integer.parseInt(br.readLine());
		for(int i = 0; i < numberOfEdge; i++) {
			String[] edge = br.readLine().split(" ");
			
			int e1 = Integer.parseInt(edge[0]);
			int e2 = Integer.parseInt(edge[1]);
			
			g.addEdge(e1-1, e2-1);
		}
		
		g.dfsR(1);
		System.out.println(g.count - 1);
	}
}
