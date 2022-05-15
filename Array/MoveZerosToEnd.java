import java.util.*;
//package Array;
public class MoveZerosToEnd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int arr[] = new int[n];

        //simple question cant be bothered to solve, just use 2 pointer method
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }

        int i=0,j = arr.length-1;
        while(i < j){
            while(arr[j] != 0)
                j--;
            if(arr[i] == 0){
                swap(arr,i,j);
                j--;
            }

            i++;
        }

        System.out.println(Arrays.toString(arr));
    }

    public static void swap(int arr[],int i,int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
