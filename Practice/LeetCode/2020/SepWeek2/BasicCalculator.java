package SepWeek2;
import java.util.*;
public class BasicCalculator {
    public static void main(String[] args) {
        int ans=calculate("- (3 + (4 + 5))");
        System.out.println(ans);
    }   
    
    public static int calculate(String what) {
        String s="";
        StringBuilder what1=new StringBuilder();
        for(int i=0;i<what.length();i++){
            if(what.charAt(i)!=' ') what1.append(what.charAt(i));
        }
        s=what1.toString();
        System.out.println(s);
        
        Stack<String> st=new Stack<>();        
        int res=0;
        int n=s.length();
        int total=0;
        for(int i=0;i<s.length();i++){
            String curr=Character.toString(s.charAt(i));
            int innerTotal=0;
            if(curr.equals(")")){
                               
                int first=0;
                while(!st.isEmpty()){                                        
                    String c=st.pop();
                    System.out.println(c);
                    if(c.equals("+")){ innerTotal=innerTotal*1; continue;}
                    else if(c.equals("-")){ innerTotal=innerTotal*-1;continue;}
                    
                    if(c.equals("(")) break;
                    first=Integer.parseInt(c);
                    innerTotal=innerTotal+first;
                }
                if(!st.isEmpty() && (st.peek().equals("+") || st.peek().equals("-")))
                {
                    String t=st.pop();
                    if(t.equals("-")) innerTotal=innerTotal*-1;
                }
                total=total+innerTotal;
            }
            else{                
                if(curr.equals("(")){
                    st.push(curr);                
                }else if(curr.equals("+") || curr.equals("-")){
                    if(s.charAt(i+1)!='('){

                    StringBuilder digit=new StringBuilder();
                    int k=0;
                    for(k=i+1;k<n;k++){
                        char temp=s.charAt(k);
                        if(temp=='(' || temp==')' || temp=='+' || temp=='-')
                            break;
                        digit.append(temp);                        
                    }
                    i=k-1;
                    digit.insert(0,curr);
                    st.push(digit.toString());
                    }else{
                        st.push(curr);
                    }
                }else{
                    StringBuilder digit=new StringBuilder();
                    int k=i;
                    for(k=i;k<n;k++){
                        char temp=s.charAt(k);
                        if(temp=='(' || temp==')' || temp=='+' || temp=='-')
                            break;
                        digit.append(temp);                        
                    }
                    i=k-1;
                    st.push(digit.toString());
                }
            }
        }
        while(!st.isEmpty()){
            String c=st.pop();
            if(c.equals("+")){ total=total*1; continue;}
            else if(c.equals("-")){ total=total*-1;continue;}
                    
            System.out.println(c);
            total=total+(Integer.parseInt(c));
        }
        return total;
    }
}
