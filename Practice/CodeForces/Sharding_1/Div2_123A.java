import java.util.*;
public class Div2_123A {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();

        int total=a*c;
        int extra=b*c;

        total=total-extra;

        if(total%b==0) System.out.println(total/b);
        else {
            int x=(total/b)+1;
            System.out.println(x);

        }


    }
}
