import java.util.*;
public class Div3_719C {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            int arr[][]=new int[n][n];
            int fVal=1;
            int rVal=n*n;
            int i=0;
            int j=0;            
            if(n==1) System.out.println(1);
            else if(n==2) System.out.println(-1);
            else {
                int currVal=fVal;
                while(i<n){
                    while(j<n){
                        arr[i][j]=currVal;                        
                        if(currVal==fVal){
                            fVal++;
                            currVal=rVal;
                        }else{
                            rVal--;
                            currVal=fVal;
                        }
                        j++;
                    }
                    i++;
                    j=0;
                }
                Swap(arr);
                for(int k=0;k<n;k++){
                    for(int z=0;z<n;z++){
                        System.out.print(arr[k][z]+" ");
                    }
                    System.out.println();
                }
            }            
        }
    }
    public static void Swap(int arr[][]){
        int temp=arr[0][0];
        arr[0][0]=arr[arr.length-1][arr.length-1];
        arr[arr.length-1][arr.length-1]=temp;
    }
}
