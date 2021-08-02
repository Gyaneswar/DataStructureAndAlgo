import java.util.*;
public class Div2_304 { 
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int k=sc.nextInt(); //price
        int n=sc.nextInt(); //dollars
        int w=sc.nextInt(); //bananas

        int total=w*(w+1);
        total=(total/2) * k;


        if(total<n)
        System.out.println(0);
        else
        System.out.println(total-n);



    }   
}
