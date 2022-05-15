//package Sorting;

public class UnionOfTwoSortedArrays {
    public static void main(String[] args) {
        int arr1[] = {2,4};
        int arr2[] = {4,4,4,4,4,4,5};

        int i=0,j=0;

        while(i < arr1.length && j < arr2.length){
            while(i+1 < arr1.length && arr1[i] == arr1[i+1]){
                i++;
            }

            while(j+1 < arr2.length && arr2[j] == arr2[j+1]){
                j++;
            }

            if(arr1[i] == arr2[j]){
                System.out.print(arr1[i]+" ");
                i++;
                j++;
            }else if(arr1[i] < arr2[j]){
                System.out.print(arr1[i]+" ");
                i++;                
            }else{
                System.out.print(arr2[j]+" ");
                j++;
            }
        }

        while(i < arr1.length){
            while(i+1 < arr1.length && arr1[i] == arr1[i+1]){                
                i++;
            }
            System.out.print(arr1[i]+" ");
            i++;
        }

        while(j < arr2.length){
            while(j+1 < arr2.length && arr2[j] == arr2[j+1]){                
                j++;
            }
            System.out.print(arr2[j]+" ");
            j++;
        }
    }
}
