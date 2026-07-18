class Solution {
    public int maxAscendingSum(int[] nums) {
        int max_sum=0;
        int sum=nums[0];
        int n=nums.length;
        if(n==1){
            return nums[0];
        }
        for(int i=1;i<nums.length;i++){
            if(nums[i]>nums[i-1]){
                sum+=nums[i];
                
            }
            else{
                
                if(max_sum<sum){
                    max_sum=sum;
                }
                sum=nums[i];
            
            }
        max_sum = Math.max(max_sum, sum);
    }
    return max_sum;
}
}