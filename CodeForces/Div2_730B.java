import java.util.*;
public class Div2_730B {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        
        while(t>0){
            int n=sc.nextInt();
            int sum=0;            
            int arr[]=new int[n];
            for(int i=0;i<n;i++){
                arr[i]=sc.nextInt();
                sum=sum+arr[i];                
            }            
            
            sum=sum%n;
            int zeros=n-sum;
            int ones=sum;

            int total=zeros*ones;
            

            System.out.println(total);
            t--;
        }
    }
}
