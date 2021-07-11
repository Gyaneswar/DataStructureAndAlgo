import java.util.*;

public class Div2_253A {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        String s=sc.nextLine();
        HashSet<Character> set=new HashSet<>();
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            int value=(int)c;

            if(value>=97 && value<=122){
                set.add(c);
            }
        }
        System.out.println(set.size());
    }
}
