class Solution {
    public int maxSubArray(int[] nums) {
        int cur_sum=nums[0];
        int max_sum=nums[0];
        for(int i=1;i<nums.length;i++){
            if(cur_sum + nums[i] > nums[i]){
                cur_sum+=nums[i];
            }
            else{
                cur_sum=nums[i];
            }
            max_sum=Math.max(cur_sum,max_sum);
            

        }
        return max_sum;
        
    }
}