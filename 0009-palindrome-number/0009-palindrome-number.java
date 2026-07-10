class Solution {
    public boolean isPalindrome(int x) {
        if(x<0){
            return false ;
        }
            int n =x;
            int rev_num=0;
            while(n>0){
                int digit=n%10;
                rev_num= rev_num*10+digit;
                n=n/10;

            }
            if(x==rev_num){
                return true;
            }
            else{
                return false;
            }





        
        
    }
}