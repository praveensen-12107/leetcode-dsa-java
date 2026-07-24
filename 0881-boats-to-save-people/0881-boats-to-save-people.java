class Solution {
    public int numRescueBoats(int[] people, int limit) {
        Arrays.sort(people);
        int l=0;
        int r = people.length-1;
        int count_boat=0;
        while(l<=r){
            int sum = people[l]+people[r];
            if(sum>limit){
                count_boat++;
                r--;
            }else {
                count_boat++;
                l++;
                r--;

            }
            

        }
        return count_boat;
        
    }
}