package com.sushma.Assignment3;


public class DijkstraAlgoDemo {

	public static void main(String[] args) {
		       int graph[][] = new int[][] { { 0, 1, 0, 2, 6}, 
                                      { 1, 0, 10, 1, 0}, 
                                      { 0, 10, 0, 5, 0}, 
                                      { 2, 1, 5, 0, 7}, 
                                      { 6, 0, 0, 7, 0,}, 
                              }; 
        ShortestPath t = new ShortestPath(); 
        t.dijkstra(graph, 0); 
    } 
}

  
class ShortestPath { 
    //function to find the vertex with minimum distance value, 
    // from the set of vertices not yet included in shortest path tree 
    static final int V = 5; 
    int minDistance(int dist[], Boolean sptSet[]) 
    { 
         int min = Integer.MAX_VALUE, min_index = -1; 
  
        for (int v = 0; v < V; v++) 
            if (sptSet[v] == false && dist[v] <= min) { 
                min = dist[v]; 
                min_index = v; 
            } 
  
        return min_index; 
    } 
  
    // function to print the constructed distance array 
    void printSolution(int dist[]) 
    { 
        System.out.println("Vertex \t\t Distance from Source"); 
        for (int i = 0; i < V; i++) 
            System.out.println(i + " \t\t " + dist[i]); 
    } 
   void dijkstra(int graph[][], int src) 
    { 
        int dist[] = new int[V]; // The output array. dist[i] will hold 
         Boolean sptSet[] = new Boolean[V]; 
       for (int i = 0; i < V; i++) { 
            dist[i] = Integer.MAX_VALUE; 
            sptSet[i] = false; 
        } 
         dist[src] = 0; 
  
           for (int count = 0; count < V - 1; count++) { 
             int u = minDistance(dist, sptSet); 
         sptSet[u] = true; 
  
         for (int v = 0; v < V; v++) 
  
               if (!sptSet[v] && graph[u][v] != 0 && dist[u] != Integer.MAX_VALUE && dist[u] + graph[u][v] < dist[v]) 
                    dist[v] = dist[u] + graph[u][v]; 
        } 
  
        // print the constructed distance array 
        printSolution(dist); 
    } }