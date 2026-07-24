class Solution {
    public int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> pq= new PriorityQueue<>(Collections.reverseOrder());
        for(int i : stones){
            pq.add(i);
        }
        while(pq.size()>1){
            int max=pq.remove();
            int smax=pq.remove();
            int smas=max-smax;
            if(smas!=0){
                pq.add(smas);
            }
        }
        if(pq.size()==1){
            return pq.remove();
        }
        else{
            return 0;
        }
        
    }
}