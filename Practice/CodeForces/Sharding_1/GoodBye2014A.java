import java.util.*;
public class GoodBye2014A {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int n=sc.nextInt();
        int k=sc.nextInt();
        int arr[]=new int[n-1]; for(int i=0;i<n-1;i++) arr[i]=sc.nextInt();

        boolean flag=false;
        for(int i=0;;){

            if((i+1)==k){
                flag=true;
                break;
            }

            if(i<n-1)
            i=arr[i]+i;
            else break;
        }
        if(flag) System.out.println("YES");
        else System.out.println("NO");
    }
}
