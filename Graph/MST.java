import java.util.Arrays;

public class MST {
    public static void main(String[] args) {
        int graph[][] = { { 0, 5, 8, 0 }, { 5, 0, 10, 15 }, { 8, 10, 0, 20 }, { 0, 15, 20, 0 } };
        
        int ans=FindMST(graph);
        System.out.println(ans);
    }

    public static int FindMST(int graph[][]){

        int V=graph.length;
        boolean mSet[]=new boolean[V];
        int key[]=new int[V];
        Arrays.fill(key, Integer.MAX_VALUE);
        key[0]=0;
        int res=0;
        for(int i=0;i<V;i++){
            int u=-1;

            for(int k=0;k<V;k++){
                if(!mSet[k] && (u==-1 || key[k]<key[u]))
                    u=k;
            }
            mSet[u]=true;
            res=res+key[u];

            for(int k=0;k<V;k++){
                if(!mSet[k] && graph[u][k]!=0 && (key[k]>graph[u][k])){
                    key[k]=graph[u][k];
                }
            }
        }

        return res;
    }
}