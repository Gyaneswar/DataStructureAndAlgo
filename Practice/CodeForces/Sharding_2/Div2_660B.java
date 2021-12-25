package Practice.CodeForces.Sharding_2;
import java.util.*;
public class Div2_660B {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            if(n==1) System.out.println(8);
            else{
                long eight=0;
                if(n%4==0) eight=(n/4);
                else eight=(n/4)+1;
                long nine=n-eight;
                
                for(int i=0;i<nine;i++)
                    System.out.print(9);
                for(int i=0;i<eight;i++)
                    System.out.print(8);
                System.out.println();
            }
        }
    }
}
