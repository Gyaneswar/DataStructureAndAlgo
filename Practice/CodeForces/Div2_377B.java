import java.util.*;
public class Div2_377B {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int n=sc.nextInt();
        int k=sc.nextInt();
        int arr[]=new int[n];        
        for(int i=0;i<n;i++) arr[i]=sc.nextInt();        

        int ans=0;
        for(int i=0;i<n-1;i++){
            int required=0;
            if((arr[i]+arr[i+1])<k)
                required=k-(arr[i]+arr[i+1]);
            else continue;
            ans=ans+required;
            arr[i+1]=arr[i+1]+required;
        }

        System.out.println(ans);
        for(int i=0;i<n;i++) System.out.print(arr[i]+" ");
    }
}
