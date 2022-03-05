import java.util.*;
public class IsomorphicStrings {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        String s=sc.next();
        String t=sc.next();
        HashMap<Character,Character> map1=new HashMap<>();
        HashMap<Character,Character> map2=new HashMap<>();
        for(int i=0;i<s.length();i++){            

            if(map1.containsKey(s.charAt(i)) && map1.get(s.charAt(i))!=t.charAt(i))
                System.out.println(false);
            else
                map1.put(s.charAt(i),t.charAt(i));

            if(map2.containsKey(t.charAt(i)) && map2.get(t.charAt(i))!=s.charAt(i))
                System.out.println(false);         
            else
                map2.put(t.charAt(i),s.charAt(i));
            

        }

        String ans="";
        for(int i=0;i<s.length();i++){            
            ans=ans+map1.get(s.charAt(i));
        }

        System.out.println(ans.equals(t));
        
    }
}
