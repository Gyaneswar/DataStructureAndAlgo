import java.util.*;
public class Div2_106B {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            String s=sc.next();            
            System.out.println(Sort(s)?"YES":"NO");
        }
    }

    public static boolean Sort(String s){        
        int i=-1;
        int j=-1;
        for(int k=0;k<=s.length()-2;k++){
            if(s.substring(k,k+2).equals("11")){
                i=k;
                break;
            }            
        }
        
        if(i!=-1)
        for(int k=i;k<=s.length()-2;k++){
            if(s.substring(k,k+2).equals("00")){                
                j=k;
                break;
            }
        }
        return (i!=-1 && j!=-1 && i<j)?false:true;
    }
}
