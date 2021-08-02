import java.util.*;

public class Div2_651A {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int t=sc.nextInt();

        while(t>0){
            int n=sc.nextInt();

            if(n%2==0){
                System.out.println(n/2);
            }else{
                System.out.println((n-1)/2);
            }

            t--;
        }
    }
}
