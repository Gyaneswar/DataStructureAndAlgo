//package Sorting;

import java.util.Arrays;

public class IntersectionOfTwoSortedArrays {
    public static void main(String[] args) {
        int arr1[] = {1,1,1,1,3,3,3,3};
        int arr2[] = {1,1,1,3,3,3,3,3,3,3,5};

        Arrays.sort(arr1);
        Arrays.sort(arr2);

        int i=0,j=0;

        while(i < arr1.length && j < arr2.length){
            while(i+1 < arr1.length && arr1[i]==arr1[i+1])
                i++;
            
            while(j+1 < arr2.length && arr2[j] == arr2[j+1])
                j++;
            
            if(arr1[i] < arr2[j]){
                i++;
            }else if(arr1[i] > arr2[j]){
                j++;
            }else{
                System.out.print(arr1[i]+" ");
                i++;
                j++;
            }
        }
    }
}
