import java.util.*;

public class Div2_295A {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int n=sc.nextInt();
        String s=sc.next();
        s=s.toLowerCase();

        if(n<26)
            System.out.println("NO");
        else{
            HashSet<Character> set=new HashSet<>();
            for(int i=0;i<n;i++){
                set.add(s.charAt(i));
            }

            int a=97;            
            for(int i=0;i<26;i++){
                if(set.add((char)(a+i))){
                    System.out.println("NO");
                    break;
                }
                if(i==25)
                System.out.println("YES");
            }
        }

    }
}
