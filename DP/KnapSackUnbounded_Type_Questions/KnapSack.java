import java.util.Arrays;

public class KnapSack {
    public static void main(String[] args) {

        int wt[] = { 1, 3, 4, 7 };
        int val[] = { 1, 5, 5, 8 };
        int totalCapacity = 7;
        int index = 0;

        int ans1 = recursive(wt, val, totalCapacity, index);
        System.out.println(ans1);

        int dp[][] = new int[wt.length][totalCapacity+1];
        int ans2 = memoization(wt, val, totalCapacity, index, dp);        
        System.out.println(ans2);

        int ans3 = tabulation(wt, val, totalCapacity);
        System.out.println(ans3);

    }

    public static int recursive(int wt[], int val[], int totalCapacity, int index) {
        if (index == wt.length)
            return 0;

        if (totalCapacity == 0)
            return 0;

        int maxValue = 0;
        int select = 0, notSelect = 0;
        if (totalCapacity - wt[index] >= 0)
            select = val[index] + recursive(wt, val, totalCapacity - wt[index], index);

        notSelect = recursive(wt, val, totalCapacity, index + 1);
        maxValue = Math.max(select, notSelect);

        return maxValue;
    }
    public static int memoization(int wt[], int val[], int totalCapacity, int index,int dp[][]) {
        if (index == wt.length)
            return 0;

        if (totalCapacity == 0)
            return 0;

        //int maxValue = 0;
        int select = 0, notSelect = 0;
        if (totalCapacity - wt[index] >= 0)
            select = val[index] + recursive(wt, val, totalCapacity - wt[index], index);

        notSelect = recursive(wt, val, totalCapacity, index + 1);
        dp[index][totalCapacity] = Math.max(select, notSelect);

        return dp[index][totalCapacity];
    }

    public static int tabulation(int wt[],int val[],int totalCapacity){
        int dp[][] = new int[wt.length][totalCapacity+1];
        
        for(int j=1;j<=totalCapacity;j++){
            dp[0][j] = (j/wt[0])*val[0];
        }

        for(int i=1;i<wt.length;i++){
            for(int j=1;j<=totalCapacity;j++){
                int select = 0,notSelect = 0;
                if(j - wt[i] >= 0)
                    select = val[i] + dp[i][j-wt[i]];
                
                notSelect = dp[i-1][j];

                dp[i][j] = Math.max(select,notSelect);
            }
        }

        // for(int i=0;i<wt.length;i++)
        //     System.out.println(Arrays.toString(dp[i]));

        return dp[wt.length-1][totalCapacity];
    }
}
