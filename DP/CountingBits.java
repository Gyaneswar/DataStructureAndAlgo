public class CountingBits {
    public int[] countBits(int n) {
        int arr[] = new int[n+1];
        if(n>=0){
            arr[0]=0;
        }if(n>=1){            
            arr[1]=1;
        }if(n>=2){            
            arr[2]=1;
        }if(n>=3){
            arr[3]=2;
        }
        int diff = 4;
        for(int i=4;i<=n;i++){
            if((i & (i-1)) == 0) diff = i;
            arr[i] = 1 + arr[i - diff];            
        }
        return arr;
    }
}
