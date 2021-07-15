import java.util.*;
public class Div2_367A {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();

        int n=sc.nextInt();
        int arr[][]=new int[n][3];        
        float ans=Float.MAX_VALUE;
        for(int i=0;i<n;i++){
            arr[i][0]=sc.nextInt();
            arr[i][1]=sc.nextInt();
            arr[i][2]=sc.nextInt();

            double distance=Math.sqrt((arr[i][0]-a)*(arr[i][0]-a)+(arr[i][1]-b)*(arr[i][1]-b));
            float time=(float)distance/arr[i][2];

            if(time<ans){
                ans=time;
            }
        }
        System.out.println(String.format("%.06f", ans));
    }
}
