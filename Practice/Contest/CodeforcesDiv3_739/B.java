import java.util.Scanner;

public class B {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            long a=sc.nextLong();
            long b=sc.nextLong();
            long c=sc.nextLong();

            if(a>b){
                long temp=a;
                a=b;
                b=temp;
            }
            long diff=Math.abs(a-b);
            long middle=1+diff;
            long last=middle+(diff-1);

            long ans=middle;
            if(c>middle) {                                                
                ans=c-diff;                
            }
            else if(c<middle) {
                ans=c+diff;
            }
            else if(c==middle) {
                ans=1;
            }
            
            if(diff==0) System.out.println(-1);
            else if(c>last || a>last || b>last) System.out.println(-1);
            else if(a<middle && b<middle) System.out.println(-1);
            else if(a>middle && b>middle) System.out.println(-1);
            else if(c>middle && ans>middle) System.out.println(-1);
            else if(c<middle && ans<middle) System.out.println(-1);
            else if((a!=1 && b==middle) || (a==middle && b!=1)) System.out.println(-1);
            else if(last%2==0 && ans!=a && ans!=b && ans<=last) System.out.println(ans);
            else System.out.println(-1);
        }
    }
    
}
