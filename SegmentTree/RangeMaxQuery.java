public class RangeMaxQuery {
    public static void main(String[] args) {
        int arr[]={3,5,1,9,6,7};        
        int tree[]=new int[4*arr.length];
        ConstructST(arr, tree, 0, arr.length-1, 0);
        System.out.println(getRangeMax(tree, 2, 3, 0, arr.length-1, 0));
    }

    public static int ConstructST(int arr[], int tree[], int start, int end,int index) {
        if(start==end){
            tree[index]=arr[start];
            return tree[index];
        }

        int mid=(start+end)/2;
        int left=ConstructST(arr, tree, start, mid, 2*index+1);
        int right=ConstructST(arr, tree, mid+1, end, 2*index+2);
        tree[index]=left>right?left:right;

        return tree[index];
    }


    public static int getRangeMax(int tree[],int qs,int qe,int start,int end,int index){
        if(qs>end || qe<start) return 0;

        if(start>=qs && end<=qe){
            return tree[index];
        }

        int mid=(start+end)/2;
        int left=getRangeMax(tree, qs, qe, start, mid, 2*index+1);
        int right=getRangeMax(tree, qs, qe, mid+1, end, 2*index+2);

        return left>right?left:right;
    }
}
