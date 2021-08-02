import java.util.*;
public class Div3_697B {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t--!=0){
            int n=sc.nextInt();

            int a=n/2020;
            int b=(a*2020);
            int c=n%2020;
            if(n<2020) System.out.println("NO");
            else if(b==n)
                System.out.println("YES");
            else if(c<=a)
                System.out.println("YES");
            else System.out.println("NO");
        }
    }
}
