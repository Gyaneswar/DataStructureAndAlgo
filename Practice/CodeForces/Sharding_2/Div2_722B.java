package Practice.CodeForces.Sharding_2;
import java.util.*;

public class Div2_722B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int ans = 0;
            int zero = 0;
            long lowPos = Integer.MAX_VALUE;
            long highneg=Integer.MIN_VALUE;
            long arr[] = new long[n];
            for (int i = 0; i < n; i++) {
                long temp = sc.nextLong();
                arr[i] = temp;
                if (temp < 0){
                    if(temp>highneg) highneg=temp;
                    ans++;
                }                    
                else if (temp == 0) {
                    ans++;
                    zero++;
                } else {
                    if (temp < lowPos)
                        lowPos = temp;
                }
            }

            Arrays.sort(arr);
            if (zero <= 1) {
                long highdiff = Integer.MAX_VALUE;
                if (n >= 2 && arr[0] < 0 && arr[1] < 0) {
                    for(int i=1;i<n;i++){
                        if(arr[i]<0 && arr[i-1]<0){
                            long diff=Math.abs(arr[i]-arr[i-1]);
                            if(diff<highdiff) highdiff=diff;
                        } else break;                            
                    }
                }else if(n >= 2 && arr[0] < 0 && arr[1] > 0){
                    highdiff = Math.abs(arr[0] - arr[1]);
                }
                if (lowPos != Integer.MAX_VALUE && highdiff >= lowPos && (zero==0))
                    ans++;
                if (lowPos != Integer.MAX_VALUE && highdiff >= lowPos && (zero==1 && Math.abs(highneg-0)>=lowPos))
                    ans++;
            }            

            if(ans==0) ans=1;
            System.out.println(ans);
        }
    }
}
