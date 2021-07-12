import java.util.*;

public class Div2_E92A {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int t=sc.nextInt();

        for(int z=0;z<t;z++){
            int l=sc.nextInt();
            int r=sc.nextInt();

            if(r%l==0){
                System.out.println(l+" "+r);
            }
            else if(l*2 <= r){
                System.out.println(l+" "+l*2);
            }
            else if(2*(l+1)<=r){
                System.out.println((l+1)+" "+2*(l+1));
            }else{
                System.out.println(-1+" "+-1);
            }
        }
    }
}
