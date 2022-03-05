
//package SepWeek4;
import java.util.*;

public class ShortestPathInGrid {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        int grid[][] = new int[m][n];

        for (int i = 0; i < m; i++)
            for (int j = 0; j < n; j++)
                grid[i][j] = sc.nextInt();

        int k = sc.nextInt();

        // for (int i = 0; i < m; i++) {
        // System.out.println(Arrays.toString(grid[i]));
        // }
        dp = new DP[m][n];

        for (int i = 0; i < m; i++)
            for (int j = 0; j < n; j++)
                dp[i][j] = new DP();

        findShortest(grid, m, n, 0, 0, k, new boolean[m][n]);

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(" ( " + (dp[i][j].val) + "-" + dp[i][j].k + " ) ");
            }
            System.out.println();
        }

        // shortestPath = shortestPath == Integer.MAX_VALUE ? -1 : shortestPath;
        // System.out.println(shortestPath);
        System.out.println(dp[0][0]);
    }

    static DP dp[][];

    public static int findShortest(int grid[][], int m, int n, int row, int col, int k, boolean visited[][]) {


        if (grid[row][col] != 0) {
            if (k > 0)
                k = k - 1;
            else
                return -1;
        }

        if (dp[row][col].val > 0 && dp[row][col].k <= k)
            return dp[row][col].val;

        // if (dp[row][col].val > 0 && dp[row][col].k > k)
        // return -1;

        if (row == m - 1 && col == n - 1)
            return 0;

        int colMovePos = -1, colMoveNeg = -1, rowMovePos = -1, rowMoveNeg = -1;

        visited[row][col] = true;
        if( col + 1 < n && !visited[row][col + 1] )
        colMovePos = findShortest(grid, m, n, row, col + 1, k, visited);
        if(row + 1 < m && !visited[row + 1][col] )
        rowMovePos = findShortest(grid, m, n, row + 1, col, k, visited);
        if( col - 1 >= 0 && !visited[row][col - 1])
        colMoveNeg = findShortest(grid, m, n, row, col - 1, k, visited);
        if(row - 1 >= 0 && !visited[row - 1][col])
        rowMoveNeg = findShortest(grid, m, n, row - 1, col, k, visited);
        visited[row][col] = false;

        if (colMovePos == -1)
            colMovePos = Integer.MAX_VALUE;
        if (colMoveNeg == -1)
            colMoveNeg = Integer.MAX_VALUE;
        if (rowMovePos == -1)
            rowMovePos = Integer.MAX_VALUE;
        if (rowMoveNeg == -1)
            rowMoveNeg = Integer.MAX_VALUE;

        int temp = Math.min(Math.min(colMoveNeg, rowMoveNeg), Math.min(colMovePos, rowMovePos));

        if (temp == Integer.MAX_VALUE) {            
            if(dp[row][col].val == 0){
                dp[row][col].val=-1;
                dp[row][col].k=k;
            }        
        } else {
            if(dp[row][col].val>0){
                if((1 + temp)<dp[row][col].val){
                    dp[row][col].val=1 + temp;
                    dp[row][col].k=k;
                }else if((1 + temp) == dp[row][col].val){
                    if(dp[row][col].k<k) dp[row][col].k=k;
                }
            }else{
                dp[row][col].val = 1 + temp;
                dp[row][col].k = k;
            }
        }

        return dp[row][col].val;
    }
}

class DP {
    int val;
    int k;
}