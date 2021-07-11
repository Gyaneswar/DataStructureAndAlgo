import java.util.*;
public class Div2_164A {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int n=sc.nextInt();

        int arr[][]=new int[n][2];        
        for(int i=0;i<n;i++){
            for(int j=0;j<2;j++){
                arr[i][j]=sc.nextInt();
            }
        }

        int ans=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(i!=j){
                    if(arr[i][1]==arr[j][0])
                        ans++;
                }
            }
        }
        System.out.println(ans);
    }
}