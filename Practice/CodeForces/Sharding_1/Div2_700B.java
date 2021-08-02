import java.util.*;
public class Div2_700B {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t--!=0){
            int n=sc.nextInt();
            int A=sc.nextInt();
            int B=sc.nextInt();
            int[][] ab=new int[2][n];
            for(int i=0;i<n;i++){
                ab[0][i]=sc.nextInt();
            }
            for(int i=0;i<n;i++){
                ab[1][i]=sc.nextInt();
            }

            Arrays.sort(ab, (a, b) -> Integer.compare(a[0],b[0]));

            for(int i=0;i<n;i++){
                int a=ab[0][i];
                int b=ab[1][i];
                
                while(b!=0){
                    int c=

                }

            }
        }
    }
}
