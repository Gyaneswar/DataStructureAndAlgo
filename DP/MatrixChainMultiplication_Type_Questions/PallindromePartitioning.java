public class PallindromePartitioning {
    public static void main(String[] args) {
        String s = "geeek";


    }

    public static int partitionRecursive(char s[],int i,int j){
        if(checkPallindrome(s,i,j))
            return 0;

        int res = Integer.MAX_VALUE;
        for(int k = i;k < s.length;k++){
            res = Math.min(Math.min(res,1 + partition(s, i, k)) , partition(s, k+1, j));
        }

        return res;
    }


    public static int partitionDP(char s[]){
        int dp[][] = new int[s.length][s.length];

        for(int i=0;i<s.length;i++){
            dp[i][i] = 0;
        }
        
        int res = Integer.MAX_VALUE;
        for(int gap = 1;gap<s.length;gap++){
            for(int i = 0; i+gap < s.length;i++){
                int j = i + gap;

                if(checkPallindrome(ch, i, j))
                    dp[i][j] = 0;
                else{
                    dp[i][j] = Integer.MAX_VALUE;
                    for(int k=i;k<=j;k++){
                        dp[i][j] = Math.min(dp[i][j], 1 + dp[i][k] + dp[k+1][j]);
                    }
                }
            }
        }
        return dp[0][ch.length-1];
    }

    public static boolean checkPallindrome(char ch[],int i,int j){

        while(i < j)
        {
            if(ch[i] != ch[j])
                return false;
            
            i++;
            j--;
        }

        return true;
    }
}
