import java.util.*;
public class QuickSort {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int n=sc.nextInt();
        int arr[]=new int[n];
        
        for(int i=0;i<n;i++)
            arr[i]=sc.nextInt();

        quickSortLomuto(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));

        int n1=sc.nextInt();
        int arr1[]=new int[n1];
        
        for(int i=0;i<n1;i++)
            arr1[i]=sc.nextInt();

        quickSortHoare(arr1,0,arr1.length-1);
        System.out.println(Arrays.toString(arr1));



    }

    public static void quickSortLomuto(int arr[],int l,int h){
        if(l<h){
            int p=partitionLomuto(arr,l,h);
            quickSortLomuto(arr, l, p-1);
            quickSortLomuto(arr, p+1, h);
        }
    }
    public static void quickSortHoare(int arr[],int l,int h){
        if(l<h){
            int p=partitionHoare(arr,l,h);
            quickSortHoare(arr, l, p);
            quickSortHoare(arr, p+1, h);
        }
    }


    public static int partitionLomuto(int arr[],int l,int h){
        int pivot=arr[h];
        int i=l-1;        
        for(int j=l;j<h;j++){

            if(arr[j]>=pivot){//arr[h] is the pivot
                i++;
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
            }            
        }
        int temp=arr[h];
        arr[h]=arr[i+1];
        arr[i+1]=temp;

        return i+1;
    }



    public static int partitionHoare(int arr[],int l,int h){
        int i=l-1;
        int j=h+1;

        int pivot=arr[l];

        while(true){

            do{
                i++;
                
            }while(arr[i]<pivot);

            do{
                j--;
            }while(arr[j]>pivot);


            if(i>=j)
                break;

            int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;

        }                
        return j;
    }

}
