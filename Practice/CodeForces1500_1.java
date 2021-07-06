//https://codeforces.com/problemset/problem/1538/F
import java.util.*;
public class CodeForces1500_1{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int n=sc.nextInt();

        while(n>0){
            int l=sc.nextInt();
            int r=sc.nextInt();
            int countr=0;
            int countl=0;
            while(r>0){                               
                countr=countr+r;
                r/=10;
            }
            while(l>0){
                countl=countl+l;
                l=l/10;
            }

            System.out.println(countr-countl);

            n--;
        }
    }
}