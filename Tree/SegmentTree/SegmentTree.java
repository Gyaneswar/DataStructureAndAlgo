import java.util.*;
public class SegmentTree {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        int tree[]=new int[4*n];

        for(int i=0;i<n;i++)
            arr[i]=sc.nextInt();

        ConstructST(arr,tree, 0, n-1, 0);

        System.out.println(Arrays.toString(tree));
        System.out.println("range to getsum : ");
        int qs=sc.nextInt();
        int qe=sc.nextInt();
        System.out.println(GetSum(tree, qs, qe, 0, n-1, 0));
        System.out.print("Enter the update UpdateIndex and Update Number : ");
        int updateIndex=sc.nextInt();
        int diff=arr[updateIndex];
        int updateNumber=sc.nextInt();
        diff=updateNumber-diff;
        Update(tree, updateIndex, diff, 0, n-1, 0);
        System.out.println(Arrays.toString(tree));
    }   
    
    public static int ConstructST(int arr[],int tree[],int start,int end,int index){
        if(start == end){
            tree[index]=arr[start];            
            return arr[start];
        }

        int mid=(start+end)/2;
        tree[index]=ConstructST(arr,tree, start, mid, (2*index)+1)+ConstructST(arr,tree, mid+1, end, (2*index)+2);
        return tree[index];
    }

    public static int GetSum(int tree[],int qs,int qe,int start,int end,int index){
        if(qs>end|| qe<start)
            return 0;
        
        if(qs<=start && qe>=end){
            return tree[index];
        }

        int mid=(start+end)/2;

        return GetSum(tree, qs, qe, start, mid, (index*2) +1)
        +GetSum(tree, qs, qe, mid+1, end, (index*2) +2);

    }

    public static void Update(int tree[],int updateIndex,int number,int start,int end,int index){        
        if(updateIndex<start || updateIndex >end) return;

        tree[index]=tree[index]+number;

        if(end > start){
            int mid=(start+end)/2;
            Update(tree,updateIndex,number, start, mid, (2*index)+1);
            Update(tree,updateIndex,number, mid+1, end, (2*index)+2);        
        }
    }
}