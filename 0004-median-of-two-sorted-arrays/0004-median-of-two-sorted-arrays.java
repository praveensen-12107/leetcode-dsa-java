class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int ans []= new int [nums1.length+nums2.length];
        int p1=0;
        int p2=0;
        int p3=0;
        while(p1<nums1.length && p2<nums2.length){
            int val1=nums1[p1];
            int val2=nums2[p2];
            if(val1<val2){
                ans[p3]=val1;
                p1++;

            }
            else{
                ans[p3]=val2;
                p2++;
            }
            p3++;

        }
        while(p1<nums1.length){
            ans[p3]=nums1[p1];
            p1++;
            p3++;
        }
        while(p2<nums2.length){
            ans[p3]=nums2[p2];
            p2++;
            p3++;
        }
        int l=ans.length;
        if(l%2!=0){
            return ans[l/2];
        }
        else{
            return  (ans[l/2]+ans[l/2-1])/2.0;
        }
        
    }
}