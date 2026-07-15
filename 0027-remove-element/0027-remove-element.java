class Solution {
    public int removeElement(int[] nums, int val) {
        int r = nums.length - 1;

        for (int i = 0; i <= r; ) {
            if (nums[i] == val) {
                int temp = nums[i];
                nums[i] = nums[r];
                nums[r] = temp;
                r--;
            } else {
                i++;
            }
        }

        return r + 1;
    }
}