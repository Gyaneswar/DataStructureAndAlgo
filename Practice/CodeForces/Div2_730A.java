import java.util.*;
public class Div2_730A {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();

        while(t>0){

        int a=sc.nextInt();
        int b=sc.nextInt();

        int gcd=Math.abs(a-b);
            if(a>b) {
                int temp=a;
                a=b;
                b=temp;
            }
            if(gcd==0){
                System.out.println(0+" "+0);
            }
            else{
            int down=(a/gcd) * gcd;

            int up= (a/gcd +1)* gcd;

            System.out.println(gcd+" "+Integer.min(a-down ,up-a));
            }




            t--;
        }
    }
}
