import java.util.Arrays;


public class LongestCommonSubsequence {
    public static void main(String[] args) {
        String s1 = "abcdgh";
        String s2 = "abedfhr";
        System.out.println(s1+"\n"+s2);
        
        int ans1 = recursive(s1, s2, s1.length()-1, s2.length()-1,"");
        System.out.println(ans1);


        int dp[][] = new int[s1.length()][s2.length()];
        int ans2 = memoization(s1, s2, s1.length()-1, s2.length()-1, dp);
        System.out.println(ans2);


        int ans3 = tabulation(s1, s2, s1.length(), s2.length());
        System.out.println(ans3);

    }
    static int max = 0;
    public static int recursive(String s1,String s2,int m,int n,String result){

        if(m < 0) return 0;
        if(n < 0) return 0;        
        
        int equal = 0,notEqual = 0;
        if(s1.charAt(m) == s2.charAt(n)){
            result += s1.charAt(m);
            equal = 1 + recursive(s1, s2, m-1, n-1,result);
        }
        notEqual = Math.max(recursive(s1,s2,m-1,n,result),recursive(s1, s2, m, n-1,result));

        
        //System.out.println(result);
        return Math.max(equal,notEqual);
    }

    public static int memoization(String s1,String s2,int m,int n,int dp[][]){
        if(m < 0) return 0;
        if(n < 0) return 0;        
        
        int equal = 0,notEqual = 0;
        if(s1.charAt(m) == s2.charAt(n)){
            equal = 1 + memoization(s1, s2, m-1, n-1,dp);
        }
        notEqual = Math.max(memoization(s1,s2,m-1,n,dp),memoization(s1, s2, m, n-1,dp));

        dp[m][n] = Math.max(equal,notEqual);

        return dp[m][n];
    }   


    public static int tabulation(String s1,String s2,int m,int n){
        int dp[][] = new int[m+1][n+1];
        

        for(int i=1;i<=m;i++){
            for(int j=1;j<=n;j++){
                if(s1.charAt(i-1) == s2.charAt(j-1)){
                    dp[i][j] = 1 + dp[i-1][j-1];
                }else{
                    dp[i][j] = Math.max(dp[i-1][j],dp[i][j-1]);
                }
            }
        }

        for(int i=0;i<=m;i++)
            System.out.println(Arrays.toString(dp[i]));

        return dp[m][n];
    }
}
