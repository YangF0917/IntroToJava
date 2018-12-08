package Class17;

import java.util.*;
import java.lang.*;
import java.io.*;

/**
 *
 * @author Nanthi
 */
public class MST {

    // Number of vertices in the graph
    public static int V;
 
    // A utility function to find the vertex with minimum key
    // value, from the set of vertices not yet included in MST
    int minKey(double key[], Boolean mstSet[])
    {
        // Initialize min value
        double min = Integer.MAX_VALUE;
        int min_index=-1;
 
        for (int v = 0; v < V; v++)
            if (mstSet[v] == false && key[v] < min)
            {
                min = key[v];
                min_index = v;
            }
 
        return min_index;
    }
 
   // Find the minimum distance to travel every vertex in
    // a graph
   public double printMST(int parent[], int n, double graph[][])
    {
        //System.out.println("Edge   Weight");
	   double total = 0;
        for (int i = 1; i < V; i++){
            total += graph[i][parent[i]];
        }
        /*
        total *= 100;
        total = (int)total;
        total /= 100;
        */
        return total;
    }
 
    // Function to construct and print MST for a graph represented
    //  using adjacency matrix representation
    public double primMST(double graph[][])
    {
        // Array to store constructed MST
        int parent[] = new int[V];
 
        // Key values used to pick minimum weight edge in cut
        double key[] = new double [V];// similar to distance array in Dikejstra
 
        // To represent set of vertices not yet included in MST
        Boolean mstSet[] = new Boolean[V];
 
        // Initialize all keys as INFINITE
        for (int i = 0; i < V; i++)
        {
            key[i] = Integer.MAX_VALUE;
            mstSet[i] = false;
        }
 
        // Always include first 1st vertex in MST.
        key[0] = 0;     // Make key 0 so that this vertex is
                        // picked as first vertex
        parent[0] = -1; // First node is always root of MST
 
        // The MST will have V vertices
        for (int count = 0; count < V-1; count++)
        {
            // Pick thd minimum key vertex from the set of vertices
            // not yet included in MST
            int u = minKey(key, mstSet);
 
            // Add the picked vertex to the MST Set
            mstSet[u] = true;
 
            // Update key value and parent index of the adjacent
            // vertices of the picked vertex. Consider only those
            // vertices which are not yet included in MST
            for (int v = 0; v < V; v++)
 
                // graph[u][v] is non zero only for adjacent vertices of m
                // mstSet[v] is false for vertices not yet included in MST
                // Update the key only if graph[u][v] is smaller than key[v]
                if (graph[u][v]!=0 && mstSet[v] == false &&
                    graph[u][v] <  key[v])
                {
                    parent[v]  = u;// You are visiting the Vertex v from
                    // vertext u
                    key[v] = graph[u][v];
                }
        }
 
        // print the constructed MST
        return printMST(parent, V, graph);
    }
 
    public static void main (String[] args)
    {
        
        /* Let us create the following graph
           2    3
        (0)--(1)--(2)
        |    / \   |
        6| 8/   \5 |7
        | /      \ |
        (3)-------(4)
             9          */
        
        MST t = new MST();
        double graph[][] = new double[][] {{0, 2, 0, 6, 0},
                                    {2, 0, 3, 8, 5},
                                    {0, 3, 0, 0, 7},
                                    {6, 8, 0, 0, 9},
                                    {0, 5, 7, 9, 0},
                                   };
        
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
        	V = sc.nextInt();
        	double [][] points = new double[V][2];
        	double [][] dist = new double[V][V];
        	for (int j = 0; j < V; j++) {
        		double x = sc.nextDouble();
            	double y = sc.nextDouble();
            	points[j][0] = x;
            	points[j][1] = y;
        	}
        	for (int j = 0; j < V; j++) {
        		for (int k = 0; k < V; k++) {
        			dist[j][k] = Math.sqrt(Math.pow(points[j][0] - points[k][0], 2) + Math.pow(points[j][1] - points[k][1], 2));
        		}
        	}
        	MST freckles = new MST();
        	System.out.printf("%.2f",freckles.primMST(dist));
        }
    }
}


    


