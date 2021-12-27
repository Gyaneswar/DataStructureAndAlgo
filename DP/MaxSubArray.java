package DP;

public class MaxSubArray {
    public int maxSubArray(int[] nums) {
        //int dp[] = new int[nums.length];
        int max = nums[0];
        int current = 0;
        int prev = nums[0];
        
        for(int i=1;i<nums.length;i++){
            current = Math.max(nums[i],prev+nums[i]);
            if(current > max)
                max = current;
            prev = current;
        }
        
        return max;
    }
}
