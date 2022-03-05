//package SepWeek4;
import java.util.*;
public class q1BotBruteForce {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        //List<String> arr=new LinkedList<>();
        //HashSet<String> set=new HashSet<>();
        String arr[]=new String[n];
        for(int i=0;i<n;i++) {
            arr[i]=sc.next();
            
        }
        
        int ans=findMaxLength(arr,"",0);
        System.out.println(ans);
        System.out.println(max);

    }

    static int max=Integer.MIN_VALUE;
    public static int findMaxLength(String str[],String res,int count){
        int arr[]=new int[26];
        for(int i=0;i<res.length();i++){
            char c=res.charAt(i);
            int index=(int)c-97;
            arr[index]++;
            if(arr[index]>1) return -1;
            
        }
        if(res.length()>max) max=res.length();
        if(count==str.length) return res.length();

        
        for(int i=0;i<str.length;i++){            
            if(str[i].equals("-1")) continue;
            String e=str[i];
            str[i]="-1";
            int val=findMaxLength(str, e+res,count+1);
            if(val>max) max=val;
            str[i]=e;
        }
        return max;
    }
}
