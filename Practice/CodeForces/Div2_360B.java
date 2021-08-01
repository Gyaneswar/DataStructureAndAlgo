import java.util.*;
public class Div2_360B {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String n=sc.next();
        StringBuilder str=new StringBuilder(n);

        System.out.print(str+""+str.reverse().toString());

    }
}
