import java.util.*;
//https://codeforces.com/problemset/problem/4/A
public class Round4 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int n=sc.nextInt();
        if(n%2!=0 || n==2)
            System.out.println("NO");
        else{            
            n=n-2;
            System.out.println(n%2==0?"YES":"NO");
        }        
    }
}
