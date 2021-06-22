public class QuickSort {
public static void main(String[] args) {
        int arr[]={};
        Sort(arr, p);

    }

    public static void Sort(int arr[],int p){

    }
    
    public static void Partition(int arr[]){
        int p=arr[arr.length-1];

        int i=0;
        int j=p;
        boolean inside=false;
        while(i<j)
        {
            while(arr[i]<arr[p] && i<j){
                i++;              
                inside=true;
            }
            while(arr[j]>arr[p] && i<j){
                j++;
                inside=true;
            }
            if(inside)
                Swap(arr,i,j);
            inside=false;
        }

    }
//////////8,6,1,5,2,3,9,7
//////////3,6,1,5,2,8,9,7


//////////
    public static void Swap(int arr[],int i,int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
}
