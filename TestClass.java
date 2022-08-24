/*
    I test stuff in this class as the name suggests
*/

import java.io.*;
import java.util.*;
public class TestClass {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter wr = new PrintWriter(System.out);
        int T = Integer.parseInt(br.readLine().trim());
        for (int t_i = 0; t_i < T; t_i++) {
            int N = Integer.parseInt(br.readLine().trim());
            int[][] edges = new int[N - 1][2];
            for (int i_edges = 0; i_edges < N - 1; i_edges++) {
                String[] arr_edges = br.readLine().split(" ");
                for (int j_edges = 0; j_edges < arr_edges.length; j_edges++) {
                    edges[i_edges][j_edges] = Integer.parseInt(arr_edges[j_edges]);
                }
            }

            int out_ = solve(N, edges);
            System.out.println(out_);

        }

        wr.close();
        br.close();
    }

    static int solve(int N, int[][] edges) {
        // Write your code here
        result = Integer.MAX_VALUE;
        ArrayList<ArrayList<Integer>> graph = new ArrayList<>();

        for (int i = 0; i < N; i++)
            graph.add(new ArrayList<Integer>());

        for (int i = 0; i < edges.length; i++) {
            addEdge(graph, edges[i][0] - 1, edges[i][1] - 1);
        }

        //for(int i=0;i<graph.size();i++)
        //    System.out.println(graph.get(i));

        getAllCombinations(N,graph,0,0,0);
        return result;

    }

    static void addEdge(ArrayList<ArrayList<Integer>> arr, int u, int v) {        
        arr.get(v).add(u);
        arr.get(u).add(v);        
    }

    static void removeEdge(ArrayList<ArrayList<Integer>> arr, int u, int v) {
        arr.get(u).remove(new Integer(v));
        arr.get(v).remove(new Integer(u));
    }

    static void getAllCombinations(int N, ArrayList<ArrayList<Integer>> graph, int vertexIndex, int edgeIndex,int partitionCount) {

        if (partitionCount == 2) {
            BFS(N, graph);
            return;
        }

        if(vertexIndex >= graph.size())
            return;

        if(edgeIndex >= graph.get(vertexIndex).size()){
            vertexIndex += 1;
            edgeIndex = 0;
            if(vertexIndex >= graph.size())
                return;
        }            
            getAllCombinations(N, graph, vertexIndex, edgeIndex + 1, partitionCount);        

            int firstVertex = vertexIndex;
            int secondVertex = graph.get(vertexIndex).get(edgeIndex);
            removeEdge(graph, firstVertex, secondVertex);

            getAllCombinations(N, graph, vertexIndex, edgeIndex + 1, partitionCount + 1);

            addEdge(graph, firstVertex, secondVertex);        
            return;
        

    }

    static int result;

    static void BFS(int v, ArrayList<ArrayList<Integer>> graph) {
        //System.out.println("start : ");
        boolean visited[] = new boolean[v];
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < graph.size(); i++) {
            int x = 0;
            if (!visited[i]) {
                x = BreadthFirstSearch(graph, i, visited);
            }else{
                continue;
            }            
            //System.out.println("Xor values : "+x);
            min = Math.min(x, min);
            max = Math.max(x, max);
            if(min == max)
                continue;            
        }
        result = Math.min(result,(max-min));
        //System.out.println("result : "+result);
        //System.out.println("end : ");
    }

    public static int BreadthFirstSearch(ArrayList<ArrayList<Integer>> arr, int source, boolean visited[]) {
        int xor = 0;
        Queue<Integer> q = new LinkedList<>();
        q.add(source);
        visited[source] = true;
        while (!q.isEmpty()) {
            int curr = q.poll();
            //System.out.print(curr + "--");
            xor = xor ^ (curr+1);
            for (int v : arr.get(curr)) {
                if (!visited[v]) {
                    q.add(v);
                    visited[v] = true;
                }
            }
        }
        //System.out.println();
        return xor;
    }
}
