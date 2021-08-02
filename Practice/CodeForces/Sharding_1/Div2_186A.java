import java.util.*;
public class Div2_186A {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        long n=sc.nextLong();

        if(n>=0){
            System.out.println(n);
        }else{
            n=n*-1;
            long digit1=n%10;
            long temp1=n/10;
            long digit2=temp1%10;
            long temp2=temp1/10;
            

            if(digit1>=digit2) System.out.println(temp1*-1);
            else {
                temp2=temp2*10 + digit1;
                System.out.println(temp2*-1);
            }

        }
    }
    
}
