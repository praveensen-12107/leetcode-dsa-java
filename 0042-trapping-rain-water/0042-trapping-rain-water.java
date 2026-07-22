class Solution {
    public int trap(int[] height) {
        int left [] = new int [height.length];
        int right [] =new int [height.length];
        int maxl=height[0];
        int maxr=height[height.length-1];
        for(int i=0;i<height.length;i++){
           maxl = Math.max(maxl, height[i]);
           left[i] = maxl;
        }
        for(int i=height.length-1;i>=0;i--){
            maxr=Math.max(maxr,height[i]);
            right[i]=maxr;
        
        }
        int trap_water=0;
        for(int i=0;i<height.length;i++){
            int minh= Math.min(left[i],right[i]);
            trap_water+=minh-height[i];
        }
        return trap_water;


        
    }
}