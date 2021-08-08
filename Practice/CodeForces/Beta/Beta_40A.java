package Beta;

import java.util.*;
public class Beta_40A {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        StringBuilder str1=new StringBuilder(sc.nextLine());
        String str2=sc.nextLine();

        if(str1.reverse().toString().equals(str2))
            System.out.println("YES");
        else
            System.out.println("NO");



    }
}
