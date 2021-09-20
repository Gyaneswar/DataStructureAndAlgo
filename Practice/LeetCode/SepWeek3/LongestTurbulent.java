//package SepWeek3;

public class LongestTurbulent {
    public static void main(String[] args) {
        int arr[]={8,8,9,10,6,8,2,4,2,2,10,6,6,10,10,2,3,5,1,2
            ,10,4,2,0,9,4,9,3,0,6,3,2,3,10,10,6,4,6,4,4,2,5,1,4
            ,1,1,9,8,9,5,3,5,5,4,5,5,6,5,3,3,7,2,0
            ,10,9,7,7,3,5,1,0,9,6,3,1,3,4,4,3,6,3
            ,2,1,4,10,2,3,4,4,3,6,7,6,2,1,7,0,6,8,10};
        int dp[]=new int[arr.length];
        int dp1[]=new int[arr.length];

        int temp=maxTurbulenceSize(arr, dp, dp1);
        System.out.println(temp);
    }

    public static int maxTurbulenceSize(int[] arr,int dp[],int dp1[]) {

        for(int i=0;i<arr.length;i++){
            recursiveMax(arr, i,dp);
        }

        zero=1;
        one=0;
        for(int i=0;i<arr.length;i++){            
            recursiveMax(arr, i,dp1);
        }

        int max=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            if(dp[i]>max) max=dp[i];
            if(dp1[i]>max) max=dp1[i];
        }
        return max+1;
    }
    
    static int k=0;
    static int zero=0;
    static int one=1;
    public static int recursiveMax(int arr[], int index,int dp[]) {
        if(index>=arr.length - 1) return 0;
        if(index%2==zero && arr[index]<arr[index+1]){
            int temp=0;
            if(dp[index]>0) return dp[index];
            else temp=1 + recursiveMax(arr, (++index),dp);
            if(temp>dp[index]) dp[index]=temp;
        }
        else if(index%2==one && arr[index]>arr[index+1]){
            int temp=0;
            if(dp[index]>0) return dp[index];
            else temp=1 + recursiveMax(arr, (++index),dp);
            if(temp>dp[index]) dp[index]=temp;
        }else{
            return dp[index];
        }
        return dp[index];
    }

    public static int maxSize(int arr[],int index){
        int count=0;
        boolean alternate=true;

        if(index%2==1) alternate=true;
        else alternate=false;

        for(int i=index;i<arr.length-1;i++){
            if(alternate && arr[i]>arr[i+1]){                
                count++;
                alternate=false;
            }else if(!alternate && arr[i]<arr[i+1]){                
                count++;
                alternate=true;
            }else break;
        }
        return count==0 ? count : count+1;
    }
}
