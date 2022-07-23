import java.util.Arrays;

public class MCM {
    public static void main(String[] args) {
        int arr[] = {40,20,30,10,30};   

        int ans1 = recursive(arr, 0, arr.length-1);
        System.out.println(ans1);

        int dp[][] = new int[arr.length][arr.length];
        int ans2 = memoization(arr, 0, arr.length-1,dp);        
        System.out.println(ans2);
        for(int i=0;i<arr.length;i++)
            System.out.println(Arrays.toString(dp[i]));        
    }    
    
    public static int recursive(int arr[],int i,int j){

        if(i>=j)
            return 0;

        int min = Integer.MAX_VALUE;
        for(int k=i;k<j;k++){
            int leftCost = recursive(arr, i, k);
            int rightCost = recursive(arr, k+1, j);
            int totalCost = leftCost + rightCost + (arr[i] * arr[k] * arr[j]); //last part is cost for merging of left and right
            if(totalCost < min)
                min = totalCost;
        }
        return min;
    }

    public static int memoization(int arr[],int i,int j,int dp[][]){
        if(i>=j)
            return 0;

        if(dp[i][j] > 0)
            return dp[i][j];

        int min = Integer.MAX_VALUE;
        for(int k=i;k<j;k++){
            int leftCost = memoization(arr, i, k,dp);
            int rightCost = memoization(arr, k+1, j,dp);
            int totalCost = leftCost + rightCost + (arr[i] * arr[k] * arr[j]);
            
            min =  Math.min(min,totalCost);
        }
        dp[i][j] = min;
        return dp[i][j];
    }
}
