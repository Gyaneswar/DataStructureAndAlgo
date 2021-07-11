import java.util.Arrays;
import java.util.Scanner;

public class CountingSort {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("It is assumed that 0<ai<9");
        int n=sc.nextInt();
        int arr[]=new int[n];
        int bookmark[]=new int[10];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();  
            bookmark[arr[i]]++;          
        }

        for(int i=1;i<n;i++){
            bookmark[i]=bookmark[i]+bookmark[i-1];
        }

        for(int i=n-1;i>0;i--){
            bookmark[i]=bookmark[i-1];
        }


        int newarr[]=new int[n];
        for(int i=0;i<n;i++){
            int index=bookmark[arr[i]]++;
            newarr[index]=arr[i];
        }
        
        System.out.println(Arrays.toString(newarr));


    }
    
}
