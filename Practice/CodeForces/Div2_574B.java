import java.util.*;
public class Div2_574B {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        long n=sc.nextLong();
        long k=sc.nextLong();
        long res=Search(n, k);  
        res=(res*(res+1))/2;      
        System.out.println(res-k);

    }

    public static long Search(long n,long k){
        long l=1;
        long r=n;        
        while(l+1<r){
            
            long mid=(l+r)/2;

            long sum=((mid*(mid+1))/2)-(n-r);

            if(sum>=k) {r=mid;}
            else l=mid;
        }
        return r;
    }
}
