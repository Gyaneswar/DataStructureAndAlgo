import java.util.*;
public class MergeSort {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }

        //MergeSort ob = new MergeSort();
        mergeSort(arr, 0, n - 1);
 
        System.out.println(Arrays.toString(arr));
    }
    public static void mergeSort(int arr[],int l,int r){
        
        if(l<r){
            int mid=(l+r)/2;
            mergeSort(arr, l, mid);
            mergeSort(arr, mid+1, r);
            merge(arr,l,mid,r);        
        }
        System.out.println(Arrays.toString(arr));
    }

    public static void merge(int arr[],int l,int mid,int r){
        int n1=mid-l+1;
        int n2=r-mid;
        int arr1[]=new int[n1];
        int arr2[]=new int[n2];
        for(int i=0;i<n1;i++)
            arr1[i]=arr[i+l];
        for(int i=0;i<n2;i++)
            arr2[i]=arr[mid+1+i];

        int i=0,j=0,k=l;
        
        while(i<n1 && j<n2){
            if(arr1[i]<=arr2[j]){
                arr[k]=arr1[i];
                i++;
                k++;
            }else{
                arr[k]=arr2[j];
                j++;
                k++;
            }
        }

        while(i<n1){
            arr[k]=arr1[i];
            i++;
            k++;
        }
        while(j<n2){
            arr[k]=arr2[j];
            j++;
            k++;
        }
    }
}
