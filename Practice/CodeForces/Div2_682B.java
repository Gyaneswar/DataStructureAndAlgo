import java.util.*;
public class Div2_682B {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            int arr[]=new int[n];
            for(int i=0;i<n;i++) arr[i]=sc.nextInt();
            Arrays.sort(arr); 
            boolean flag=false;
            for(int i=1;i<n;i++){
                if(arr[i]==arr[i-1]){flag=true; break;}
            }
            if(flag) System.out.println("YES");
            else System.out.println("NO");
        }
    }
}
