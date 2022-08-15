public class TwoOddRecurring {
    public static void main(String[] args) {
        int arr[]={1,1,2,2,3,4,4,5};
        int xor=0,res1=0,res2=0;
        for(int i=0;i<arr.length;i++){
            xor=xor^arr[i];
        }
        int sn = xor & ~(xor-1);
        for(int i=0;i<arr.length;i++){
            if((arr[i] & sn) !=0 )
                res1=res1^arr[i];
            else
                res2=res2^arr[i];
        }
        System.out.println(res1+"--"+res2);
    }
}