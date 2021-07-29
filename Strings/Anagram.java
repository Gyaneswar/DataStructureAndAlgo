import java.util.*;
public class Anagram {
    public static void main(String[] args) {
        String s1="listen";
        String s2="silent";

        if(s1.length()!=s2.length()) System.out.println("Is a anagram : false");
        else {
            int a1[]=new int[26];
            int a2[]=new int[26];

            for(int i=0;i<s1.length();i++){
                a1[(int)s1.charAt(i)-97]++;
                a2[(int)s2.charAt(i)-97]++;
            }
            System.out.println("Is a anagram : "+Arrays.equals(a1, a2));
        }
    }
}
