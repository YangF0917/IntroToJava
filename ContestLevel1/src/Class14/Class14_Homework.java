package Class14;
import java.util.*;

public class Class14_Homework {
	  static int n, i, distance, x, y;
	    static int[] friend;
	    static boolean[] visited;
	    public static void main(String[] args) {
	        // TODO code application logic here
	        Scanner input = new Scanner(System.in);
	        // get the friend relationships
		n = input.nextInt ();
		friend = new int [10000];
		visited = new boolean [10000];
		for (int i = 0 ; i < 10000 ; i++)
		    friend [i] = 0;
		for (int i = 0 ; i < n ; i++)
		    friend [input.nextInt ()] = input.nextInt ();
	            //1 2
		// get the student pairs and determine distance between them
		x = input.nextInt ();
		y = input.nextInt ();
		while (!(x == 0 && y == 0))
		{
		    for (int i = 0 ; i < 10000 ; i++)
			visited [i] = false;
		    distance = -1;
		    while (!visited [x] && x != y)
		    {
			visited [x] = true;
			distance++;
			x = friend [x];
		    }
		    if (x == y)
			System.out.println ("Yes " + distance);
		    else
			System.out.println ("No");
		    x = input.nextInt ();
		    y = input.nextInt ();
	    }
	}

}
