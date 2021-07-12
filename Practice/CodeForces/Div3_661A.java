import java.util.*;

public class Div3_661A {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int t=sc.nextInt();

        while(t>0){
            int n=sc.nextInt();
            int arr[]=new int[n];
            for(int i=0;i<n;i++){
                arr[i]=sc.nextInt();
            }
            Arrays.sort(arr);
            int count=0;
            for(int i=0;i<n-1;i++){
                if(arr[i+1]-arr[i]<=1){
                    arr[i]=-1;
                }else{
                    count++;
                }
            }

            if(count==0)
                System.out.println("YES");
            else
                System.out.println("NO");

            t--;
        }
    }
}
