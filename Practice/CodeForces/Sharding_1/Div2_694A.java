import java.util.*;
public class Div2_694A {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            int x=sc.nextInt();
            long arr[]=new long[n];
            long max=0;
            for(int i=0;i<n;i++){
                arr[i]=sc.nextLong();
                max=max+(int)Math.ceil((double)arr[i]/x);
            }

            long min=0;
            long sum=Arrays.stream(arr).sum();
            min=(long)Math.ceil((double)sum/x);
            System.out.println(min+" "+max);
        }
    }
}