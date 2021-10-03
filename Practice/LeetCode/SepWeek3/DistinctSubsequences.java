package SepWeek3;
import java.util.HashMap;

public class DistinctSubsequences {
    public static void main(String[] args) {
        String s="babgbag", t = "bag";
        int ans=numDistinct(s, t);
        System.out.println(ans);
    }
    public static int numDistinct(String s, String t) {
        StringBuilder str1=new StringBuilder(s);
        StringBuilder str2=new StringBuilder(t);
        map=new HashMap<>();
        countRecursive(str1,str2,0);
        return map.get(s);
    }
    static HashMap<String,Integer> map;
    //static int count=0;
    
    public static int countRecursive(StringBuilder s,StringBuilder t,int index){        
        if(s.toString().equals(t.toString())){      
            return 1;
        }
        if(index>=s.length()) return 0;  
        
        if(map.containsKey(s.toString())) return map.get(s.toString());
        
        int count=0;
        count+=countRecursive(s,t,index + 1);
        char c=s.charAt(index);        
        s.delete(index,index+1);
        
        count+=countRecursive(s,t,index);
        s.insert(index,c);        

        map.put(s.toString(),count);
        return count;
        
    }
}
