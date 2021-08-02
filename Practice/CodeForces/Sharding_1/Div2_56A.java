import java.util.*;
public class Div2_56A {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();

        while(t>0){
            String s=sc.next();
            StringBuilder str=new StringBuilder(s);
            boolean flag=false;
            if(str.reverse().toString().equals(s)){
                int n=s.length();                
                char ch[]=s.toCharArray();
                    for(int i=0;i<n-1;i++){
                        if(ch[i]!=ch[i+1]){
                            char temp=ch[i];
                            ch[i]=ch[i+1];
                            ch[i+1]=temp;
                            flag=true;
                            break;
                        }
                    }
                    if(flag)
                    System.out.println(String.valueOf(ch));
                    else
                    System.out.println(-1);
            }else{
                System.out.println(s);
            }
            t--;
        }
    }
}
