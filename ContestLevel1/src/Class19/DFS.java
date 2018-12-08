package Class19;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.*;
/**
 *
 * @author Nanthi
 */
public class DFS {

   private int V;   // No. of vertices
   ArrayList<Integer> path = new ArrayList<Integer>();
 
    // Array  of lists for Adjacency List Representation
    private LinkedList<Integer> adj[];
 
    // Constructor
    DFS(int v)
    {
        V = v;
        adj = new LinkedList[v];
        for (int i=0; i<v; ++i)
            adj[i] = new LinkedList();
    }
 
    //Function to add an edge into the graph
    void addEdge(int v, int w)
    {
        adj[v].add(w);  // Add w to v's list.
    }
 
    // A function used by DFS
    void DFSUtil(int v,boolean visited[])
    {
        // Mark the current node as visited and print it
        visited[v] = true;
        //System.out.print(v+" ");
        path.add(v);//Add the Vertices along in the DFS route
        
        
 
        // Recur for all the vertices adjacent to this vertex
        Iterator<Integer> i = adj[v].listIterator();
        while (i.hasNext())
        {
            int n = i.next();
            if (!visited[n])
                DFSUtil(n, visited);
        }
    }
 
    // The function to do DFS traversal. It uses recursive DFSUtil()
    void DFS(int v)
    {
        // Mark all the vertices as not visited(set as
        // false by default in java)
        boolean visited[] = new boolean[V];
 
        // Call the recursive helper function to print DFS traversal
        
        DFSUtil(v, visited);
    }
 
    public static void main(String args[]){
    	DFS a = new DFS(5);
    	a.addEdge(0, 1);
        a.addEdge(0, 2);
        a.addEdge(1, 2);
        a.addEdge(2, 0);
        a.addEdge(2, 3);
        a.addEdge(3, 3);
        
        a.DFS(2);
        System.out.println(a.path);
    }
    
}
