package DP;
import java.util.*;
class PascalsTriangle {
    public List<Integer> getRow(int rowIndex) {
        List<Integer> arr = new ArrayList<>();
        arr.add(1);
        if(rowIndex == 0) return arr;
        for(int i = 0;i<rowIndex;i++){
            arr.add(0);
        }
        
        System.out.println(arr.toString());
        for(int i=1;i<=rowIndex;i++){            
            for(int j=i;j>0;j--){
                arr.set(j, arr.get(j)+arr.get(j-1));
            }
            System.out.println(arr.toString());
        }
        return arr;
    }
}
