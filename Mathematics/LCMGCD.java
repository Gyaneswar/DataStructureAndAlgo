import java.util.*;
public class LCMGCD {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();

        int gcd=GCD(a,b);
        int lcm=(a*b)/gcd;

        System.out.println(lcm +"---"+gcd);
    }


    public static int GCD(int a,int b){
        if(b==0)
            return a;
        
        return GCD(b,a%b);
    }
}
