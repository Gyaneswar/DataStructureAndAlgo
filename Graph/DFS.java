import java.util.ArrayList;

public class DFS {
    public static void main(String[] args) {
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

        visited = new boolean[v];
        int source = 0;
        DepthFirstSearch(arr, source);

        // i have not implemented a bfs for disconnected graph because i am lazy now
        // for disconnected graph just call bfs for all the vertices using a loop

        System.out.println("|");
    }

    static boolean visited[];

    public static void DepthFirstSearch(ArrayList<ArrayList<Integer>> arr, int source) {

        System.out.print(source + "--");
        visited[source] = true;
        for (int i : arr.get(source)) {
            if (!visited[i]) {
                DepthFirstSearch(arr, i);
            }
        }
    }


    public static void AddEdge(ArrayList<ArrayList<Integer>> arr, int u, int v) {
        arr.get(v).add(u);
        arr.get(u).add(v);
    }
}
