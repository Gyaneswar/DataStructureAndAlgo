import java.util.*;
public class Div2_727A {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int te=sc.nextInt();

        while(te>0){
            long n=sc.nextLong();
            long x=sc.nextLong();
            long t=sc.nextLong();

            long tx=(t/x);
            if(n==1){
                System.out.println(0);
            }
            else if(tx>=n)
            {
                tx=(n-1)*n;
                System.out.println(tx/2);
            }
            else{
                long count=tx*(n-tx);
                count=count+((tx-1)*tx)/2;
                System.out.println(count);
            }            
            

            te--;
        }
    }
}
