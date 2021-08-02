import java.util.*;
public class Unrated_16B {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int t=sc.nextInt();
        while(t>0){
            int a1=sc.nextInt();
            int b1=sc.nextInt();

            int a2=sc.nextInt();
            int b2=sc.nextInt();

            if(a1==a2 && b1+b2==a1){
                System.out.println("YES");
            }else if(b1==b2 && a1+a2==b1){
                System.out.println("YES");  
            }else if(a1==b2 && a2+b1==a1){
                System.out.println("YES");
            }
            else if(a2==b1 && a1+b2==a2){
                System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }
            t--;
        }

    }
}
