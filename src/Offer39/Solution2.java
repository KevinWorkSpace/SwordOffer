package Offer39;

import java.util.HashMap;

public class Solution2 {

    public int majorityElement(int[] nums) {
        int i = 0;
        int j = 0;
        int cnt = 0;
        while (j != nums.length) {
            if (nums[j] == nums[i]) {
                cnt += 1;
            }
            else cnt -= 1;
            if (cnt == 0) {
                i = j + 1;
            }
            j ++;
        }
        return nums[i];
    }
}
