//https://codeforces.com/problemset/problem/1514/A
import java.util.*;
public class CodeForces800_3 {
    static Scanner sc;
    public static void main(String[] args) {
        sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t>0){                       
            System.out.println(Process());
            t--;
        }
    }

    public static String Process(){
        int n=sc.nextInt();
        int arr[]=new int[n];

        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();            
        }

        for(int i=0;i<n;i++){
            double temp=Math.sqrt(arr[i]);
            if(temp-Math.floor(temp)!=0)
                return "YES";
        }

        return "NO";
    }
}
