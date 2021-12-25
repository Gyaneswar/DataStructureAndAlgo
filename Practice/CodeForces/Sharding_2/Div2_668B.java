package Practice.CodeForces.Sharding_2;
import java.util.*;
public class Div2_668B {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            long arr[]=new long[n];
            long total=0;
            for(int i=0;i<n;i++) { arr[i]=sc.nextLong(); if(arr[i]>0) total+=arr[i];}
            long ans=0;
            long nsf=0;
            long remains=total*-1;
            for(int i=0;i<n;i++){ 
                if(remains==0) break;

                if(arr[i]>0){                    
                    long sum=arr[i]+remains;                    
                    if(sum>=0){ nsf=nsf-(arr[i]-sum); arr[i]=sum; }
                    else{ 
                        nsf=nsf-arr[i];
                        arr[i]=0; 
                    }

                }else{
                    nsf=nsf+arr[i];   
                    if(nsf<(total*-1)) nsf=total*-1;                 
                }
                remains=(total+nsf)*-1;
            }

            for(int i=0;i<n;i++) { if(arr[i]>0) ans+=arr[i]; }
            System.out.println(ans);
        }
        sc.close();
    }
    
}
