import java.util.*;
public class SegmentTree {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int tree[]=new int[4*n];
        ConstructST(tree, 0, n-1, 0)
    }   
    
    public static int ConstructST(int tree[],int start,int end,int index){
        if(start == end){
            tree[index]=tree[start];            
            return tree[start];
        }

        int mid=(start+end)/2;
        tree[index]=ConstructST(tree, start, mid, 2*index+1)+ConstructST(tree, mid+1, end, 2*index+2);
        return tree[index];
    }
}
