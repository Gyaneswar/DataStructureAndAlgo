//package Hashing;

import java.util.HashMap;
import java.util.Map;

public class FrequenceOfArrayElements {
    public static void main(String[] args) {
        int arr[] = {1,2,2,2,4,5,6,7,8,8};


        HashMap<Integer,Integer> map = new HashMap<>();

        for(int i=0;i<arr.length;i++){
            map.put(arr[i],map.getOrDefault(arr[i], 0)+1);
        }


        for(Map.Entry ele : map.entrySet()){
            System.out.println(ele.getKey()+":"+ele.getValue());
        }
    }
}
