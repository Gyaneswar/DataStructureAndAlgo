import java.util.*;

public class Div2_9A {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int a=sc.nextInt();
        int b=sc.nextInt();

        int greater=a>b?a:b;        

        int ans=(6-greater)+1;
        if(greater==1)
            System.out.println(1+"/"+1);
        else{
            int deno=6;
            for(int i=2;i<=3;i++){
                if(ans%i==0 && deno%i==0){
                    ans=ans/i;
                    deno=deno/i;
                }
            }
            System.out.println(ans+"/"+deno);
        }
    }
}
