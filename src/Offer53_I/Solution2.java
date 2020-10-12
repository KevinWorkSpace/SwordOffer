package Offer53_I;

public class Solution2 {

    public int search(int[] nums, int target) {
        int l = searchLeft(nums, target);
        int r = searchRight(nums, target);
        if (l == -1) return 0;
        return r - l + 1;
    }

    public int searchLeft(int[] nums, int target) {
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
                if (mid-1 >= 0 && nums[mid-1] != target) {
                    return mid;
                }
                if (mid - 1 < 0) return mid;
                else {
                    right = mid - 1;
                }
            }
        }
        return -1;
    }

    public int searchRight(int[] nums, int target) {
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
                if (mid+1 < nums.length && nums[mid+1] != target) {
                    return mid;
                }
                if (mid + 1 == nums.length) {
                    return mid;
                }
                else {
                    left = mid + 1;
                }
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] nums = {1};
        Solution2 solution = new Solution2();
        System.out.println(solution.search(nums, 1));
    }
}
