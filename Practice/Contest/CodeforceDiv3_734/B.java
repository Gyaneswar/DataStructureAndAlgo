import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;
import java.util.StringTokenizer;
public class B {
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
                String s=sc.next();
                HashMap<Character,Integer> map=new  HashMap<>();
                int count=0;
                for(int i=0;i<s.length();i++){
                    if(map.get(s.charAt(i))==null)
                        map.put(s.charAt(i), 1);
                    else {
                        int temp=map.get(s.charAt(i));
                        map.put(s.charAt(i), temp+1);
                        if(temp+1>=3){
                            count++;
                        }
                    } 
                }

                if(count>1){
                    System.out.println((s.length()-count)/2);
                }else{                    
                    if(s.length()%2==0 && count==1)
                        System.out.println((s.length()-1)/2);
                    else if(s.length()%2==0)
                        System.out.println(s.length()/2);                                        
                    else if(s.length()%2!=0 && count==1)
                        System.out.println((s.length()-1)/2);
                    else
                        System.out.println((s.length())/2);
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
