import java.util.*;
public class FastSearch {
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
 
        int n=sc.nextInt();        
        int arr[]=new int[n];
        for(int k=0;k<n;k++){
            arr[k]=sc.nextInt();
        }
        int k=sc.nextInt();
        Arrays.sort(arr);
 
        for(int j=0;j<k;j++){
            int ld=sc.nextInt();
            int rd=sc.nextInt();
            int count=0;
            int lans=0;
            int rans=0;
            int l=-1;
            int r=n;
            while(r>l+1){
                int mid=(l+r)/2;                
                if(ld<=arr[mid]){
                    r=mid;
                }else{
                    l=mid;
                }
            }
            lans=l+1;
            l=-1;
            r=n;
            while(r>l+1){
                int mid=(l+r)/2;                
                if(rd<arr[mid]){
                    r=mid;
                }else{
                    l=mid;
                }
            }
            rans=r+1;
            System.out.println((rans-lans-1));
        }
        
    }
}