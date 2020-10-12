package Offer3;

class Solution {
    public int findRepeatNumber(int[] nums) {
        boolean[] a = new boolean[nums.length];
        for (int i=0; i<nums.length; i++) {
            int j = nums[i];
            if (a[j] == false) a[j] = true;
            else return j;
        }
        return -1;
    }
}
