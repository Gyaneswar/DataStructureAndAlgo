import java.util.*;
public class A{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        int arr[]=new int[1667];     
        fill(arr);
        while(t-->0){
            int n=sc.nextInt();
            int j=1;
            int i=1;
            while(j<=n){
                if(arr[i]!=-1){
                    j++;                   
                }
                i++;
            }
            System.out.println(arr[i-1]);
        }
    }

    public static void fill(int arr[]){        
        int i=1;        
        int j=1;
        arr[0]=-1;
        while(i<1667){            
            if(i%3==0 || i%10==3){
                arr[i]=-1;
            }else{
                arr[j]=i;
                j++;               
            }
            i++;
        }
    }
}