package Array;

import java.util.Arrays;

public class RemoveDuplicatesInSorted {
    public static void main(String[] args) {
        int arr[] = {1,1,2,2,2,3,4,4,5,6,7,7,8};

        int i=0,j=0;
        while(i < arr.length-1){
            if(arr[i] != arr[i+1]){
                swap(arr,i,j);
                j++;
            }

            i++;
        }

        swap(arr,i,j);

        System.out.println(Arrays.toString(arr));
    }

    public static void swap(int arr[], int i,int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
