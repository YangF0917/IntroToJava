package Class15;
import Class15.Graph;
import java.util.*;
public class ModifiedDijikstras {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		/*
		Graph a = new Graph(5);
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
		a.dijkstra(0, 2);
		*/
		// Degrees of Separation
		Graph friends = new Graph(50);
		//Part1
		 friends.addEdge(1, 6);
		 friends.addWeight(1,6,1);
		 friends.addEdge(6, 1);
		 friends.addWeight(6,1,1);
		 friends.addEdge(2, 6);
		 friends.addWeight(2,6,1);
		 friends.addEdge(6, 2);
		 friends.addWeight(6,2,1);
		 friends.addEdge(3, 6);
		 friends.addWeight(3,6,1);
		 friends.addEdge(6, 3);
		 friends.addWeight(6,3,1);
		 friends.addEdge(4, 6);
		 friends.addWeight(4,6,1);
		 friends.addEdge(6, 4);
		 friends.addWeight(6,4,1);
		 friends.addEdge(5, 6);
		 friends.addWeight(5,6,1);
		 friends.addEdge(6, 5);
		 friends.addWeight(6,5,1);
		 friends.addEdge(7, 6);
		 friends.addWeight(7,6,1);
		 friends.addEdge(6, 7);
		 friends.addWeight(6,7,1);
		 friends.addEdge(3, 4);
		 friends.addWeight(3,4,1);
		 friends.addEdge(4, 3);
		 friends.addWeight(4,3,1);
		 friends.addEdge(4, 5);
		 friends.addWeight(4,5,1);
		 friends.addEdge(5, 4);
		 friends.addWeight(5,4,1);
		 friends.addEdge(3, 5);
		 friends.addWeight(3,5,1);
		 friends.addEdge(5, 3);
		 friends.addWeight(5,3,1);
		 friends.addEdge(3, 15);
		 friends.addWeight(3,15,1);
		 friends.addEdge(15, 3);
		 friends.addWeight(15,3,1);
		 friends.addEdge(13, 15);
		 friends.addWeight(13,15,1);
		 friends.addEdge(15, 13);
		 friends.addWeight(15,13,1);
		 friends.addEdge(14, 13);
		 friends.addWeight(14,13,1);
		 friends.addEdge(13, 14);
		 friends.addWeight(13,14,1);
		 friends.addEdge(12, 13);
		 friends.addWeight(12,13,1);
		 friends.addEdge(13, 12);
		 friends.addWeight(13,12,1);
		 friends.addEdge(7, 8);
		 friends.addWeight(7,8,1);
		 friends.addEdge(8, 7);
		 friends.addWeight(8,7,1);
		 friends.addEdge(8, 9);
		 friends.addWeight(8,9,1);
		 friends.addEdge(9, 8);
		 friends.addWeight(9,8,1);
		 friends.addEdge(9, 10);
		 friends.addWeight(9,10,1);
		 friends.addEdge(10, 9);
		 friends.addWeight(10,9,1);
		 friends.addEdge(9, 12);
		 friends.addWeight(9,12,1);
		 friends.addEdge(12, 9);
		 friends.addWeight(12,9,1);
		 friends.addEdge(10, 11);
		 friends.addWeight(10,11,1);
		 friends.addEdge(11, 10);
		 friends.addWeight(11,10,1);
		 friends.addEdge(11, 12);
		 friends.addWeight(11,12,1);
		 friends.addEdge(12, 11);
		 friends.addWeight(12,11,1);
		 friends.addEdge(16, 17);
		 friends.addWeight(16,17,1);
		 friends.addEdge(17, 16);
		 friends.addWeight(17,16,1);
		 friends.addEdge(16, 18);
		 friends.addWeight(16,18,1);
		 friends.addEdge(18, 16);
		 friends.addWeight(18,16,1);
		 friends.addEdge(18, 17);
		 friends.addWeight(18,17,1);
		 friends.addEdge(17, 18);
		 friends.addWeight(17,18,1);

		String command = sc.next();
		while (!command.equals("q")) {
			if (command.equals("i")) {
				int a1 = sc.nextInt();
				int b = sc.nextInt();
				friends.addEdge(a1, b);
				friends.addWeight(a1, b, 1);
			}
			else if (command.equals("d")) {
				int a1 = sc.nextInt();
				int b = sc.nextInt();
				friends.removeEdge(a1, b);
				// Delete friendship
			}
			else if (command.equals("n")) {
				// List the friends of 1 person
				int x = sc.nextInt();
				int count = 0;
				for (int i = 0; i < friends.adjMatrix[x].length; i++) {
					if (i != x) {
						if (friends.adjMatrix[x][i]) count++;
					}
				}
				System.out.println(count);
			}
			else if (command.equals("f")) {
				int a1 = sc.nextInt();
				int count = 0;
				for (int i = 0; i < 50; i++) {
				if (friends.dijkstra(a1, i) == 2) count++;
				}
				System.out.println(count);
				// Output the number of "friends of friends" of a1
			}
			else if (command.equals("s")) {
				// Output the degree of separation between 2 ppl
				int a1 = sc.nextInt();
				int b = sc.nextInt();
				System.out.println(friends.dijkstra(a1, b));
			}
			command = sc.next();
		}
		
	}

}
