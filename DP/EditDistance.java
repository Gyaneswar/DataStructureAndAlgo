import java.util.*;

public class EditDistance {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.next();
        String s2 = sc.next();

        int res1 = FindMinEditRecur(s1, s2, s1.length() - 1, s2.length() - 1);
        int res2 = FindMinEditDP(s1, s2, s1.length(), s2.length());

        System.out.println(res1);
        System.out.println(res2);
    }

    public static int FindMinEditRecur(String s1, String s2, int m, int n) {
        if (m == 0)
            return n;

        if (n == 0)
            return m;

        if (s1.charAt(m) == s2.charAt(n)) {
            return FindMinEditRecur(s1, s2, m - 1, n - 1);

        } else {
            return 1 + min(FindMinEditRecur(s1, s2, m - 1, n), FindMinEditRecur(s1, s2, m, n - 1),
                    FindMinEditRecur(s1, s2, m - 1, n - 1));
        }
    }

    public static int min(int... a) {
        int res = Integer.MAX_VALUE;
        for (int i : a) {
            if (i < res)
                res = i;
        }
        return res;
    }

    public static int FindMinEditDP(String s1, String s2, int m, int n) {
        int dp[][] = new int[m + 1][n + 1];

        for (int i = 0; i <= m; i++)
            dp[i][0] = i;
        for (int i = 0; i <= n; i++)
            dp[0][i] = i;

        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= n; j++) {
                if (s1.charAt(i-1) == s2.charAt(j-1))
                    dp[i][j] = dp[i - 1][j - 1];
                else
                    dp[i][j] =1 + min(dp[i - 1][j], dp[i][j - 1], dp[i - 1][j - 1]);

            }
        }

        return dp[m][n];
    }
}