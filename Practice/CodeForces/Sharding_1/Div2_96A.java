import java.util.*;
public class Div2_96A {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int T=sc.nextInt();

        while(T-->0){
            int n=sc.nextInt();
            if(n==1 || n==2 || n==4) System.out.println(-1);
            else if(n%7==0) System.out.println(0+" "+0+" "+n/7);
            else if(n%5==0) System.out.println(0+" "+n/5+" "+0);
            else if(n%3==0) System.out.println(n/3+" "+0+" "+0);
            else if((n-7)%3==0) System.out.println((n-7)/3+" "+0+" "+1);
            else if((n-7)%5==0) System.out.println(0+" "+(n-7)/5+" "+1);
            else if((n-5)%3==0) System.out.println((n-5)/3+" "+1+" "+0);
            else if((n-5)%7==0) System.out.println(0+" "+1+" "+(n-5)/7);
        }
    }
}
