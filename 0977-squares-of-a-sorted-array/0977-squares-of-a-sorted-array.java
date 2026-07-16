class Solution {
    public int[] sortedSquares(int[] nums) {
        int size= nums.length;
        int [] ans = new int [size];
        int p=0 ;
        int i=0;
        while(i < nums.length && nums[i]<0 ){
            i++;


        }
        int j=i-1;
        while(j>=0 && i<nums.length){
            int a=nums[i]*nums[i];
            int b=nums[j]*nums[j];
            if(a<b){
                ans[p]=a;
                p++;
                i++;


            }
            else{
                ans[p]=b;
                p++;
                j--;
            }
        }
        while(j>=0){
            ans[p]=nums[j]*nums[j];
            j--;
            p++;
        }
        while(i<nums.length){
            ans[p]=nums[i]*nums[i];
            i++;
            p++;
        }
        return ans;
        
    }
}