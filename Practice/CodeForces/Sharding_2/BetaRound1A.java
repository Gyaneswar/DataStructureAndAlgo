package Practice.CodeForces.Sharding_2;
import java.util.*;
public class BetaRound1A {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        long n=sc.nextLong();
        long m=sc.nextLong();
        long a=sc.nextLong();

        long ans=(long)Math.ceil((double)n/a)*(long)Math.ceil((double)m/a);

        System.out.println(ans);

    }
}
