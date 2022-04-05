//This is to find the smallest path using topological sort 
import java.util.*;
public class ShortestPathDAG {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int v=4;
        ArrayList<ArrayList<WeightedEdge>> arr=new ArrayList<>();

        for (int i = 0; i < v; i++)
            arr.add(new ArrayList<WeightedEdge>());

            //AddEdge(arr, 0, 1, 1);
            AddEdge(arr, 0, 3, 1);
            AddEdge(arr, 1, 3, 3);
            AddEdge(arr, 1, 2, 3);
            AddEdge(arr, 1, 0, 1);
            AddEdge(arr, 2, 3, 4);
            
            int dist[]=new int[v];
            Arrays.fill(dist, Integer.MAX_VALUE);
            //here 0 is assumed as source
            int order[]=new int[v];
            int inDegree[]=new int[v];
            InDegree(arr,inDegree);
            System.out.println(Arrays.toString(inDegree));

            Sort(inDegree, arr, order);
            System.out.println(Arrays.toString(order));

            dist[1]=0;

            for(int i=0;i<order.length;i++){
                ShortestPath(order[i],arr.get(order[i]), dist, order);
            }

            System.out.println(Arrays.toString(dist));

        sc.close();
    }

    public static void ShortestPath(int u,ArrayList<WeightedEdge> arr,int dist[],int order[]){
        for(WeightedEdge e: arr){
            if(dist[u] == Integer.MAX_VALUE)
                continue;
            if(dist[e.edge] > (dist[u]+e.weight)){
                dist[e.edge]=dist[u]+e.weight;
            }
        }
    }
    
    public static void Sort(int inDegree[], ArrayList<ArrayList<WeightedEdge>> arr, int order[]) {
        int index = 0;
        Queue<Integer> q = new LinkedList<>();
        for (int i = 0; i < inDegree.length; i++) {
            if (inDegree[i] == 0) {
                q.add(i);
            }
        }

        if (q.size() == arr.size()) {
            for (int i = 0; i < q.size(); i++) {
                order[i] = q.poll();
            }
        } else {
            while (!q.isEmpty()) {
                int curr = q.poll();
                //System.out.println(curr);
                order[index] = curr;
                index++;
                for (WeightedEdge item : arr.get(curr)) {
                    inDegree[item.edge]--;
                    if (inDegree[item.edge] <= 0)
                        q.add(item.edge);
                }
            }
        }
    }

    public static void AddEdge(ArrayList<ArrayList<WeightedEdge>> arr, int u, int v,int weight) {
        //arr.get(v).add(u);
        WeightedEdge w=new WeightedEdge(v, weight);
        arr.get(u).add(w);
    }

    public static void InDegree(ArrayList<ArrayList<WeightedEdge>> arr,int inDegree[]){
        for(ArrayList<WeightedEdge> e: arr){
            for(WeightedEdge item: e){
                inDegree[item.edge]++;
            }
        }
    }
}

class WeightedEdge{
    int edge;
    int weight;
    public WeightedEdge(int edge,int weight){
        this.edge=edge;
        this.weight=weight;
    }
}
