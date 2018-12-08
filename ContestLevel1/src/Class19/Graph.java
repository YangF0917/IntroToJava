package Class19;
public class Graph {

    int V ; // The Number of Vertices in The Graph
    boolean  [][] adjMatrix; // The 2D boolean Array to
    // keep track whether there is a Connection between two vertices
    int [][] adjWeight; // The 2D Integer array to keep track
    // the weight associated with two Vertices
    int edges ;// The Number Edges in the Graph
    int weight ; // The weight between Two Vertices
    /**
     * 
     * @param v is an Integer sets the Number of Vertices to V
     */
    public Graph(int v){
        V = v;
        edges = 0;
        weight = 0;
        //Let initilize all the Values in the adjMatrix to false
        // and all the Values in the adjWeight to 0
        adjWeight = new int[V][V];
        adjMatrix = new boolean[V][V];
        
        for(int i = 0; i < V; i++){
            for(int j = 0; j < V; j++){
                adjWeight[i][j] = 0;
                adjMatrix[i][j] = false;
                
            }
        }
      }
    
     public void addEdge(int origin, int dest){
         adjMatrix[origin][dest] = true;
         edges++;
         
     }
     
     public void addWeight(int origin, int dest, int w){
         adjWeight[origin][dest] = w;
     }
     
     public void removeEdge(int origin, int dest){
         adjMatrix[origin][dest] = false;
         adjWeight[origin][dest] = 0;
         edges--;
     }
    
     
     public String toString(){
         String temp = "";
         for(int i = 0; i < V; i++){
             for(int j = 0; j < V; j++){
                 temp = temp + adjWeight[i][j] + "\t";
             }
             System.out.println("");
         }
         return temp;
     }
     
     public String toString1(){
         String temp = "";
         for(int i = 0; i < V; i++){
             for(int j = 0; j < V; j++){
                 temp = temp + adjMatrix[i][j] + "\t";
             }
             System.out.println("");
         }
         return temp;
     }
     
     public int minDistance(int dist[], boolean sptSet[])
    {
        // Initialize min value
        int min = Integer.MAX_VALUE;
        int min_index = 0;
 
        for (int v = 0; v < V; v++)
        {
         if (sptSet[v] == false && dist[v] <= min)
         {    min = dist[v];
              min_index = v;
         }
        }
       return min_index;
    }
     public boolean dijkstra( int src, int destin)
{
     int[] dist = new int [V] ;    
    // The output array.  dist[i] will hold the shortest
    // distance from src to i
 
     boolean [] sptSet = new boolean[V]; 
// sptSet[i] will true if vertex i is included in shortest
// path tree or shortest distance from src to i is finalized
 
     // Initialize all distances as INFINITE and stpSet[] as false
     for (int i = 0; i < V; i++)
     { dist[i] = Integer.MAX_VALUE; 
        sptSet[i] = false;
     }
     // Distance of source vertex from itself is always 0
     dist[src] = 0;
 
     // Find shortest path for all vertices
     for (int count = 0; count < V-1; count++)
     {
       // Pick the minimum distance vertex from the set of vertices not
       // yet processed. u is always equal to src in first iteration.
       int u = minDistance(dist, sptSet);
       // Mark the picked vertex as processed
       sptSet[u] = true;
 // Update dist value of the adjacent vertices of the picked vertex.
       for (int v = 0; v < V; v++)
       {
         // Update dist[v] only if is not in sptSet, there is an edge from 
         // u to v, and total weight of path from src to  v through u is 
         // smaller than current value of dist[v]
         
       if ((!sptSet[v] && adjWeight[u][v]>0 && dist[u] 
               != Integer.MAX_VALUE )&& (dist[u]+adjWeight[u][v] 
               < dist[v]))
            dist[v] = dist[u] + adjWeight[u][v];
       }
     }
     if (dist[destin] != Integer.MAX_VALUE) return true;
     else return false;
}
     
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
}
