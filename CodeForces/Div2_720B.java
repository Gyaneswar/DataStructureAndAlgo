//https://codeforces.com/problemset/problem/1521/B
import java.util.*;
public class Div2_720B {
    static Scanner sc;
    public static void main(String[] args) {
        sc=new Scanner(System.in);
        int t=sc.nextInt();

        while(t>0){
            Process();
            t--;
        }
    }

    public static void Process(){
        int n=sc.nextInt();

        int arr[]=new int[n];
        int smallest=Integer.MAX_VALUE;
        int index=0;

        for(int i=0;i<n;i++){            
            arr[i]=sc.nextInt();
            if(arr[i]<smallest){
                smallest=arr[i];
                index=i;
            }                
        }
        int temp=smallest;
        System.out.println(n-1); 
        for(int i=index;i>0;i--){
            temp=temp+1;
            arr[i-1]=temp;
            System.out.println((index+1)+" "+(i)+" "+smallest+" "+(temp));            
            //System.out.println(Arrays.toString(arr));
        }

        temp=smallest;
        for(int i=index;i<n-1;i++){
            temp=temp+1;
            arr[i+1]=temp;
            System.out.println((index+1)+" "+(i+1+1)+" "+smallest+" "+temp);            
            //System.out.println(Arrays.toString(arr));
        }

        //System.out.println(Arrays.toString(arr));       
    }
}
