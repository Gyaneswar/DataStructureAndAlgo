import java.util.*;
public class Div2_95A {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.next();        
        if(s.toUpperCase().equals(s)) System.out.println(s.toLowerCase());
        else if((s.toLowerCase().equals(s)) && (s.length()==1)) System.out.println(s.toUpperCase());
        else if(s.toLowerCase().equals(s)) System.out.println(s);        
        else if(s.charAt(0)>=65 && s.charAt(0)<=90) System.out.println(s);
        else {
            boolean flag=true;
            for(int i=1;i<s.length();i++){
                if(s.charAt(i)>=97){flag=false; break;}
            }

            if(flag){                
                StringBuilder str=new StringBuilder(s.toLowerCase());
                str.replace(0, 1, Character.toString( (char)((int)(s.charAt(0)-32))));
                System.out.println(str.toString());
            }else System.out.println(s);
        }
    }
}
