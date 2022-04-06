//Memoization
import java.util.*;

public class LongestCommonSubsequence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.next();
        String s2 = sc.next();

        memo=new int[s1.length()+1][s2.length()+1];        
        for(int []row : memo)
            Arrays.fill(row, -1);
        
        FindLCSMemo(s1, s2, s1.length()-1, s2.length()-1);

        System.out.println(memo[s1.length()-1][s2.length()-1]);
        System.out.println(FindLCSTabulation(s1, s2, s1.length(), s2.length()));
    }

    static int memo[][];

    public static int FindLCSMemo(String s1, String s2, int i, int j) {
        if(i==-1 || j==-1){
            //memo[i][j]=0;
            return 0;
        }

        if(memo[i][j]!=-1) return memo[i][j];

        else if(s1.charAt(i)==s2.charAt(j)){
            memo[i][j]= 1+FindLCSMemo(s1, s2, i-1, j-1);
        }
        else {
            memo[i][j]=Math.max(FindLCSMemo(s1, s2, i-1, j),FindLCSMemo(s1, s2, i, j-1));
        }

        return memo[i][j];

    }

    public static int FindLCSTabulation(String s1,String s2,int m,int n){

        int dp[][]=new int[m+1][n+1];
        
        for(int i=1;i<=m;i++){   
            for(int j=1;j<=n;j++){
                if(s1.charAt(i-1)==s2.charAt(j-1)){
                    dp[i][j]=1+dp[i-1][j-1];                
                }else {
                    dp[i][j]=Math.max(dp[i-1][j],dp[i][j-1]);
                }
            }
        }
        return dp[m][n];
    }
}
