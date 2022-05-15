//package Sorting;

import java.util.Arrays;

public class PartitionRevision {
    public static void main(String[] args) {
        System.out.println("Hoare ....");
        int arr[]={4,7,2,1,3,9,8,5}; 
        HoarePartition(arr);

        System.out.println("Lomuto ....");
        int arr1[]={4,7,2,1,3,9,8,5};
        lomutoPartition(arr1);
    }

    public static void lomutoPartition(int arr[]){
        int pivot = arr[arr.length-1];
        int l=0,h = arr.length;
        int smaller = -1;
        for(int i=l;i<h-1;i++){

            if(arr[i] <= pivot){
                smaller++;
                swap(arr,smaller,i);
                System.out.println(Arrays.toString(arr));
            }
        }

        swap(arr,smaller+1,h-1);
        System.out.println(Arrays.toString(arr));
    }



    public static void HoarePartition(int arr[]){ // Hoare Partition
        int pivot = arr[arr.length-1];

        int l = -1,h = arr.length - 1;

        while(l < h){

            do{
                l++;
            }
            while(arr[l] < pivot);            

            do{
                h--;
            }
            while(arr[h] > pivot);                            
        
            if(l < h){
                swap(arr,l,h);
            }else{
                break;
            }

            l++;
            h--;

            System.out.println(Arrays.toString(arr));
        }
        swap(arr,l,arr.length-1);
        System.out.println(Arrays.toString(arr));

    }

    public static void swap(int arr[],int i,int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
