import java.util.ArrayList;
import java.util.Iterator;
public class Graphs {
	int v;
	ArrayList <Integer> adj[];
	Graphs(int noofvertex) {
		v = noofvertex;
		adj = new ArrayList[noofvertex];
		for(int i = 0; i < noofvertex;i++) {
			adj[i] = new ArrayList<>();
		}
	}
	void edge(int x, int y) {
		adj[x].add(y);
	}
	void Breadthfirstsearch(int source) {
		boolean[] visted = new boolean[v];
		ArrayList <Integer> a1 = new ArrayList<>();
		visted[source] = true;
		a1.add(source);
		while(! a1.isEmpty()) {
			source = a1.remove(0);
			System.out.print(source + " ");
			Iterator i = adj[source].iterator();
			while(i.hasNext()) {
				int n = (int) i.next();
				if(!visted[n]) {
					visted[n] = true;
					a1.add(n);
				}
			}
		}
	}
	public static void main(String[] args) {
		Graphs g1 =  new Graphs(6);
		g1.edge(0, 1);
		g1.edge(0, 2);
		g1.edge(0, 5);
		g1.edge(1, 0);
		g1.edge(1, 2);
		g1.edge(2, 0);
		g1.edge(2, 1);
		g1.edge(2, 3);
		g1.edge(2, 4);
		g1.edge(3, 2);
		g1.edge(4, 2);
		g1.edge(4, 5);
		g1.edge(5, 0);
		g1.edge(5, 4);
		g1.Breadthfirstsearch(0);
	}
	
}
