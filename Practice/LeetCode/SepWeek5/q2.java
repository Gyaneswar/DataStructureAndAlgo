package SepWeek5;

import java.util.*;

public class q2 {
    public static void main(String[] args) {
        int nums[] = {1,1,1,1,2,2,2,2};
        int k = 4;
        int sum = Arrays.stream(nums).sum();
        // System.out.println(sum);

        int each = sum / k;
        // System.out.println(each);
        visited = new boolean[nums.length + 1];
        System.out.println(each);
        int count = 0;
        for (int i = 0; i < k; i++) {
            recur(nums, 0, each);
            if (flag) {
                count++;
                flag = false;
            }
        }

        System.out.println(count);
    }

    static boolean visited[];
    static boolean flag = false;

    public static boolean recur(int nums[], int index, int sum) {
        if (flag)
            return true;
        if (sum == 0) {
            if (index == nums.length) {            
                System.out.println(nums[index - 1]);
            } else {            
                System.out.println(nums[index]);
            }
            flag = true;
            return true;
        }

        if (index >= nums.length)
            return false;
        if (sum < 0)
            return false;

        if (visited[index]) {
            return recur(nums, index + 1, sum);
        } else {
            visited[index] = true;
            boolean temp = recur(nums, index + 1, sum - nums[index]);
            if (!temp)
                visited[index] = false;
            if (flag)
                return true;
            recur(nums, index + 1, sum);
            if (flag)
                return true;
            else
                return false;
        }
    }
}