package AugWeek2;
import java.util.*;
public class RankTransformMatrix {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        int arr[][]=new int[n][m];
        for(int i=0;i<n;i++)
            for(int j=0;j<m;j++) arr[i][j]=sc.nextInt();
        int ans[][]=matrixRankTransform(arr);

        for(int i=0;i<n;i++) System.out.println(ans[i].toString());
    }

    public static int[][] matrixRankTransform(int[][] matrix) {
        
    }
    
}
