import java.util.*;
public class Div2_536C {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
       int n=sc.nextInt();
       int arr[]=new int[n];
       
       for(int i=0;i<n;i++){
           arr[i]=sc.nextInt();
       }
       Arrays.sort(arr); //O(n^2) kekwwwwwwwwwwwwwww

       long ans=0;
       for(int i=0;i<n/2;i++){
            ans = ans + (arr[i]+arr[n-i-1])* (arr[i]+arr[n-i-1]);
       }

       System.out.println(ans);
    }
}
