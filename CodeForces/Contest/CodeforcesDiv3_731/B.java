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
            String str=sc.next();

            int n=str.length();
            int index=-1;
            for(int i=0;i<n;i++){
                if(str.charAt(i)=='a'){
                    index=i;
                    break;
                }                
            }

            boolean flag=false;
            if(index==-1){
                System.out.println("NO");
            }else if(n==1){
                if(str.charAt(index)=='a')
                System.out.println("YES");
                else
                System.out.println("NO");
            }   
            else{            
            String ans="";
            int c='a';
            int n1=n-1;
            int left=index;
            int right=index;
            while(n1>0){
                char ch=(char)((int)c+1);
                c=c+1;
                if(right+1!=n && str.charAt(right+1)==ch) {
                    right=right+1;
                    n1--;
                }
                else if(left-1>=0 && str.charAt(left-1)==ch){
                    left=left-1;
                    n1--;
                }
                else{
                    flag=true;
                    break;
                }
            }
            if(!flag)
            System.out.println("YES");
            else
            System.out.println("NO");
            
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
