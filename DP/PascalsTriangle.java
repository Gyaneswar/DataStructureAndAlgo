package DP;

import java.util.*;
class PascalsTriangle {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> result = new ArrayList<>();
        
        for(int i=0;i<numRows;i++){
            ArrayList<Integer> arr = new ArrayList<>();
            arr.add(1);
            for(int j=0;j<i;j++){
                int x1 = result.get(i-1).get(j);
                int x2 = 0;
                int size = result.get(i - 1).size();
                if(j+1 < size) 
                    x2 = result.get(i-1).get(j+1);
                arr.add(x1+x2);
            }
            result.add(arr);
        }
        return result;
    }
}
