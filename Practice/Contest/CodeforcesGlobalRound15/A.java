import java.util.*;
public class A {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            String s=sc.next();
            char ch[]=s.toCharArray();
            char chans[]=s.toCharArray();
            Arrays.sort(chans);
            int ans=0;
            for(int i=0;i<n;i++){
                if(ch[i]!=chans[i])
                    ans++;
            }
            
            System.out.println(ans);
        }
    }
}
