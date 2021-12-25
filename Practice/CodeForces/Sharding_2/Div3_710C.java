package Practice.CodeForces.Sharding_2;
import java.util.*;
public class Div3_710C {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            StringBuilder s1=new StringBuilder(sc.next());
            int n=s1.length();            
            StringBuilder s2=new StringBuilder(sc.next());
            int m=s2.length();
            int diff=Compare(s1,s2);
            if(diff==0) System.out.println(0);
            else {                   
                while(diff!=0){
                    n=s1.length();
                    m=s2.length();                    
                    if(diff>0){
                        int front=s1.charAt(0)-96;
                        int rear=s1.charAt(s1.length()-1)-96;
                        if(diff==front){
                            s1.delete(0, 1);
                        }else if(diff==rear){
                            s1.delete(n-1,n);
                        }else if(front > rear && front>diff){
                            s1.delete(0, 1);
                        }else if(rear > front && rear>diff){
                            s1.delete(n-1,n);
                        }
                    }else{
                        int front=s2.charAt(0)-97;
                        int rear=s2.charAt(s2.length()-1)-97;
                        if(diff==front){
                            s2.delete(0, 1);
                        }else if(diff==rear){
                            s2.delete(m-1,m);
                        }else if(front > rear && front>diff){
                            s2.delete(0, 1);
                        }else if(rear > front && rear>diff){
                            s2.delete(m-1,m);
                        }
                    }
                }
                System.out.println(s1.toString()+"--"+s2.toString());
            }
        }
    }

    public static int Compare(StringBuilder s){
        int a=0;        
        for(int i=0;i<s.length();i++) a+=s.charAt(i);        

        return a;
    }
}
