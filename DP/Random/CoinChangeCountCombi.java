import java.util.*;
public class CoinChangeCountCombi {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int sum=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++) arr[i]=sc.nextInt();        

        System.out.println(CountCombi(arr,sum,arr.length));
        System.out.println(CountCombiTabluation(arr, sum, n));
    }    
    public static int CountCombi(int arr[],int sum,int n){
        if(sum==0){
            return 1;
        }
        else if(n==0) return 0;

        int res=CountCombi(arr, sum, n-1);
        if(arr[n-1]<=sum)
            res+=CountCombi(arr, sum-arr[n-1], n);
        return res;
    }

    public static int CountCombiTabluation(int arr[],int sum,int n){
        int dp[][]=new int[sum+1][n+1];

        for(int i=0;i<=n;i++) dp[0][i]=1;

        for(int i=1;i<=sum;i++){
            for(int j=1;j<=n;j++){
                dp[i][j]=dp[i][j-1];
                if(arr[j-1]<=i)
                    dp[i][j]+=dp[i-arr[j-1]][j];
            }
        }
        return dp[sum][n];
    }

}
