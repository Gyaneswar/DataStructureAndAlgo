import java.util.*;
public class Div3_629 {
    
    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);


    int t=sc.nextInt();

    while(t>0){

        int a=sc.nextInt();
        int b=sc.nextInt();

        int rem=a%b;

        if(rem==0)
            rem=b;

        System.out.println(b-rem);
        
        t--;
    }
    

    }
}
