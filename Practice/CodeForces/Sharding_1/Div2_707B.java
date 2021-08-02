import java.util.*;
public class Div2_707B {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int t=sc.nextInt();
        while(t>0){
            int n=sc.nextInt();
            int arr[]=new int[n];
            for(int i=0;i<n;i++){
                arr[i]=sc.nextInt();
            }

            int ans[]=new int[n];
            for(int i=n-1;i>=0;i--){
                int temp=arr[i];                                          
                while(temp>0 && i>=0){
                    if(arr[i]>temp)
                        temp=arr[i];
                    ans[i]=1;
                    temp--; 
                    if(temp!=0)
                        i--;
                }                               
            }

            for(int i=0;i<n;i++)
            System.out.print(ans[i]+" ");

            System.out.println();
            t--;
        }
    }
}
