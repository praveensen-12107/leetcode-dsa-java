
class Solution {
    public List<Integer> targetIndices(int[] nums, int target) {
        int count=0;
        int min_num=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==target){
                count++;
            }
            else if( nums[i]<target){
                min_num++;
            }
        } 
        List<Integer> ans = new ArrayList<>();
        for(int i=0;i<count;i++){
            ans.add(i,min_num);
            min_num++;
        }
        return ans;

        
    }
}