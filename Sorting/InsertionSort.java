import java.util.*;
public class InsertionSort {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int arr[]={3,1,2,4,5};
        int n=arr.length;

        for(int i=1;i<n;i++){
            int key=arr[i];
            int j=i-1;
            while(j>=0 && arr[j]>key){
                arr[j + 1] = arr[j];
                j = j - 1;
            }
        arr[j + 1] = key;            
        }
        System.out.println(Arrays.toString(arr));
    }
}
