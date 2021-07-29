import java.util.*;
public class Div2_383A {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        long n=sc.nextInt();

        long rem=n%4;
        if(n==0) System.out.println(1);
        else if(n==1) System.out.println(8);
        else if(n == 2) System.out.println(4);
        else if(n == 3) System.out.println(2);
        else if(n == 4) System.out.println(6);
        else if(rem == 1 )System.out.println(8);
        else if(rem == 2 )System.out.println(4);
        else if(rem == 3 )System.out.println(2);
        else if(rem == 0 )System.out.println(6); 
    }
}
