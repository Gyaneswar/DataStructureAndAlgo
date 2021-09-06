//package SepWeek1;
import java.util.*;
public class ArrayNesting {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int nums[]=new int[n];
        for(int i=0;i<n;i++) nums[i]=sc.nextInt();


        memo=new int[nums.length];
        set=new HashSet<>();
        for(int i=0;i<nums.length;i++){
            set.clear();
            arrayNesting(nums, i);
        }

        int max=Arrays.stream(memo).max().getAsInt();
        System.out.println(max);
    }
    static HashSet<Integer> set;
    static int memo[];
    public static int arrayNesting(int[] nums,int k){
        if(memo[k]!=0)
            return memo[k];

        if(set.contains(nums[k]))
            return 0;

        set.add(nums[k]);
        memo[k] = 1 + arrayNesting(nums, nums[k]);
        return memo[k];
    } 
}
