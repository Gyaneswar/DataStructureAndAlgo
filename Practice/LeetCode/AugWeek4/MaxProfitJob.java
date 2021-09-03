//package AugWeek4;

import java.util.*;

public class MaxProfitJob {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int jobs = sc.nextInt();
        int starttime[] = new int[jobs];
        int endtime[] = new int[jobs];
        int profit[] = new int[jobs];

        for (int i = 0; i < jobs; i++)
            starttime[i] = sc.nextInt();
        for (int i = 0; i < jobs; i++)
            endtime[i] = sc.nextInt();
        for (int i = 0; i < jobs; i++)
            profit[i] = sc.nextInt();        

        int temp[][]=new int[jobs][3];
        for(int i=0;i<jobs;i++) temp[i][0]=starttime[i];

        for(int i=0;i<jobs;i++) temp[i][1]=endtime[i];

        for(int i=0;i<jobs;i++) temp[i][2]=profit[i];

        Arrays.sort(temp,(a,b) -> Integer.compare(a[0], b[0]));


        for(int i=0;i<jobs;i++){
            starttime[i]=temp[i][0];
            endtime[i]=temp[i][1];
            profit[i]=temp[i][2];
        }

        // System.out.println(Arrays.toString(starttime));
        // System.out.println(Arrays.toString(endtime));
        // System.out.println(Arrays.toString(profit));

        int maxProfit=MaxProfit(starttime, endtime, profit, 0, 0);
        System.out.println(maxProfit);

        Arrays.sort(temp,(a,b) -> Integer.compare(a[1], b[1]));
        for(int i=0;i<jobs;i++){
            starttime[i]=temp[i][0];
            endtime[i]=temp[i][1];
            profit[i]=temp[i][2];
        }

        
         System.out.println(Arrays.toString(starttime));
         System.out.println(Arrays.toString(endtime));
         System.out.println(Arrays.toString(profit));

         System.out.println(MaxProfitDP(starttime,endtime,profit));

    }


    public static int MaxProfit(int starttime[], int endtime[], int profit[], int index, int currEnd) {
        if (index == starttime.length)
            return 0;

        int left = 0;
        int right = 0;
        if (starttime[index] < currEnd) {
            left=0;
            right = MaxProfit(starttime, endtime, profit, index + 1, currEnd);
        } else {
            left = profit[index] + MaxProfit(starttime, endtime, profit, index + 1, endtime[index]);
            right = MaxProfit(starttime, endtime, profit, index + 1, currEnd);
        }

        return Math.max(left,right);
    }

    public static int MaxProfitDP(int starttime[],int endtime[],int profit[]){
        int dp[]=new int[starttime.length];
        for(int i=0;i<starttime.length;i++) dp[i]=profit[i];

        for(int i=1;i<starttime.length;i++){
            for(int j=0;j<i;j++){
                if(endtime[j]<=starttime[i]){
                    dp[i]=Math.max(dp[i],dp[j]+profit[i]);
                }else break;
            }
        }

        return Arrays.stream(dp).max().getAsInt();
    }

}
