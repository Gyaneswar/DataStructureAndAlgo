import java.util.*;
public class SelectionSort {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int arr[]={3,1,2,4,5};
        System.out.println(Arrays.toString(arr));
        int n=arr.length;
        int ans=0;
        for(int i=0;i<n;i++){
            int min=Integer.MAX_VALUE;
            int index=0;
            for(int j=i;j<n;j++){
                if(arr[j]<min){
                    min=arr[j];
                    index=j;
                }
            }
            if(index!=i){
            int temp=arr[i];
            arr[i]=min;
            arr[index]=temp;            
            ans++;
            }
        }
        System.out.println(Arrays.toString(arr));
        System.out.println("Number of swaps : "+ans);
    }
}
