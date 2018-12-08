package Class14;
import Class14.Graph;

public class GraphTheory {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Graph a = new Graph(5);
		
		// Adding edges
		a.addEdge(0, 1);
		a.addWeight(0, 1, 10);
		a.addEdge(0, 2);
		a.addWeight(0, 2, 3);
		a.addEdge(1, 2);
		a.addWeight(1, 2, 1);
		a.addEdge(1, 3);
		a.addWeight(1, 3, 2);
		a.addEdge(2, 1);
		a.addWeight(2, 1, 4);
		a.addEdge(2, 3);
		a.addWeight(2, 3, 8);
		a.addEdge(2, 4);
		a.addWeight(2, 4, 2);
		a.addEdge(3, 4);
		a.addWeight(3, 4, 7);
		a.addEdge(4, 3);
		a.addWeight(4, 3, 9);
		a.dijkstra(1);
	}

}
