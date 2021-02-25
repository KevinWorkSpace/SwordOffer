package Offer56_I;

import java.util.ArrayList;
import java.util.List;

public class SingleNumbers {

    public int[] singleNumbers(int[] nums) {
        int sum = 0;
        for (int i=0; i<nums.length; i++) {
            sum ^= nums[i];
        }
        int bit = 1;
        while ((bit & sum) == 0) {
            bit = bit << 1;
        }
        int res1 = 0;
        int res2 = 0;
        for (int num : nums) {
            if ((num & bit) != 0) {
                res1 ^= num;
            }
            else res2 ^= num;
        }
        return new int[]{res1, res2};
    }
}
