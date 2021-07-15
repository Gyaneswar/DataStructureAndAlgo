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
            int sum=sc.nextInt();
            int tempSum=1;
            
            int count=1;
            int number=1;
            while(tempSum<sum){
                
                number+=2;
                tempSum=tempSum+number;
                count++;
            }
            System.out.println(count);
            t--;
        }


    }

    // public static int Process(int number,int ans,int ressum,int totalsum){
    //     if(totalsum==ressum){
    //         return ans;
    //     }

    //     if(totalsum>ressum){
    //         return Integer.MAX_VALUE;
    //     }

    //     int temp2=totalsum+number+2;        
    //     int temp1=totalsum+number+1;
    //     return Math.min(Process(number+2, ans+1,ressum,temp2),Process(number + 1 , ans+1,ressum,temp1));
        

    // }

    









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
