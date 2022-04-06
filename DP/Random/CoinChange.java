import java.util.*;

public class CoinChange {    

    public static void main(String[] args) {
        int total = 11;
        int coins[] = {1,5,6,8};

        int T[][] = new int[coins.length][total+1];

        System.out.println(T.length);
        for(int j=1;j<=total;j++){
            if(j%coins[0] == 0)
                T[0][j] = j/coins[0];
        }

        for(int i=1;i<T.length;i++){
            for(int j=1;j<T[0].length;j++){
                if(j-coins[i]>=0)
                    T[i][j] = Math.min(T[i-1][j],1+T[i][j-coins[i]]);
                else
                    T[i][j] = T[i-1][j];
            }
        }

        for (int i = 0; i < T.length; i++) {
            System.out.println(Arrays.toString(T[i]));
        }
        
    }
}
