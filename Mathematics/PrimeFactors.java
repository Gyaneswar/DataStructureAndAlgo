import java.util.*;
public class PrimeFactors {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int n=sc.nextInt();
        int x=n;
        for(int i=2;i*i<=n;i++){
            if(IsPrime(i)){
                while(x%i==0){
                    System.out.println(i);
                    x=x/i;
                }
            }
        }
    }


    public static boolean IsPrime(int n){
        for(int i=2;i*i<=n;i++){
            if(n%i==0)
                return false;
        }
        return true;
    }
}
