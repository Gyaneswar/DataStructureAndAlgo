import java.util.*;
public class Ropes {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);        
        int n=sc.nextInt();
        int k=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        cut(arr,k);            
    }

    public static void cut(int input[],int k){
    double l=0;
    double r=input[0];

    for(int i=0; i<input.length;i++){        
        l=0;
        r=input[i];

        while((r-l)>=Math.pow(10,-6))
        {
            System.out.println(l+"--"+r);
            double mid=(l+r)/2;
            if(good(mid, input, k))
                l=mid;
            else
                r=mid;
        }
    }
        System.out.println(Math.round(l*10)/10.0);
    }

    public static boolean good(double x,int arr[],int k){
        int sum=0;
        for(int i=0;i<arr.length;i++){
            sum+=(int)arr[i]/x;
        }
        if(sum>=k)
            return true;
        else 
            return false;
    }
    
}
