class Solution {
    public boolean isHappy(int n) {
        int sum=0;
        HashMap<Integer,Integer> map = new HashMap<>();
        while(n!=1){
            if(map.containsKey(n)){
                return false;
            }
            map.put(n,n);
            while(n>0){
            
            int d = n%10;
             sum += d*d;
             n/=10;
            }
            n=sum;
            sum=0;
        }
        return true;
        
    }
}