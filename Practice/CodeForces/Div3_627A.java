import java.util.*;
public class Div3_627A {
   public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       int t=sc.nextInt();

       while(t-->0){
           int n=sc.nextInt();
           int arr[]=new int[n];

           for(int i=0;i<n;i++){
                arr[i]=sc.nextInt();
           }
           int parity=arr[0]%2==0 ? 0:1;
           boolean flag=false;
           for(int i=1;i<n;i++){
               int tempPar=-1;
                if(arr[i]%2==0) tempPar=0;
                else tempPar=1;

                if(tempPar!=parity){
                    flag=true;
                    break;
                }
           }
           System.out.println(flag ? "NO":"YES");
       }
   } 
}
