//https://codeforces.com/problemset/problem/1520/B
import java.util.*;
public class CodeForces800_4 {
    static Scanner sc;
    public static void main(String[] args) {
        sc=new Scanner(System.in);

        int t=sc.nextInt();

        while(t>0){
            Process();

            t--;
        }
    }

    public static void Process(){        
        int a=sc.nextInt();
        int att=a;
        int count=0;
        int at=a;
        int temp=0;
        while(at>0){
            at=at/10;
            temp=temp*10+1;
        }    
        int nextTemp=temp;
        while(nextTemp<=a && a!=0){
            nextTemp=nextTemp+temp;
            count++;
        }

        while(a>0){
            temp=a%10;              
            count=count+9;
            a=a/10;
        }    

        if(att==0)
        System.out.println(0);
        else
        System.out.println(count-9);
    }
}
