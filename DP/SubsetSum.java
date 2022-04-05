import java.util.Arrays;

public class SubsetSum {
    public static void main(String[] args) {
        int total = 11;
        int set[] = { 2, 3, 7, 8, 10 };

        boolean T[][] = new boolean[set.length][total + 1];

        for (int i = 0; i < set.length; i++) {
            T[i][0] = true;
        }

        for (int j = 1; j <= total; j++) {
            if (set[0] == j)
                T[0][j] = true;
            else
                T[0][j] = false;
        }

        for (int i = 1; i < set.length; i++) {
            for (int j = 1; j <= total; j++) {
                if (!T[i - 1][j]) {
                    if(j-set[i]>=0)
                        T[i][j] = T[i - 1][j - set[i]];
                    else
                        T[i][j] = false;
                } else {
                    T[i][j] = true;
                }
            }
        }

        for (int i = 0; i < T.length; i++) {
            System.out.println(Arrays.toString(T[i]));
        }

    }
}
