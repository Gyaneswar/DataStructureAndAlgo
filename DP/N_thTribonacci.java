package DP;

public class N_thTribonacci {
    public int tribonacci(int n) {
        int x1 = 0,x2 = 1,x3 = 1,x4 = 0;
        if(n == 0) return x1;
        if(n == 1) return x2;
        if(n == 2) return x3;
        
        for(int i=3;i<=n;i++){
            x4 = x1 + x2 + x3;
            x1 = x2;
            x2 = x3;
            x3 = x4;
        }
        return x4;
    }
}