class Solution {
    public int[][] generateMatrix(int n) {
       int  count=1;
        int l=0;
        int r=n-1;
        int top=0;
        int bottom=n-1;
        int [][] ans = new int [n][n];
        while(l<=r && top<=bottom){
            for(int i=l;i<=r;i++){
                ans[top][i]=count;
                count++;
            }
            top++;

            for(int i=top;i<=bottom;i++){
                ans[i][r]=count;
                count++;
            }
            r--;
            for(int i=r;i>=l;i--){
                ans[bottom][i]=count;
                count++;
            }
            bottom--;
            for(int i=bottom;i>=top;i--){
            ans[i][l]=count;
                count++;
            }
            l++;
        }
        return ans;
        
        
    }
}