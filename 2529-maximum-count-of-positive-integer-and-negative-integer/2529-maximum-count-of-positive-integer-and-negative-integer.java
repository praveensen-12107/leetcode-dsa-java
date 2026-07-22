class Solution {
    public int maximumCount(int[] nums) {
        int neg=firstN(nums)+1;
        int pov=nums.length - firstP(nums);
        return Math.max(neg,pov);
        
            
        }
        
        
    
    public int firstN(int[] nums) {
        int left=0;
        int right=nums.length-1;
        int n=-1;
        while(left<=right){
            int mid = left + (right-left)/2;
            if(nums[mid]<0){
                n=mid;
                left=mid+1;
            }
            else{
                right=mid-1;
            }
            
        }
        return n;
        
        
    }public int firstP(int[] nums) {
        int left=0;
        int right=nums.length-1;
        int p=nums.length;
        
        
        while(left<=right){
            int mid = left + (right-left)/2;
            if(nums[mid]>0){
                p=mid;
                right=mid-1;
            }
            else{
                left=mid+1;
            }
            
        }
            return p;
    }
        
        
    }
        
