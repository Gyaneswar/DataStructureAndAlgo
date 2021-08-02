import java.util.*;
public class Div2_671D1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++) arr[i]=sc.nextInt();        

        Arrays.sort(arr);

        int ans[]=new int[n];
        int i=0,j=n-1,k=0;        
        while(k<n && i<=j){
            ans[k]=arr[j];
            j--;
            k++;
            if(k<n){
                ans[k]=arr[i];
                i++;
                k++;
            }
        }

        int count=0;
        for(i=1;i<n-1;i++){
            if(ans[i]<ans[i-1] && ans[i]<ans[i+1]){
                count++;
            }
        }
        System.out.println(count);
        for(i=0;i<n;i++){
            System.out.print(ans[i]+" ");
        }   
    }
}
