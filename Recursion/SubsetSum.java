public class SubsetSum {
    public static void main(String[] args) {
        int arr[]={10,20,15,5};
        int sum=25;
        int n=4;
        System.out.println(CountSumSubset(arr, sum, n));
    }


    public static int CountSumSubset(int arr[],int sum,int n){
        if(n==0){
            return sum==0?1:0;
        }

        return CountSumSubset(arr,sum,n-1)+
                CountSumSubset(arr,sum-arr[n-1],n-1);
    }
}
