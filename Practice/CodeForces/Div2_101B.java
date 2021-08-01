import java.util.*;
public class Div2_101B {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();

        while(t-->0){
        int n=sc.nextInt();
        int red[]=new int[n];
        red[0]=sc.nextInt();
        for(int i=1;i<n;i++)    red[i]=red[i-1]+sc.nextInt();
        int m=sc.nextInt();
        int black[]=new int[m];
        black[0]=sc.nextInt();
        for(int i=1;i<m;i++)    black[i]=black[i-1]+sc.nextInt();

        int ans=0;
        int maxi=0;
        int maxj=0;
        for(int i=0;i<n;i++){
            if(red[i]>maxi){
                maxi=red[i];
            }
        }

        for(int i=0;i<m;i++){
            if(black[i]>maxj){
                maxj=black[i];
            }
        }

        System.out.println(maxi+maxj);

    }
}

    public static int max(int... x){
        int max=Integer.MIN_VALUE;
        for(int i : x){
            if(i > max){
                max=i;
            }
        }
        return max;
    }
}
