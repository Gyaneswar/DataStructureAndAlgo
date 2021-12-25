package Practice.CodeForces.Sharding_2;
import java.util.*;
public class TechnoCup2021B {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            long n=sc.nextLong();            
            while(true){
                if(check(n)){System.out.println(n);;break;}
                else n++;
            }
        }
    }
    public static boolean check(long n){
        long temp=n;

        while(temp>0){
            long digit=temp%10;
            if(digit!=0 && n%digit!=0) return false;
            temp/=10;
        }
        return true;
    }
}
