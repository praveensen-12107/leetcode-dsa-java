class Solution {
    public int dominantIndex(int[] nums) {
        int largest=0;
        int second_largest=0;
        int largest_index=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]>largest){
                second_largest=largest;
                largest=nums[i];
                largest_index=i;
        
            }
             else if (nums[i] > second_largest) {
               second_largest = nums[i];
         }}
        if(largest>=second_largest*2){
            return largest_index;
        }
        else{
            return -1;
        }
        
        
   
    }
}