//https://codeforces.com/contest/1535/problem/B
import java.util.*;
public class CodeForces900_1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int t=sc.nextInt();

        while(t>0){
            int n=sc.nextInt();
            int arr[]=new int[n];
            int start=0;
            int end=n-1;
            for(int i=0;i<n;i++){
                int temp=sc.nextInt();
                if(temp%2==0){
                    arr[start]=temp;
                    start++;
                }                   
                else{
                    arr[end]=temp;
                    end--;
                } 
            }
            start=start-1;
            end=end+1;
            int count=0;
            for(int i=0;i<=start;i++){
                count=count+(n-(i+1));
            }

            
            for(int i=end;i<n-1;i++){
                for(int j=i+1;j<n;j++){
                    if(arr[i]==arr[j] && arr[i]!=1)
                        count++;
                    else if(GCD(arr[i],arr[j])>1)
                        count++;
                }
            }

            System.out.println(count);
            t--;
        }
    }
    public static int GCD(int a,int b){
        if(b==0)
            return a;
        
        return GCD(b,a%b);
    }
}