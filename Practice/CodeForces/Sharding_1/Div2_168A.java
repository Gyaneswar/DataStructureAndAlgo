import java.util.*;
public class Div2_168A {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int arr[][]=new int[3][3];

        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                int temp=sc.nextInt();
                if(temp%2==0)
                    arr[i][j]=0;
                else
                    arr[i][j]=1;
            }                
        }
        int ans[][]=new int[3][3];
        int val=1;
        Arrays.fill(ans[0], val);
        Arrays.fill(ans[1], val);
        Arrays.fill(ans[2], val);

        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){

                if(arr[i][j]==1){
                    ans[i][j]=ans[i][j]==1?0:1;
                if(j-1>=0)
                    ans[i][j-1]=ans[i][j-1]==1?0:1;
                if(j+1<3)
                    ans[i][j+1]=ans[i][j+1]==1?0:1;
                if(i-1>=0)
                    ans[i-1][j]=ans[i-1][j]==1?0:1;
                if(i+1<3)
                    ans[i+1][j]=ans[i+1][j]==1?0:1;
                }
            }
        }

        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                System.out.print(ans[i][j]);
            }
            System.out.println();
        }


    }
}
