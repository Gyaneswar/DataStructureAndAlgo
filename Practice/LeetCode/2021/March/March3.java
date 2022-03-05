import java.util.*;
class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        int res=numberOfArithmeticSlices(arr);
        System.out.println(res);
    }
    public static int numberOfArithmeticSlices(int[] nums) {
        if(nums.length<3)
            return 0;
        int diff[] = new int[nums.length-1];
        int index=0;
        for(int i=1;i<nums.length;i++){
            diff[index] = Math.abs(nums[i]-nums[i-1]);
            index++;
        }
        
        int count=1;
        int res=0;
        boolean flag = false;
        System.out.println(Arrays.toString(diff));
        for(int i=1;i<diff.length;i++){
            if(diff[i]==diff[i-1]){
                count++;
                flag=true;                
            }else{
                flag=false;
                if(count==1) continue;
                int n = count+1;                
                int total = (n*(n+1))/2;                
                int k = (n - 2 + 1) + (n - 1 + 1);                
                res = res+ total - k;                
                count = 1;                
            }
        }            
        if(flag){
            int n = count+1;                
            int total = (n*(n+1))/2;            
            int k = (n - 2 + 1) + (n - 1 + 1);            
            res = res + total - k;
        }
        
        return res;
    }
}