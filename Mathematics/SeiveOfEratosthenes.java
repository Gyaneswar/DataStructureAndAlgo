import java.util.Arrays;
import java.util.Scanner;

// this algo is used to find all the prime numbers which comes before N
public class SeiveOfEratosthenes{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int n=sc.nextInt();

        boolean isPrime[]=new boolean[n+1];
        Arrays.fill(isPrime, true);
        isPrime[0]=false;
        isPrime[1]=false;

        for(int i=2;i*i<=n;i++){
            if(isPrime[i]){                                
                for(int j=2*i;j<=n;j=j+i){                                                            
                    isPrime[j]=false;
                }
            }
        }

        for(int i=2;i<=n;i++){
            if(isPrime[i])
                System.out.println(i);
        }
    }
}