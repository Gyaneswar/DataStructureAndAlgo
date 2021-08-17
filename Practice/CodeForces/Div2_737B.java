import java.util.*;

public class Div2_737B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            long k = sc.nextLong();
            long count = 0;
            long arr[] = new long[n];
            for (int i = 0; i < n; i++)
                arr[i] = sc.nextLong();
            if(n==0) System.out.println("No");
            else if (k == n) {
                System.out.println("Yes");
            } else {
                long sortedArr[] = new long[n];
                for (int i = 0; i < n; i++)
                    sortedArr[i] = arr[i];
                Arrays.sort(sortedArr);
                HashMap<Long, Long> map = new HashMap<>();
                for (int i = 0; i < n - 1; i++) {
                    map.put(sortedArr[i], sortedArr[i + 1]);
                }
                map.put(sortedArr[n - 1], Long.MIN_VALUE);
                boolean flag=false;
                for (int i = 0; i < n - 1; i++) {
                    flag=false;
                    if (arr[i] > arr[i + 1])
                        count++;
                    else {
                        long next = map.get(arr[i]);
                        if (arr[i + 1] != next){
                            count++;
                            flag=true;
                        }                            
                    }
                }                
                if ((flag && (arr[n - 1] == sortedArr[n - 1]))||(count!=0 && !flag) || (arr[n - 1] != sortedArr[n - 1]))
                    count++;
                                

                //System.out.println(count);
                if (count <= k)
                    System.out.println("Yes");
                else
                    System.out.println("No");
            }
        }
    }
}
