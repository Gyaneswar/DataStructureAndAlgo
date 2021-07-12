//https://codeforces.com/problemset/problem/1527/A
import java.util.Scanner;

public class CodeForces800_1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();

        while(n>0){
            int x=sc.nextInt();
            
            int z=(int) (Math.log(x) / Math.log(2));
            System.out.println((int)Math.pow(2, z)-1);

            n--;
        }
    }
    
}

