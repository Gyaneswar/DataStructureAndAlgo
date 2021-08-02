import java.util.*;
public class TechnocupElimination2020A {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int a=sc.nextInt();
        int b=sc.nextInt();

        if(b-a==1) System.out.println(a+" "+b);
        else if(b==a) System.out.println(a+"1 "+b+"2");
        else if(a==9 && b==1) System.out.println(a+" "+10);
        else System.out.println(-1);
    }
}
