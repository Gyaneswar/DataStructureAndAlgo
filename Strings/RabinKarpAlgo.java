import java.util.*;
public class RabinKarpAlgo {
    public static void main(String[] args) {
        String str="ABCABABC";
        String pat="ABC";
        int n=str.length();
        int m=pat.length();                        

        int powValue=(int)Math.pow(m, m-1);

        int textHash=0;
        int patHash=0;
        for(int i=0;i<m;i++){
            textHash= textHash*m + (int)str.charAt(i);
            patHash= patHash*m + (int)pat.charAt(i);
        }

        for(int i=0;i<=n-m;i++){
            if(textHash==patHash) {
                boolean flag=true;
                for(int j=0;j<m;j++){
                    if(str.charAt(i+j)!=pat.charAt(j)){
                        flag=false;break;
                    }
                }
                if(flag) System.out.println(i+1);
            }
            else{
                textHash=m * (textHash-((int)str.charAt(i)*powValue)) + (int)str.charAt(i);
            }
        }
        

    }
}
