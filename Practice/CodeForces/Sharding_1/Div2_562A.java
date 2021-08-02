import java.util.*;
public class Div2_562A {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        
            int n=sc.nextInt();
            int a=sc.nextInt();
            int x=sc.nextInt();
            int b=sc.nextInt();
            int y=sc.nextInt();

            boolean ans=false;
            
            if(a==b){
                ans=true;
            }else{
            while(true){
                if(a+1>n) a=1;else a=a+1;
                if(b-1<1) b=n;else b=b-1;
                if(a==b){
                    ans=true;
                    break;
                }
                if(a==x || b==y) break;                
            }
            }
            if(ans) System.out.println("YES");
            else System.out.println("NO");                
    }
}
