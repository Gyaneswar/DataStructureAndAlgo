//package Hashing;

import java.util.HashSet;

public class SubarrayWithZeroSum {
    public static void main(String[] args) {
        int arr[] = {1,4,13,-3,-10,5};
        System.out.println(isPresent(arr));
    }


    public static boolean isPresent(int arr[]){
        HashSet<Integer> set = new HashSet<>();

        int sum = 0;
        for(int i=0;i<arr.length;i++){
            sum += arr[i];
            if(set.add(sum))
                return true;
        }
        return false;
    }
}
