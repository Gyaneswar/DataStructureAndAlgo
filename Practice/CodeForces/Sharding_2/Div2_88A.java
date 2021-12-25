package Practice.CodeForces.Sharding_2;
import java.util.*;
public class Div2_88A {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            int m=sc.nextInt();
            int x=sc.nextInt();
            int y=sc.nextInt();
            String []arr=new String[n];
            for(int i=0;i<n;i++)
                arr[i]=sc.next();

            int ans=0;
            for(int i=0;i<n;i++){
                for(int j=0;j<m;j++){
                    if(j+1<m && arr[i].charAt(j)=='.' && arr[i].charAt(j+1)=='.' && (x*2)>=y ){
                        ans+=y;
                        j++;
                    }else if(arr[i].charAt(j)=='.'){
                        ans+=x;
                    }
                }
            }

            System.out.println(ans);
        }
    }
}
