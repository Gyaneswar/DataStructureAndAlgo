import java.util.*;
public class LexicographicRank {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        int count[]=new int[256];         
        int n=s.length();
        int fact=Fact(n);
        for(int i=0;i<n;i++)    count[s.charAt(i)]++;        
        for(int i=1;i<256;i++)  count[i]+=count[i-1];
        int res=1;
        for(int i=0;i<n-1;i++){
            fact=fact/(n-i);
            res=res+(fact*count[(int)s.charAt(i)-1]);

            for(int j=(int)s.charAt(i);j<256;j++) count[j]--;
        }
        System.out.println(res);
    }

    public static int Fact(int n){
        int res=1;
        for(int i=2;i<=n;i++){
            res=res*i;
        }
        return res;
    }
}
