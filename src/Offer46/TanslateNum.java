package Offer46;

import java.util.ArrayList;

public class TanslateNum {

    public int translateNum(int num) {
        if (num == 0) return 1;
        ArrayList<Integer> list = new ArrayList<>();
        while (num != 0) {
            list.add(num % 10);
            num /= 10;
        }
        int[] nums = new int[list.size()];
        for (int i=0; i<nums.length; i++) {
            nums[i] = list.get(nums.length - i - 1);
        }
        int[] dp = new int[nums.length + 1];
        dp[0] = 1;
        dp[1] = 1;
        for (int i=2; i<dp.length; i++) {
            if (nums[i-2] * 10 + nums[i-1] >= 10 && nums[i-2] * 10 + nums[i-1] <= 25) {
                dp[i] = dp[i-1] + dp[i-2];
            }
            else {
                dp[i] = dp[i-1];
            }
        }
        return dp[nums.length];
    }
}
