package Class15;
import Class15.Graph;
import java.util.Scanner;
public class Class15_Homework {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt(); // Number of cities
		Graph cities = new Graph(n+1);
		int t = sc.nextInt(); // Number of trade routes
		for (int i = 0; i < t; i++) {
			int x = sc.nextInt();
			int y = sc.nextInt();
			int cxy = sc.nextInt(); // The cost of x to y AND y to x
			cities.addEdge(x, y);
			cities.addWeight(x, y, cxy);
			cities.addEdge(y, x);
			cities.addWeight(y, x, cxy);
		}
		int k = sc.nextInt();
		int [][] pencils = new int[2][k];
		for (int i = 0; i < k; i++) {
			int x = sc.nextInt();
			int px = sc.nextInt();
			pencils[0][i] = x;
			pencils[1][i] = px;
		}
		int d = sc.nextInt();
		int minCost = Integer.MAX_VALUE;
		for (int i = 0; i < k; i++) {
			if (cities.dijkstra(pencils[0][i], d) + pencils[1][i] < minCost) minCost = cities.dijkstra(pencils[0][i], d) + pencils[1][i];
		}
		System.out.println(minCost);
	}

}
