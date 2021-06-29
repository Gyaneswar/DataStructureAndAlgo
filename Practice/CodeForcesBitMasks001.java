import java.util.Scanner;

//https://codeforces.com/problemset/problem/1421/A
public class CodeForcesBitMasks001 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int t=sc.nextInt();

        while(t>0){
            int a=sc.nextInt();
            int b=sc.nextInt();

            int and=a & b;

            int res1=a ^ and;
            int res2 = b ^ and;

            System.out.println(res1+res2);

            
            t--;
        }
    }
}