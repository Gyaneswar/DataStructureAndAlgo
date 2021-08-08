import java.util.*;
public class Div2_95A {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            long x=sc.nextLong();
            long y=sc.nextLong();
            long k=sc.nextLong();

            long required=(y*k)+(k)-1;
            long trades=((long)required/(x-1));      
            if((required%(x-1))==0)
                System.out.println(trades+k);
            else System.out.println(trades+k+1);
        }
    }
}