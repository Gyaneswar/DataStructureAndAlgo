import java.util.*;
public class Global7A {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        
        while(t-->0){
        int n=sc.nextInt();
        if(n==1) System.out.println(-1);
        else{
            System.out.print(2);
            for(int i=0;i<n-1;i++) System.out.print(3);
            System.out.println();
        }   
    }
    }
}
