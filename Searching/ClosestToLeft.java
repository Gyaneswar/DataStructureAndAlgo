import java.util.*;
public class ClosestToLeft {
public static void main(String[] args) {
    
    Scanner sc=new Scanner(System.in);

    int n=sc.nextInt();
    int k=sc.nextInt();

    int arr[]=new int[n];
    for(int i=0;i<n;i++)
        arr[i]=sc.nextInt();

    int query[]=new int[k];
    for(int i=0;i<k;i++)
        query[i]=sc.nextInt();
    

    for(int i=0;i<k;i++)
        System.out.println(binarySearch(arr,-1,n,query[i]));

}
public static int binarySearch(int arr[],int l,int r,int item){    
    while(r>l+1){
    int mid=(l+r)/2;
    if(arr[mid]<=item){
        l=mid;
    }else{
        r=mid;
    }
    }
    return l+1;
}
}
