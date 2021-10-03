import java.util.Arrays;

public class LongestIncreasingSubsequence {
    public static void main(String[] args) {
        int arr[] = { 10, 6, 5, 8, 11, 2, 20 };

        dp = new int[arr.length];

        recur(arr, 0, Integer.MIN_VALUE);

        int ans = Arrays.stream(dp).max().getAsInt();
        System.out.println(Arrays.toString(dp));
        System.out.println(ans);

    }

    static int dp[];

    public static int recur(int arr[], int index, int val) {
        if (index >= arr.length)
            return 0;
        // if (dp[index] > 0)
        //     return dp[index];

        int temp1 = 0, temp2 = 0, temp3 = 0;

        if (arr[index] > val)
            temp1 = 1 + recur(arr, index + 1, arr[index]);
        else
            temp2 = recur(arr, index + 1, val);

        temp3 = recur(arr, index + 1, val);
        dp[index] = Math.max(temp1, Math.max(temp2, temp3));

        return dp[index];
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