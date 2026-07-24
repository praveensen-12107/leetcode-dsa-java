class Solution {
    public int longestConsecutive(int[] nums) {
        HashMap<Integer,Boolean> map = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            map.put(nums[i],false);
        }
        for(int key : map.keySet()){
            if(map.containsKey(key-1)==false){
                map.put(key,true);
            }
        }
        
        int max=0;
        for(int key : map.keySet()){
            if(map.get(key)){
            int k=1;
            while(map.containsKey(key+k)){
                k++;
            }
            max=Math.max(k,max);
            }
            }
        return max;
        
    }
}