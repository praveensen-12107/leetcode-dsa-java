class Solution {
    public void sortColors(int[] nums) {
        int left=0;
        int right=nums.length-1;
        int i=0;
        int ans [] = new int [nums.length];
        while(i<=right){
            if(nums[i]==1){
                i++;
            }
            else if (nums[i]==0){
            int tem=nums[left];
            nums[left]=nums[i];
            nums[i]=tem;
            left++;
            i++;
            }
            else{
                int temp=nums[right];
                nums[right]=nums[i];
                nums[i]=temp;
                right--;
                
            }
            

        }
        
        
    }
}