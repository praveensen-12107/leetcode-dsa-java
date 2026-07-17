class Solution {
    public int maxArea(int[] height) {
        int max_area=0;
        int area;
        int right=height.length-1;
        int left=0;
        while(left<right){

            if(height[left]<height[right]){
                area=height[left]*(right-left);
                left++;
                
            }
            else{
                area=height[right]*(right-left);
                right--;

            }
            if(max_area<area){
                max_area=area;
            }
        }
        return max_area;
        
    }
}