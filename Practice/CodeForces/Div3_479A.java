import java.util.*;
public class Div3_479A {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int n=sc.nextInt();
        int k=sc.nextInt();
    
        while(k>0){            
            int lastDigit=n%10;
            if(k>=lastDigit && lastDigit!=0){
                n=n-lastDigit;
                k=k-lastDigit;
            }
            else if(lastDigit!=0){
                n--;
                k--;
            }
            lastDigit=n%10;
            if(k!=0 && lastDigit==0){
                n=n/10;
                k=k-1;
            }            

        }
        System.out.println(n);
    }
}
