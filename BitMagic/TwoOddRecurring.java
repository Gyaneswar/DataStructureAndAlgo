public class TwoOddRecurring {
    public static void main(String[] args) {
        int arr[]={1,1,2,2,3,4,4,5};
        int xor=0,res1=0,res2=0;
        for(int i=0;i<arr.length;i++){
            xor=xor^arr[i];
        }
        System.out.println(xor);
        for(int i=0;i<arr.length;i++){
            if((xor & (~arr[i]-1)) !=0)
                res1=res1^arr[i];
            else
                res2=res2^arr[i];
        }
        System.out.println(res1+"--"+res2);
    }
}