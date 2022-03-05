import java.util.*;
class Solution {
    public double champagneTower(int poured, int query_row, int query_glass) {
        if(poured == 0) return 0;
        
        List<Double> l = new ArrayList<>();
        
        l.add(Double.valueOf(poured));
        
        while(query_row-->0){
            List<Double> temp = new ArrayList<>();
            temp.add(Math.max(0,(l.get(0)-1)/2));
            
            for(int i=1;i<l.size();i++){
                temp.add((Math.max(0,(l.get(i-1)-1)/2))+(Math.max(0,(l.get(i)-1)/2)));
            }
            
            temp.add(temp.get(0));
            l = new ArrayList<>(temp);
        }
        
        return Math.min(1,l.get(query_glass));
    }
}