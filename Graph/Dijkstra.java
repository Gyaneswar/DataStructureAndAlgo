import java.util.*;
public class Dijkstra {
    //implementation is exactly same as mst;
    public void dijkstra(List<List<Node>> graph,int dist[],boolean fin[],int n,int k){
        dist[0] = 0;
        for(int i=0;i<n-1;i++){
            int u = -1;
            int smallest = Integer.MAX_VALUE;
            for(int j=0;j<n;j++){
                if(!fin[j] && dist[j] < smallest){
                    smallest = dist[j];
                    u = j;
                }                    
            }
            
            if(smallest == Integer.MAX_VALUE)
                return;
            
            //System.out.println(smallest+"--"+u);
            
            fin[u] = true;
            
            for(int j=0;j<graph.get(u).size();j++){
                Node e = graph.get(u).get(j);
                if(!fin[e.vertex] && dist[e.vertex] > (dist[u] + e.weight))
                    dist[e.vertex] = dist[u] + e.weight;
            }            
        }
    } 
}
class Node{
    int vertex;
    int weight;
    public Node(int vertex,int weight){
        this.vertex = vertex;
        this.weight = weight;
    }
}
