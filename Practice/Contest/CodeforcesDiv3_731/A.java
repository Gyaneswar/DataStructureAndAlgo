import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;
public class A {
    public static void main(String[] args) {
        FastReader sc=new FastReader();  
        
        int t=sc.nextInt();
        while(t>0){
            int xa=sc.nextInt();
            int ya=sc.nextInt();

            int xb=sc.nextInt();
            int yb=sc.nextInt();
            
            int xf=sc.nextInt();
            int yf=sc.nextInt();


            if(xa==xb && xb==xf){
                if(ya>yf && yb>yf)
                    System.out.println((int)Math.abs(ya-yb));
                else if(ya<yf && yb<yf)
                    System.out.println((int)Math.abs(ya-yb));
                else                
                System.out.println((int)Math.abs(ya-yb)+2);
            }else if(ya==yb && yb==yf){
                if(xa>xf && xb>xf)
                    System.out.println((int)Math.abs(xa-xb));
                else if(xa<xf && xb<xf)
                    System.out.println((int)Math.abs(xa-xb));
                else
                System.out.println((int)Math.abs(xa-xb)+2);
            }else{
                int xsteps=Math.abs(xb-xa);
                int ysteps=Math.abs(yb-ya);

                System.out.println(xsteps+ysteps);
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
