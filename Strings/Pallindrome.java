import java.util.*;
public class Pallindrome {
    public static void main(String[] args) {
        String s="abbba";

        boolean check=CheckPallindrome(s,0,s.length()-1);
        System.out.println("Is pallindrome : "+check);
    }
    

    public static boolean CheckPallindrome(String s,int i,int j){                
        if(i>j) return true;
        CheckPallindrome(s, i+1, j-1);

        if(s.charAt(i)==s.charAt(j)) return true;
        else return false;
    }
}
