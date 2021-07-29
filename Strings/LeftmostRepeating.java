import java.util.*;

public class LeftmostRepeating {
    public static void main(String[] args) {
        String s="abcdcdb";

        int count[]=new int[26];

        boolean flag=false;
        for(int i=0;i<s.length();i++){
            count[s.charAt(i)-97]++;
        }
        
        for(int i=0;i<s.length();i++){
            if(count[s.charAt(i)-97]>=2){
                System.out.println(s.charAt(i));
                flag=true;
                break;
            }
        }

        if(!flag)System.out.println("Each of the elements are unique");

    }
}
