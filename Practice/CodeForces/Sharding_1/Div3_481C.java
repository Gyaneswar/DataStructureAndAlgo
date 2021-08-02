import java.util.*;
public class Div3_481C {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        long arr[]=new long[n];
        arr[0]=sc.nextLong();
        for(int i=1;i<n;i++) arr[i]=arr[i-1]+sc.nextLong();

        long rooms[]=new long[m];
        for(int i=0;i<m;i++) rooms[i]=sc.nextLong();

        for(int i=0;i<m;i++){            
            if(rooms[i]<=arr[0]){
                System.out.println(1+" "+rooms[i]);
            }
            else {
                int index=Search(arr,rooms[i]);
                System.out.println(index+1+" "+(rooms[i]-arr[index-1]));
            }
        }
    }

    public static int Search(long arr[],long target){
        int l=0;
        int r=arr.length-1;

        while(l+1<r){
            int mid=(l+r)/2;
            if(arr[mid]>=target) r=mid;
            else l=mid;
        }
        return (int)r;
    }
}
