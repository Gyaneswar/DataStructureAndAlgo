public class KadanesAlgo {
    public static void main(String[] args) {
        
        int arr[]={-2,-3,4,-1,-2,1,5,-3};

        int meh=0;
        int msf=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            meh=meh+arr[i];
            if(meh<arr[i]){
                meh=arr[i];
            }
            if(meh>msf){
                msf=meh;
            }
        }
        System.out.println(msf);
    }
    
}
