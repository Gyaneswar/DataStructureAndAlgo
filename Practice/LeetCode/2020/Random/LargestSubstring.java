import java.util.*;
public class LargestSubstring {
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);

        String s=sc.next();
        int n=s.length();
        int max=0;
        int start=0;
        int actualStart=0;
        int actualEnd=0;
        HashMap<Character,Integer> map=new HashMap<>();
        int end=0;
        for(end=0;end<n;end++){            
            if(map.containsKey(s.charAt(end))){
                start=map.get(s.charAt(end))+1;
            }
            
            map.put(s.charAt(end), end);
            int temp=end-start+1;
            if(temp>=max){
                actualStart=start;
                actualEnd=end;
                max=temp;
            }
        }
        System.out.println(s.substring(actualStart, actualEnd+1));
        System.out.println(max);
    }
}
