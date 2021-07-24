import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;
public class A {
    public static void main(String[] args) {
        Solver ans=new Solver();
        ans.Solve();
    }
}


    class Solver{
        public void Solve(){
            FastReader sc=new FastReader();
            int t=sc.nextInt();
            while(t-->0){
                int n=sc.nextInt();
                int c1=0,c2=0;
                
                c2=n/3;
                c1=n-(2*c2);

                if(c1-c2==2){
                    c1=c1-2;
                    c2++;
                }

                System.out.println(c1+" "+c2);
                
            }
        }

        public void go(){

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
