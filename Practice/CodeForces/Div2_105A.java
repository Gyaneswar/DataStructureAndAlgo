import java.util.*;
public class Div2_105A {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int T=sc.nextInt();
        while(T--!=0){
        String s=sc.next();
        int a=0,b=0,c=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='A') a++;
            else if(s.charAt(i)=='B') b++;
            else c++;
        }
        if(s.charAt(0) == s.charAt(s.length()-1)) System.out.println("NO");
        else if(s.charAt(0) != s.charAt(s.length()-1)) {
            char opening=' ';
            int open=0,close=0;
            char ending =' ';
            if(s.charAt(0)=='A'){open=a;opening='A';}                
            else if(s.charAt(0)=='B'){open=b;opening='B';}                
            else if(s.charAt(0)=='C'){open=c;opening='C';}                
            if(s.charAt(s.length()-1)=='A'){close =a;ending='A';}                
            else if(s.charAt(s.length()-1)=='B'){close=b;ending='B';}                
            else if(s.charAt(s.length()-1)=='C'){close=c;ending='C';}                
            char third=open<close?'(':')';
            Stack<Character> stac=new Stack<Character>();
            stac.push('(');
            int i=1;
            boolean flag=false;
            while(i<s.length()){
                if(s.charAt(i)==opening){
                    stac.push('(');
                }
                else if(s.charAt(i)==ending){
                    if(stac.isEmpty()){
                        flag=true;
                        break;
                    }
                    stac.pop();
                }else{
                    if(third==')') {                        
                        if(stac.isEmpty()){
                            flag=true;
                            break;
                        }
                        stac.pop();
                    }                    
                    else stac.push('(');
                }
                i++;
            }
            if(flag) System.out.println("NO");
            else if(stac.isEmpty()) System.out.println("YES");
            else System.out.println("NO"); 
        }
        else if(a+b==c || a+c==b || b+c==a) System.out.println("YES");
        else System.out.println("NO");
    }
    }
}
