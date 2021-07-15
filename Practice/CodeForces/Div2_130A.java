import java.util.*;

public class Div2_130A {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        int n=s.length();
        char ch[]=s.toCharArray();
        for(int i=0;i<n;i++){
            if((i+2)<n && ch[i]=='W' && ch[i+1]=='U' && ch[i+2]=='B'){
                ch[i]='#';
                ch[i+1]='#';
                ch[i+2]='#';
                i=i+2;
            }
        }

        char prev=ch[0];
        //System.out.println(Arrays.toString(ch));
        for(int i=0;i<n;i++){
            if(ch[i]!='#'){
                System.out.print(ch[i]);
            }else if(prev!='#'){
                System.out.print(" ");
            }
            prev=ch[i];
        }
        System.out.println();
    }    
}
