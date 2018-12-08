package CCCL1W18Test2;
import java.util.*;
import CCCL1W18Test2.Graph;
public class Q4 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int v = sc.nextInt();
		int paths = sc.nextInt();
		Graph a = new Graph(v);
		for (int i = 0; i < paths; i++) {
			int x = sc.nextInt() - 1;
			int y = sc.nextInt() - 1;
			int weight = sc.nextInt();
			a.addEdge(x, y);
			a.addWeight(x, y, weight);
		}
		int [] dis = a.dijkstra(0);
		for (int i = 0; i < dis.length; i++) {
			if (dis[i] == Integer.MAX_VALUE) System.out.println(-1);
			else System.out.println(dis[i]);
		}
	}

}
