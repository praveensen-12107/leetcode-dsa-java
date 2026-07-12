class Solution {
    public List<Integer> addToArrayForm(int[] num, int k) {
        List<Integer> ans = new ArrayList<>();
        int p = num.length - 1;
        int carry = 0;

        while (p >= 0 || carry > 0 || k > 0) {

            int last_digit_arr;

            if (p >= 0) {
                last_digit_arr = num[p];
            } else {
                last_digit_arr = 0;
            }

            int last_digit_k = k % 10;
            int sum = last_digit_arr + last_digit_k + carry;

            ans.add(0, sum % 10);
            carry = sum / 10;

            p--;
            k /= 10;
        }

        return ans;
    }
}