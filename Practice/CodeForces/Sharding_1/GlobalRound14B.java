import java.util.*;    
public class GlobalRound14B {
    public static void main(String[] args) {            
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            if(n%2!=0) System.out.println("NO");
            else if(n%2==0 && perfectSq(n/2)) System.out.println("YES");
            else if(n%4==0 && perfectSq(n/4)) System.out.println("YES");
            else System.out.println("NO");
        }
    }

    public static boolean perfectSq(int n){
        double a=Math.sqrt(n);
        int b=(int)a;
        if(a-b==0) return true;
        else return false;
    }
}
