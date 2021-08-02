import java.util.*;
public class Div2_77A {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.next();

        int count=1;
        boolean flag=false;
        for(int i=0;i<s.length()-1;i++){
            if(s.charAt(i)==s.charAt(i+1)){
                count++;
                if(count>=7){
                    flag=true;
                    break;
                }
                
            }else{
                count=1;
            }
        }
        System.out.println(flag?"YES":"NO");
    }    
}
