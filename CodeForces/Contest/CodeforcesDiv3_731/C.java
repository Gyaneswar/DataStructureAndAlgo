import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;
import java.util.*;
public class C {
    public static void main(String[] args) {
        FastReader sc=new FastReader();

        int t=sc.nextInt();

        while(t>0){
            int k=sc.nextInt();
            int n=sc.nextInt();
            int m=sc.nextInt();

            int poly[]=new int[n];
            int mono[]=new int[m];
            for(int i=0;i<n;i++){
                poly[i]=sc.nextInt();
            }
            for(int i=0;i<m;i++){
                mono[i]=sc.nextInt();
            }

            int i=0;
            int j=0;
            int ans[]=new int[n+m];
            boolean flag=false;
            while(i<n && i<m){
                int po=poly[i];
                int mo=mono[i];

                if(po==0 || mo==0){
                    if(po==0 && mo==0){
                        k=k+2;
                        ans[j]=0;
                        j++;
                        ans[j]=0;
                    }else{
                        ans[j]=0;
                        k=k+1;
                        j++;
                        ans[j]=po!=0?po:mo;                    
                    }
                }else{
                    ans[j]=po;
                    j++;
                    ans[j]=mo;
                }

                if(po>k || mo>k){
                    flag=true;
                    //System.out.println(-1);
                    break;
                }   
                i++;
                j++;
            }
            if(!flag){

                
            if(i<n){
                while(i<n){
                    int temp=poly[i];
                    if(temp==0){
                        k=k+1;
                    }                        
                    else if(temp>k){
                        flag=true;
                        break;
                    }                        
                    ans[j]=poly[i];
                    j++;
                    i++;
                }
            }
            else if(i<m){
                while(i<m){
                int temp=mono[i];
                    if(temp==0)
                        k=k+1;
                    else if(temp>k){
                        flag=true;
                        break;
                    }                        
                    ans[j]=mono[i];
                    j++;
                    i++;
                }
            }
        }

        if(flag){
            System.out.print(-1);
        }else{
            for(int l=0;l<n+m;l++){
                System.out.print(ans[l]);
                if(l!=n+m-1)
                System.out.print(" ");
            }
        }

        System.out.println();


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
