import java.util.ArrayList;
import java.util.*;

public class DetectCycle {

    public static void AddEdge(ArrayList<ArrayList<Integer>> arr, int u, int v) {
        arr.get(v).add(u);
        arr.get(u).add(v);
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        ArrayList<ArrayList<Integer>> arr = new ArrayList<>();

        int v = 6;
        for (int i = 0; i < v; i++)
            arr.add(new ArrayList<Integer>());

        AddEdge(arr, 0, 1);
        AddEdge(arr, 0, 4);
        AddEdge(arr, 0, 2);
        AddEdge(arr, 1, 3);
        AddEdge(arr, 2, 5);
        AddEdge(arr, 3, 4);
        AddEdge(arr, 4, 5);

        int source = 0;
        boolean visited[]=new boolean[v];

        
        // i have not implemented a bfs for disconnected graph because i am lazy now
        // for disconnected graph just call bfs for all the vertices using a loop
        
        boolean cycle=CheckCycle(arr,source,visited,-1);

        System.out.println(cycle);
    }


    public static boolean CheckCycle(ArrayList<ArrayList<Integer>> arr,int source,boolean visited[],int parent){    
        visited[source]=true;
        for(int i : arr.get(source)){
            if(!visited[i]){
                CheckCycle(arr, i, visited, source);                
            }else{
                if(i != parent){
                    return true;
                }
            }
        }
        return false;
    }
}
