class Solution {
    public int majorityElement(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i : nums){
            if(map.containsKey(i)){
                map.put(i,map.get(i)+1);
            }else{
            map.put(i,1);
            }
        }
        int n = nums.length/2;
        for(Map.Entry<Integer,Integer> i : map.entrySet()){
            if(i.getValue()>n){
                return i.getKey();
            }
        }
        return 0;
    }
}