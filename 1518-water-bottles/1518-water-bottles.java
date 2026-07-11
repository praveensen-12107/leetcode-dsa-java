class Solution {
    public int numWaterBottles(int numBottles, int numExchange) {
      
        int ans=numBottles;
        
        while(numBottles>=numExchange){

            int newnumBottles=numBottles/numExchange;
            int remBottles=numBottles%numExchange;
            ans+=newnumBottles;
            numBottles=newnumBottles+remBottles;
            

        }
        return ans;
       
        
    }
    
}