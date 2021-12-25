package Practice.CodeForces.Sharding_2;
import java.util.*;

public class Div2_LATOKENB {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            long arr[] = new long[n];
            long ans = 0;
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextLong();
            }
            if (n == 1)
                System.out.println(arr[0]);
            else {
                long count = 0;
                if (arr[0] > arr[1]) {
                    long temp = arr[0] - arr[1];
                    count += temp;
                    arr[0] = arr[0] - temp;
                }
                if (arr[n - 1] > arr[n - 2]) {
                    long temp = arr[n - 1] - arr[n - 2];
                    count += temp;
                    arr[n - 1] = arr[n - 1] - temp;
                }
                for (int i = 1; i < n - 1; i++) {
                    if (arr[i] > arr[i - 1] && arr[i] > arr[i + 1]) {
                        if (arr[i - 1] > arr[i + 1]) {
                            long temp = arr[i] - arr[i - 1];
                            arr[i] = arr[i] - temp;
                            count += temp;
                        } else {
                            long temp = arr[i] - arr[i + 1];
                            arr[i] = arr[i] - temp;
                            count += temp;
                        }
                    }
                }
                // System.out.println(Arrays.toString(arr));

                ans = ans + arr[0];
                for (int i = 1; i < n; i++) {
                    ans += Math.abs(arr[i] - arr[i - 1]);
                }
                ans += arr[n - 1];

                // System.out.println(ans);
                System.out.println(ans + count);
            }
        }
    }
}