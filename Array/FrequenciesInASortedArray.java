//package Array;

public class FrequenciesInASortedArray {
    public static void main(String[] args) {
        int arr[] = {10,25,25,25,30};
        int n = arr.length;
        int count = 1;
        int x = arr[0];
        for(int i=1;i<n;i++){
            if(arr[i] == x){
                count++;
            }else{
                System.out.println(x+" : "+count);
                x=arr[i];
                count = 1;
            }
        }

        System.out.println(x + " : "+count);
    }
}
