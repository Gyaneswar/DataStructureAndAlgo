package Practice.CodeForces.Sharding_2;
import java.util.*;
public class Div2_664A {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int r=sc.nextInt();
            int g=sc.nextInt();
            int b=sc.nextInt();
            int w=sc.nextInt();
            
            if(r%2+g%2+b%2+w%2<=1) System.out.println("YES");
            else if((r!=0 && b!=0 && g!=0) && (r-1)%2+(g-1)%2+(b-1)%2+(w+1)%2<=1) System.out.println("YES");            
            else System.out.println("NO");
            
        }
    }
}
