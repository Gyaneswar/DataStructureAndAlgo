//package Hashing;

import java.util.HashMap;

public class LongestSubarrayWithEqualZeroAndOnes {
    public static void main(String[] args) {
        int arr[] = {1,0,0,0,1,1,1,1,0,0,0,0};


        for(int i=0;i<arr.length;i++){
            if(arr[i] == 0)
                arr[i] = -1;                
        }


        int sum = 0;
        int longest = Integer.MIN_VALUE;
        int start = 0,end = 0;
        HashMap<Integer,Integer> map = new HashMap<>();
        map.put(0,0);
        for(int i=0;i<arr.length;i++){
            sum += arr[i];
            System.out.println("Sum : "+sum+" Index : "+i);
            if(map.containsKey(sum)){
                int prevIndex = map.get(sum);
                if(i+1 - prevIndex > longest){
                    start = prevIndex;
                    end = (i+1);
                    longest = (i - prevIndex)+1;                    
                }
            }else{
                map.put(sum,(i+1));
            }                        
        }
        System.out.println(longest);
        System.out.println("Start : "+start+" End : "+end);        
    }
}
