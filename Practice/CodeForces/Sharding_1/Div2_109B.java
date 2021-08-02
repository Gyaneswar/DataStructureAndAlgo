import java.util.*;
public class Div2_109B {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int T=sc.nextInt();

        while(T-- > 0){
            int n=sc.nextInt();
            int arr[]=new int[n];
            for (int i=0;i<n;i++) {
                arr[i]=sc.nextInt();                    
            }
            int ans=0;
            boolean flag=true;

            for(int i=0;i<n-1;i++){
                if(arr[i]>arr[i+1]){
                    flag=false;
                    break;                    
                }
            }-

            if(flag) System.out.println(ans);
            else if(arr[0]-1==0 || arr[n-1]-1==n-1) System.out.println(1);
            else if(arr[0]-1==n-1 && arr[n-1]-1==0) System.out.println(3);
            else if(arr[0]-1==n-1 || arr[n-1]-1==0) System.out.println(2);
            else System.out.println(2);
            
            
            
        }
    }
}
