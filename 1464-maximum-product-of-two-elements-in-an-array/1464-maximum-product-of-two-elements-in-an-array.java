class Solution {
    public int maxProduct(int[] nums) {
        int product=0;
        int a;
        int b;
        for(int i=0;i<nums.length;i++){
        for(int j=i+1;j<nums.length;j++){
         a = nums[i]-1;
         b = nums[j]-1;
        if((a*b)>=product){
            product=a*b;
        }

        }
        }
        
    
    return product;}
}