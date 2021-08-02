import java.util.*;

public class Div3_667A {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int t=sc.nextInt();

        while(t>0){

            int a=sc.nextInt();
            int b=sc.nextInt();

            if(b<a){
                a=a^b;
                b=a^b;
                a=a^b;
            }            
            

            int diff=b-a;
            int ans=0;
            if(diff>=10){
                ans=diff/10;
                //System.out.println(ans);
                diff=diff%10;  
                //System.out.println(diff);             
            }
            if(diff>0){
                System.out.println(ans+1);    
            }
            else
                System.out.println(ans);

            t--;
        }
    }
}
