//Given a number check weather the number is a power of two or not
import java.util.*;
public class PowerOfTwo {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int n=sc.nextInt();
        

        if((n & (n-1))==0)
            System.out.println("Yes");
        else
            System.out.println("No");
    }    
}
