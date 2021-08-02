import java.util.*;
public class Div2_74A {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int T=sc.nextInt();

        while(T-->0){
            long x=sc.nextLong();
            long y=sc.nextLong();
            long diff=x-y;
            System.out.println(diff==1?"NO":"YES");        
        }
    }
}
