import java.util.*;
public class Div2_728B {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int t=sc.nextInt();
        while(t>0){
            int n=sc.nextInt();
            int arr[]=new int[n+1];

            for(int i=1;i<=n;i++){
                arr[i]=sc.nextInt();
            }

            int count=0;

            for(int i=1;i<=n;i++){
                for(int j=arr[i]-i;j<=n && j!=i;j=j+arr[i]){

                    if((i+j)==arr[i]*arr[j])
                        count++;
                }
            }

            System.out.println(count);

            t--;
        }
    }
}
