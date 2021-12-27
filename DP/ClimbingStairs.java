package DP;

class ClimbingStairs {
    public int climbStairs(int n) {
        if(n == 0) return 0;
        if(n == 1) return 1;
        
        int x1 = 0, x2 = 1,x3 = 0;
        for(int i=1;i<=n;i++){
            x3 = x2 + x1;
            x1 = x2;
            x2 = x3;
        }
        
        return x3;
    }
}
