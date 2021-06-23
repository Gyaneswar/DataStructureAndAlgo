import java.util.*;
public class EfficientPower {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        
        int x=sc.nextInt();
        int n=sc.nextInt();

        int res=1;
        while(n>0){
            if(n%2!=0){
                res=res*x;                
            }
            x=x*x;
            n=n/2;            
        }
        System.out.println(res);
    }
}
