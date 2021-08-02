import java.util.*;
public class LongestSubstring {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        int n=s.length();
        int mem[]=new int[256];
        int count=0;                
        int ans[]=new int[n];               
        int start=0;
        for(int k=0;k<n;k++){
            if(mem[s.charAt(k)]!=0){
                int index=mem[s.charAt(k)];
                if(index>start)
                    start=index;
                mem[s.charAt(k)]=k+1;
                count=k-start+1;
                ans[k]=count;
            }else{
                mem[s.charAt(k)]=k+1;
                count++;
                ans[k]=count;
            }            
        }

        int maxCount=Arrays.stream(ans).max().getAsInt();

        System.out.println(maxCount);
    }
}
