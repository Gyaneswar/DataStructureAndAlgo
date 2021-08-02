import java.util.*;
public class Div2_720A {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        

        while(t-->0){
        long a=sc.nextLong();
        long b=sc.nextLong();
        if(b==1){
            b=4;
            System.out.println("NO");
            //System.out.println((a*1)+" "+(a*3)+" "+(a*b));
        }
        else if(b==2){
            b=4;
            System.out.println("YES");
            System.out.println((a*1)+" "+(a*3)+" "+(a*b));
        }else{
            System.out.println("YES");
            System.out.println((a*1)+" "+(a*(b-1))+" "+(a*b));
        }
    }
    }
}
