//package Recursion;

import java.util.HashSet;

public class GetAllSubsets {
    public static void main(String[] args) {
        String str = "abcd";
        StringBuilder curr = new StringBuilder("");
        recur(str, curr,0,true);
        //System.out.println(set.toString());
    }
    static HashSet<String> set = new HashSet<>();
    public static void recur(String str,StringBuilder curr,int index,boolean print){        
        
        if(print)
            System.out.println(curr.toString());

        if(index == str.length())
            return;

        curr.append(str.charAt(index));
        recur(str, curr, index+1, true);
        curr.deleteCharAt(curr.length()-1);
        recur(str, curr, index+1 , false);
        return;
    }
}
