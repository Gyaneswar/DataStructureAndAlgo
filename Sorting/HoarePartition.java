import java.util.*;
public class HoarePartition {
    public static void main(String[] args) {
        int arr[]={5,3,8,4,2,7,1,10};

        //int arr[]={4,7,2,1,3,9,8,5};  
        //int arr[]={1,2,3,4,5};
        //int arr[]={5,4,3,2,1};

        System.out.println(hoarePartition(arr,0,arr.length-1));
    }

    public static int hoarePartition(int arr[],int l,int h){
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

        

        System.out.println(Arrays.toString(arr));
        
        return j;
    }
}
