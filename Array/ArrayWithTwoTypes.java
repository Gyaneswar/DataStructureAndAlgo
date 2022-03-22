import java.util.Arrays;

public class ArrayWithTwoTypes {
    public static void main(String[] args) {
        int arr[] = {15,10,-2,-19};

        //using lomuto partition

        int i = -1;
        int pivot = 0;
        for(int j=0;j<arr.length;j++){
            if(arr[j] < pivot){
                i++;
                swap(arr,i,j);
            }
        }

        System.out.println(Arrays.toString(arr));
    }
    public static void swap(int arr[],int i,int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
