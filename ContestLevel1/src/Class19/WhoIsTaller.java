package Class19;
import java.util.*;
import Class19.Graph;
import Class19.DFS;

public class WhoIsTaller {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Using Dijikstras
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		/*
		Graph a = new Graph(n+1);
		for (int i = 0; i < m; i++) {
			int x = sc.nextInt();
			int y = sc.nextInt();
			a.addEdge(x, y);
			a.addWeight(x, y, 1);
		}
		int x1 = sc.nextInt();
		int y1 = sc.nextInt();
		if (!a.dijkstra(x1, y1) && !a.dijkstra(y1, x1)) System.out.println("unknown");
		else if (a.dijkstra(x1, y1)) System.out.println("yes");
		else System.out.println("no");
		*/
		DFS a = new DFS(n + 1);
		for (int i = 0; i < m; i++) {
			int x = sc.nextInt();
			int y = sc.nextInt();
			a.addEdge(x, y);
		}
		int x1 = sc.nextInt();
		int y1 = sc.nextInt();
		boolean unknown = true;
		a.DFS(x1);
		if (a.path.contains(y1)) {
			System.out.println("yes");
			unknown = false;
		}
		a.path = new ArrayList<Integer>(); // a.path.clear(); works as well
		a.DFS(y1);
		if (a.path.contains(x1)) {
			System.out.println("no");
			unknown = false;
		}
		if (unknown) System.out.println("unknown");
		
	}
}
