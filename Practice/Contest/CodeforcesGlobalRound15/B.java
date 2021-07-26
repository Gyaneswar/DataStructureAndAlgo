import java.util.*;

public class B {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int t=sc.nextInt();

        while(t-->0){
            int n=sc.nextInt();
            
            int arr[]=new int[n];            
            int ranks[][]=new int[n][5];
            for(int i=0;i<n;i++){
                for(int j=0;j<5;j++){
                    ranks[i][j]=sc.nextInt();
                }
            }    
            
            if(n==1) System.out.println(1);
            else{
                int ans=0;
                int overallans=0;
                boolean flag=false;
                for(int i=0;i<n;i++){
                    overallans=0;
                    for(int j=0;j<n;j++){
                        if(j!=i){
                            ans=0;
                            for(int k=0;k<5;k++){
                                if(ranks[i][k]<ranks[j][k]){
                                    ans++;
                                }
                            }
                            if(ans>=3){
                                overallans++;
                            }
                        }
                    }
                    if(overallans==n-1){
                        flag=true;
                        System.out.println(i+1);
                    }
                    if(flag)
                        break;
                }

                if(!flag) System.out.println(-1);
            }
        }
    }
}
