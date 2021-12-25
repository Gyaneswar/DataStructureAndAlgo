package Practice.CodeForces.Sharding_2;
import java.util.*;
public class GlobalRound12 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            int k=sc.nextInt();
            int arr[][]=new int[n][2];
            for(int i=0;i<n;i++){
                arr[i][0]=sc.nextInt();
                arr[i][1]=sc.nextInt();
            }


            boolean flag=false,ansFlag=false;
            for(int i=0;i<n;i++){
                int dist=0;
                for(int j=0;j<n;j++){
                    if(j!=i){
                        dist=Math.abs(arr[i][0]-arr[j][0])+Math.abs(arr[i][1]-arr[j][1]);
                        if(dist>k){
                            flag=true;
                            break;
                        }
                    }
                }
                if(!flag) {ansFlag=true; break;}
                else flag=false;
            }
            if(!ansFlag) System.out.println(-1);
            else System.out.println(1);
        }
    }
}
