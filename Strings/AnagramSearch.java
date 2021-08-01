import java.util.*;
public class AnagramSearch {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        String pat=sc.next();
        int n=s.length();
        int m=pat.length();

        int ct[]=new int[256];
        int cp[]=new int[256];
        for(int i=0;i<m;i++){
            ct[s.charAt(i)]++;
            cp[pat.charAt(i)]++;
        }

        boolean flag=false;
        for(int i=m;i<n;i++){
            if(Arrays.equals(ct, cp)){
                System.out.println("Yes has a anagram of the pattern");
                flag=true;
                break;
            }

            ct[s.charAt(i)]++;
            ct[i-m]--;
        }

    if(!flag) System.out.println("does not have a anagaram");


    }    
}
