class Solution {
    public double average(int[] salary) {
        double max=Integer.MIN_VALUE;
        double min=Integer.MAX_VALUE;
        int sum=0;
        for(int i=0;i<salary.length;i++){
            if(salary[i]>max){
                max=salary[i];
            }
            if(salary[i]<min){
                min=salary[i];
            }
            sum+=salary[i];
        }
        double avg= (sum-(min+max))/(salary.length-2);
        return avg;
        
    }
}