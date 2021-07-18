import java.util.Arrays;
import java.util.Scanner;

public class GcdRangeQuery {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.print("Enter the size of the List : ");
        int n=sc.nextInt();
        int arr[]=new int[n];
        System.out.print("Enter the indiviual elements : ");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }

        int tree[]=new int[4*n];
        ConstructST(arr,tree,0,n-1,0);        
        System.out.println(Arrays.toString(tree));
        System.out.println("Enter the range query indexes : ");
        int qs=sc.nextInt();
        int qe=sc.nextInt();

    }

    public static int ConstructST(int arr[],int tree[],int start,int end,int index){

        if(start==end){
            tree[index]=arr[start];
            return tree[index];
        }

        int mid=(start+end)/2;
        tree[index]=Gcd(ConstructST(arr, tree, start, mid, (index*2)+1),ConstructST(arr, tree, mid+1, end, (index*2)+2));
        return tree[index];
    }

    public static int GetGcd(int tree[],int qs,int qe,int start,int end,int index){
        if(qs<start && qe<end){

            return tree[start];
            
        }


        int mid=(start+end)/2;
        return Gcd(GetGcd(tree, qs, qe, start, mid, (index*2)+1),GetGcd(tree, qs, qe, mid+1, end, (index*2)+2));

    }

    public static int Gcd(int a,int b){
        if(b==0) return a;

        return Gcd(b, a%b);
    }



}
