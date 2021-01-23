package Offer57;

public class TwoSum {

    public int[] twoSum(int[] nums, int target) {
        for (int i=0; i<nums.length; i++) {
            int num = nums[i];
            if (num >= target) continue;
            int l = i + 1;
            int r = nums.length - 1;
            while (l <= r) {
                int mid = l + (r - l) / 2;
                if (nums[mid] == target - num) {
                    return new int[]{num, nums[mid]};
                }
                if (nums[mid] > target - num) {
                    r = mid - 1;
                }
                else {
                    l = mid + 1;
                }
            }
        }
        return new int[]{};
    }
}
