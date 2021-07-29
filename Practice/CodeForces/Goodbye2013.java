import java.util.*;
public class Goodbye2013 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int a=sc.nextInt();
        int b=sc.nextInt();

        int reserve=0;
        int ans=a;
        while(a>=b){
            reserve=(a%b);
            a=a/b;
            ans=ans+a;
            a=a+reserve;
        }
        System.out.println(ans);
    }
}
