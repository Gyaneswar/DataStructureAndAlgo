package BitMagic;

import java.util.*;

public class AddTwoNumbers {
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        while(y>0){                 
            int carry = (x & y);
            x = x ^ y;                               
            y = carry << 1;
        }
        System.out.println(x);
    }    
}
