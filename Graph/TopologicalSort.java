import java.util.*;
import java.util.LinkedList;
import java.util.Queue;

//kahn BFS based algo
public class TopologicalSort{
    public static void AddEdge(ArrayList<ArrayList<Integer>> arr, int u, int v) {
        //arr.get(v).add(u);
        arr.get(u).add(v);
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        ArrayList<ArrayList<Integer>> arr = new ArrayList<>();

        int v = 5;
        for (int i = 0; i < v; i++)
            arr.add(new ArrayList<Integer>());

        AddEdge(arr, 0, 2);
        AddEdge(arr, 0, 3);
        AddEdge(arr, 2, 3);
        AddEdge(arr, 1, 3);
        AddEdge(arr, 1, 4);

        int inDegree[]=new int[v];
        FillInDegree(inDegree, arr);
        System.out.println(Arrays.toString(inDegree));
        Sort(inDegree,arr);

        int source = 0;
        boolean visited[]=new boolean[v];
    }

    public static void Sort(int inDegree[],ArrayList<ArrayList<Integer>> arr){
        Queue<Integer> q=new LinkedList<>();
        for(int i=0;i<inDegree.length;i++){
            if(inDegree[i]==0) q.add(i);
        }

        while(!q.isEmpty()){
            int curr=q.poll();
            System.out.println(curr);
            for(int item: arr.get(curr)){
                inDegree[item]--;
                if(inDegree[item]<=0) q.add(item);                
            }
        }        
    }

    public static void FillInDegree(int []inDegree,ArrayList<ArrayList<Integer>> arr){
        for(ArrayList<Integer> index: arr){
            for(int item: index){
                inDegree[item]++;
            }
        }
    }   
}