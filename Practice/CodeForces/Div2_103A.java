import java.util.*;
public class Div2_103A{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            int k=sc.nextInt();
            
            if(n%k==0) System.out.println(1);
            else if(n==1) System.out.println(k);
            else{
                int ans=0;
                if(n<k){                    
                    int temp=k%n;
                    ans=(k/n) + (temp==0?0:1); 
                }else{                    
                    ans=2;
                }
                System.out.println(ans);
            }

        }
    }
}