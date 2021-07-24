import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.*;
public class C {
    public static void main(String[] args) {
        Solver1 ans=new Solver1();
        ans.Solve();
    }
}


    class Solver1{
        public void Solve(){
            FastReader sc=new FastReader();
            int t=sc.nextInt();
            while(t-->0){
                int n=sc.nextInt();
                int k=sc.nextInt();
                int arr[]=new int[n];
                int colors[]=new int[n];
                for(int i=0;i<n;i++) {arr[i]=sc.nextInt();}

                
                HashMap<Integer,Integer> map =new HashMap<>();
                for(int i=0;i<n;i++){
                    if(map.get(arr[i])==null){
                        map.put(arr[i], 1);
                        System.out.print(1+" ");
                    }
                    else {
                        int temp=map.get(arr[i]);
                        map.put(arr[i], temp+1);
                        if(temp+1<=k){
                            System.out.print(temp+1+" ");
                        }else{
                            System.out.print(0+" ");
                        }
                    }
                }

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
