import java.util.*;
public class Div2_321A {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int n=sc.nextInt();

        int arr[]=new int[n];
        for(int i=0;i<n;i++)
            arr[i]=sc.nextInt();
        int count=0;
        int maxCount=0;
        for(int i=0;i<n-1;i++){
            if(arr[i]<=arr[i+1]){
                count++;
            }else{
                count=0;
            }

            if(count>maxCount)
                maxCount=count;
        }
        System.out.println(maxCount+1);
    }
}
