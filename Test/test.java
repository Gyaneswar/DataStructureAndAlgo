//This is a test class to test certain things about java
import java.util.Arrays;
import java.util.HashMap;
import java.util.Stack;
import java.util.*;
import java.util.ArrayList;

public class test {
    public static void main(String[] args) {
        TreeMap<String,Integer> map = new TreeMap<>();
        map.put("A",1);
        map.put("B",2);
        map.put("C",3);

        System.out.println(map.entrySet());

    }
    static List<String> res;
    static HashSet<String> set=new HashSet<>();
    public static void recur(StringBuilder str,int index,int n){
        if(index == n){
            if(set.add(str.toString())){
                res.add(str.toString());
            }
            return;
        }
        
        
        for(int i=0;i<str.length();i++){
            if(str.charAt(i) == '('){
                str.insert(i,"()");
                recur(str,index + 1,n);
                str.delete(i,i+2);
                str.insert(i+1,"()");
                recur(str,index + 1,n);
                str.delete(i+1,i+3);
            }
        }
        return;
    }
    
}





