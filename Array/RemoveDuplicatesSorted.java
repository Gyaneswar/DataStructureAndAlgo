import java.util.Arrays;
import java.util.Scanner;

public class RemoveDuplicatesSorted {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int arr[] = new int[n];
        //10 20 20 30 30 30
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int i=0,j=1;
        while(j<n){
            if(arr[i]!=arr[j]){
                i++;
                arr[i] = arr[j];
            }
            j++;
        }
        System.out.println(Arrays.toString(arr)+"\n"+"Size of array: "+(i+1));
    }
    
}
