import java.util.*;
public class Div2_340A {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int n=sc.nextInt();

        int ans=0;
            if(n>=5){
                ans=ans+n/5;
                n=n%5;
            }
             if(n>=4){                
                ans=ans+n/4;
                n=n%4;
            }
             if(n>=3){                
                ans=ans+n/3;
                n=n%3;
            }
             if(n>=2){                
                ans=ans+n/2;
                n=n%2;
            }
             if(n>=1){                
                ans=ans+n/1;
                n=n%1;
            }
        System.out.println(ans);
    }
}
