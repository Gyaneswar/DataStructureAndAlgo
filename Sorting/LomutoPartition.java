import java.util.Arrays;

public class LomutoPartition {
    public static void main(String[] args) {
        int arr[]={4,7,2,1,3,9,8,5};  
        //int arr[]={1,2,3,4,5};
        //int arr[]={5,4,3,2,1};

        lomutoPartition(arr,0,arr.length-1);
    }

    public static void lomutoPartition(int arr[],int l,int h){
        int pivot=arr[h];
        int i=l-1;        
        for(int j=l;j<h;j++){

            if(arr[j]<=pivot){//arr[h] is the pivot
                i++;
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
            }            
        }
        int temp=arr[h];
        arr[h]=arr[i+1];
        arr[i+1]=temp;

        System.out.println(Arrays.toString(arr)+"\n"+"pivot: "+(i+1));
    }
}
