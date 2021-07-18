import java.util.*;
public class Div2_730A {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();

        while(t>0){

            long a=sc.nextLong();
            long b=sc.nextLong();

            long gcd=Math.abs(a-b);

            if(a>b){
                long temp=a;
                a=b;
                b=temp;
            }            

            long ans=0;
            if(gcd!=0){
                long prev=gcd * (a/gcd);
                long next=gcd * ((a/gcd)+1);
                ans=Math.min(Math.abs(prev-a), Math.abs(next-a));
            }            
            System.out.println(gcd + " "+ans);            

            t--;
        }
    }
}
