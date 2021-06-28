public class OneOddRecurring {
    public static void main(String[] args) {
        int arr[]={1,1,2,2,3,4,4};
        int res=0;
        for(int i=0;i<arr.length;i++){
            res=res^arr[i];
        }
        System.out.println(res);
    }
}
