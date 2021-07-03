import java.util.Arrays;
import java.util.Scanner;
public class Joshephus {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int n=sc.nextInt();
        int k=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
            arr[i]=i;
        System.out.println(kill(n,k));
    }
    public static int kill(int n,int k){
        
        if(n==1){
            return 0;
        }        

        return (kill(n-1,k)+k)%n;
        
    }
}