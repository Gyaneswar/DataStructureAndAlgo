import java.util.*;

public class Div3_624 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int t=sc.nextInt();

        while(t>0){

            int a=sc.nextInt();
            int b=sc.nextInt();

            int diff=b-a;
            if(diff==0)
            System.out.println(0);
            else if(diff>0)
            System.out.println(diff%2==0?(2):(1));
            else
            System.out.println(diff%2==0?(1):(2));
            t--;

        }
    }
}
