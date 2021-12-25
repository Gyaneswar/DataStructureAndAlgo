package Practice.CodeForces.Sharding_2;
import java.util.*;
public class Div3_653C {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            String s=sc.next();
            int open=0;
            int ans=0;
            for(int i=0;i<n;i++){
                if(s.charAt(i)=='(') open++;
                if(s.charAt(i)==')' && open==0) ans++;
                else if(s.charAt(i)==')' && open>0) open--;
            }
            System.out.println(ans);
        }
    }
}
