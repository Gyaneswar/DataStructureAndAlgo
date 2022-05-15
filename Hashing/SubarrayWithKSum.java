//package Hashing;

import java.util.HashSet;

public class SubarrayWithKSum {
    public static void main(String[] args) {
        int arr[] = {5,8,6,13,4,-1};
        int k = 22;

        System.out.println(isPresent(arr,k));
    }

    public static boolean isPresent(int arr[],int k){
        HashSet<Integer> set = new HashSet<>();

        int sum = 0;
        for(int i=0;i<arr.length;i++){
            sum += arr[i];
            set.add(sum);
            System.out.println(sum);
            if(set.contains(sum - k))
                return true;
        }
        return false;
    }
}
