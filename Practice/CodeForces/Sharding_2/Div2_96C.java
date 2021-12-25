package Practice.CodeForces.Sharding_2;
import java.util.*;


public class Div2_96C {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt(); 
            if(n>2){                       
            System.out.println(2);            
            int sum=n-2;
            for(int i=n;i>=1;i--){
                if(i==n-2) continue;
                System.out.println(i+" "+sum);                
                sum=(sum+(i))/2;
            }
        }else if(n==2){System.out.println(2);System.out.println(1+" "+2);}
        }
    }
}
