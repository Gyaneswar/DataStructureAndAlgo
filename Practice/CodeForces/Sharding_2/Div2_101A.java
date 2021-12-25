package Practice.CodeForces.Sharding_2;
import java.util.*;
public class Div2_101A {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            String s=sc.next();
            int n=s.length();
            if(s.length()%2!=0) System.out.println("NO");
            else if(s.charAt(0)==')' || s.charAt(n-1)=='(') System.out.println("NO");
            else{
                System.out.println("YES");
            }
        }
    }
}
