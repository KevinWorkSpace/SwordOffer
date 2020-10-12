package Offer53_I;

class Solution {

    public int search(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;
        while (left <= right) {
            int mid = (left + right) / 2;
            if (nums[mid] > target) {
                right = mid - 1;
            }
            else if (nums[mid] < target) {
                left = mid + 1;
            }
            else {
                int cnt = 1;
                int l = mid - 1;
                while (l >= 0) {
                    if (nums[l] == nums[mid]) {
                        cnt ++;
                    }
                    else {
                        break;
                    }
                    l --;
                }
                int r = mid + 1;
                while (r <= nums.length-1) {
                    if (nums[r] == nums[mid]) {
                        cnt ++;
                    }
                    else {
                        break;
                    }
                    r ++;
                }
                return cnt;
            }
        }
        return 0;
    }

    public static void main(String[] args) {
        int[] nums = {1};
        Solution solution = new Solution();
        System.out.println(solution.search(nums, 1));
    }
}
