import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;
public class B {
    public static void main(String[] args) {
        
        FastReader sc=new FastReader();
        int t=sc.nextInt();

        while(t>0){
            int n=sc.nextInt();
            int a=sc.nextInt();
            int b=sc.nextInt();
            String s=sc.next();
            if(b>=0){
                System.out.println(a*n + b*n);
            }else{                
                int k=1;
                for(int i=1;i<n;i++){
                    if(s.charAt(i)!=s.charAt(i-1)) k++;
                }
                k=k/2 + 1 ;
                System.out.println(a*n + k*b);
            }
            t--;    
        }











    }


    static class FastReader {
        BufferedReader br;
        StringTokenizer st;

        public FastReader() {
            br = new BufferedReader(new InputStreamReader(System.in));
        }

        String next() {
            while (st == null || !st.hasMoreElements()) {
                try {
                    st = new StringTokenizer(br.readLine());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }

        int nextInt() {
            return Integer.parseInt(next());
        }

        long nextLong() {
            return Long.parseLong(next());
        }

        double nextDouble() {
            return Double.parseDouble(next());
        }

        String nextLine() {
            String str = "";
            try {
                str = br.readLine();
            } catch (IOException e) {
                e.printStackTrace();
            }
            return str;
        }
    }
    
}
