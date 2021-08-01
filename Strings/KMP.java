import java.util.*;
public class KMP {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        String pat=sc.next();
        int n=s.length();
        int m=pat.length();
        int lps[] = new int[m];
        FillLPS(lps, pat);
        int i=0;
        int j=0;
        while(i<n){
            if(s.charAt(i)==pat.charAt(j)){
                i++;
                j++;
            }
            if(j==m){System.out.println(i-m); j=lps[j-1];}
            else if(i<n && s.charAt(i)!=pat.charAt(j)){
                if(j==0) i++;
                else j=lps[j-1];
            }
        }

    }

    public static void FillLPS(int lps[],String pat){
        int len=0;
        lps[0]=0;
        int i=1;
        int n=pat.length();
        while(i<n){
            if(pat.charAt(i)==pat.charAt(len)){
                len++;
                lps[i]=len;
                i++;
            }
            else if(len==0){lps[i]=0;i++;}
            else {
                len=lps[i-1];
            }
        }
    }
}
