import java.util.*;
public class Div2_726A {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int t=sc.nextInt();

        while(t>0){
            int n=sc.nextInt();
            int sum=0;
            for(int i=0;i<n;i++){
                int input=sc.nextInt();
                sum+=input;
            }

            if(sum<=0 || sum/n==0){
                System.out.println(1);
            }else{
                System.out.println(sum-n);

            }

            t--;
        }
    }
}
