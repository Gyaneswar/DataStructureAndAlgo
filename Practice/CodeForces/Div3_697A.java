import java.util.*;
public class Div3_697A {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            long n=sc.nextLong();
            if(n%2!=0) System.out.println("YES");
            else {
                boolean flag=false;
                while(n>0){
                    if(n!=1 && n%2!=0){
                        flag=true;
                        break;
                    }      
                    n=n/2;              
                }
                System.out.println(flag? "YES": "NO");
            }
        }

    }
}
