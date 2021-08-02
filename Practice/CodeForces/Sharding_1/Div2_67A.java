import java.util.*;
public class Div2_67A {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int T=sc.nextInt();
        while(T-->0){
        int n=sc.nextInt();
        int s=sc.nextInt();
        int t=sc.nextInt();

        if(s>=n && t>=n) System.out.println(1);
        else {
            int temp=Math.min(s, t);
            System.out.println(n-temp+1);
        }            
    }
}
}