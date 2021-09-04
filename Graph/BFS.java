import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class BFS {
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

        boolean visited[] = new boolean[v];
        BreadthFirstSearch(arr, 0, visited);

        // i have not implemented a bfs for disconnected graph because i am lazy now
        // for disconnected graph just call bfs for all the vertices using a loop
    }

    public static void BreadthFirstSearch(ArrayList<ArrayList<Integer>> arr, int source, boolean visited[]) {
        Queue<Integer> q = new LinkedList<>();
        q.add(source);
        visited[source] = true;
        while (!q.isEmpty()) {
            int curr = q.poll();
            System.out.print(curr + "--");
            for (int v : arr.get(curr)) {
                if (!visited[v]) {
                    q.add(v);
                    visited[v] = true;
                }
            }
        }
    }

    public static void AddEdge(ArrayList<ArrayList<Integer>> arr, int u, int v) {
        arr.get(v).add(u);
        arr.get(u).add(v);
    }
}