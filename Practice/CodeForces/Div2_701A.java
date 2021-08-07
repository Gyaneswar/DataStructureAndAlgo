import java.util.*;
public class Div2_701A {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            double a=sc.nextDouble();
            double b=sc.nextDouble();            
            if(b>a) System.out.println(1);
            else if(a==b) System.out.println(2);
            else {
                int ans=0;
                int prevans=Integer.MAX_VALUE;
                double tempb=b;
                if(b==1){
                    b=2;
                    ans=1;
                }

            
            while(true){
            double tempa=a;
            
                while(tempa!=0){
                    tempa=Math.floor((double)(tempa/b));
                    ans++;
                }
                if(prevans<ans) {
                    break;
                }
                else {
                    prevans=ans;
                    b+=1;                    
                    ans=(int)(b-tempb);                    
                }
            }
            System.out.println(prevans);

            }
        }
    }
}
