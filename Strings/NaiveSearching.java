import java.util.*;
public class NaiveSearching {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s="ABABCAB";
        String pat="ABC";
        int n=s.length();
        int m=pat.length();

        int j=0;
        for(int i=0;i<=n-m;i++){
            for(j=i;j<i+m;j++){
                if(s.charAt(j)!=pat.charAt(j-i)){
                    break;
                }
            }
            if(j==i+m) System.out.println(i+1);
        }
    }
}
