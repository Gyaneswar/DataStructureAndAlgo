import java.util.Arrays;

public class LongestIncreasingSubsequence {
    public static void main(String[] args) {
        int arr[] = { 3,4,-1,0,6,2,3 };

        int dp[][] = new int[arr.length][arr.length];        
        int result = recur(arr, 0, Integer.MIN_VALUE,dp);
        System.out.println(result);

        //int ans = Arrays.stream(dp).max().getAsInt();
        for(int i=0;i<arr.length;i++)
            System.out.println(Arrays.toString(dp[i]));
        //System.out.println(ans);

    }    

    public static int recur(int arr[], int index, int prev,int dp[][]) {
        if(index == arr.length)
            return 0;

        if(prev != Integer.MIN_VALUE && dp[index][prev] > 0)
            return dp[index][prev];

        int select = 0,notSelect = 0;
        if(prev == Integer.MIN_VALUE || arr[index] > arr[prev])
            select = 1 + recur(arr, index+1, index,dp);
        notSelect = recur(arr,index+1,prev,dp);

        if(prev != Integer.MIN_VALUE)
            dp[index][prev] = Math.max(select,notSelect);

        return Math.max(select,notSelect);
    }

    public static int dpSolution(int arr[]){
        int lis[]=new int[arr.length];
        int n=arr.length;
        lis[0]=1;
        for(int i=0;i<n;i++){
            lis[i]=1;
            for(int j=0;j<i;j++){
                if(arr[j]<arr[i]){
                    lis[i]=Math.max(lis[i],lis[j]+1);
                }
            }
        }

        return Arrays.stream(lis).max().getAsInt();        
    }
}