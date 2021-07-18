import java.util.*;

public class Div3_5A {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();

        while(t-->0){

            int a=sc.nextInt(),b=sc.nextInt();            
            if(a>b){
                int temp=a;
                a=b;
                b=temp;
            }
            if(a==b){
                System.out.println(1);
            }else{
                int ans=0;
                while(a!=0 && b!=0){
                    ans=ans+b/a;
                    b=b%a;
                    

                    if(b!=0){                    
                    ans=ans+a/b;
                    a=a%b;
                    }

                }
                System.out.println(ans);
            }


        }
    }
}
