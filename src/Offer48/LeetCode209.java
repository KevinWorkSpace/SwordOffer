package Offer48;

class Solution {

    public int minSubArrayLen(int s, int[] nums) {
        int left = 0;
        int right = 0;
        int sum = 0;
        int cnt = Integer.MAX_VALUE;
        while (right < nums.length) {
            sum += nums[right++];
            while (sum >= s) {
                sum -= nums[left++];
                cnt = Math.min(cnt, right - left);
            }
        }
        return cnt == Integer.MAX_VALUE ? 0 : cnt;
    }
}
