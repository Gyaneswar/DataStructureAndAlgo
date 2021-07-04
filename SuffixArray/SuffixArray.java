import java.util.*;
public class SuffixArray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        String s=sc.next();

        String arr[]=new String[s.length()+1];
        arr[s.length()]="";
        
        for(int i=0;i<s.length();i++){
            arr[i]=s.substring(i, s.length());
        }        

        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
