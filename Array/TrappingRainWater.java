package Array;

public class TrappingRainWater {
    
}
class Solution {
    public int trap(int[] height) {
        int l = 0,r = height.length - 1;
        int maxL = height[l], maxR = height[r];

        int waterStored = 0;
        while(l < r){
            if(maxL < maxR){
                l += 1;
                maxL = Math.max(maxL,height[l]);
                waterStored += (maxL - height[l]);
            }else{
                r -= 1;
                maxR = Math.max(maxR,height[r]);
                waterStored += (maxR - height[r]);
            }
        }
        
        return waterStored;
    }
}
