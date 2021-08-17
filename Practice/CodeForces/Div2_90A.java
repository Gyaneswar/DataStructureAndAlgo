import java.util.*;
public class Div2_90A {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            long a=sc.nextLong();
            long b=sc.nextLong();
            long c=sc.nextLong();

            if(a<c) {
                System.out.print(1+" ");
                if(a*b<=c) System.out.print(-1);
                else System.out.print(b);
            }else if(a==c){
                System.out.print(-1+" ");
                System.out.print(b);
            }else{
                System.out.print(-1+" ");
                System.out.print(b);
            }
            System.out.println();
        }
    }
}
