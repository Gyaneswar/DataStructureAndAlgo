//package SepWeek1;
import java.util.*;
public class SumOfDistances {
    static ArrayList<HashSet<Integer>> tree;
    static int count[];
    static int res[];
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int edges[][]=new int[n][2];
        tree=new ArrayList<HashSet<Integer>>();
     count=new int[n];
        res=new int[n];
        for(int i=0;i<n;i++){
            tree.add(new HashSet<Integer>());
        }

        for(int[] e: edges){
            tree.get(e[0]).add(e[1]);
            tree.get(e[1]).add(e[0]);
        }
        

    }

    public  void storeDepth(int root,int pre){
        for(int i : tree.get(root)){
            if(i==pre) continue;

            storeDepth(i, root);
            count[root]+=count[i];
            res[root]+=res[i]+count[i];
        }
        count[root]++;
    }

    public  void calRes(int root,int pre){
        for(int i : tree.get(root)){
            if(i==pre) continue;
            res[i]=res[root]-count[i]+count.length-count[i];
            calRes(i, root);
        }
    }
}
