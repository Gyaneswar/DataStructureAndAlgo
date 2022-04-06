import java.util.Arrays;

public class KnapSack_0_1{
    public static void main(String[] args) {
        int weight[] = {1,3,4,5};
        int val[] = {1,4,5,7};
        int totalWeight = 7;

        int T[][] = new int[weight.length][totalWeight+1];
        System.out.println(T[0].length);

        for(int j=1;j<T[0].length;j++){
            if(weight[0]<=j)
                T[0][j] = val[0];
        }


        for(int i=1;i<T.length;i++){
            for(int j=1;j<T[0].length;j++){
                if(j-weight[i] >=0 ){
                    T[i][j] = Math.max(T[i-1][j],val[i]+T[i-1][j-weight[i]]);
                }else{
                    T[i][j] = T[i-1][j];
                }
            }
        }

    

        


        for(int i=0;i<T.length;i++){
            System.out.println(Arrays.toString(T[i]));
        }

    }
}