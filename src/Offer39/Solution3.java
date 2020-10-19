package Offer39;

public class Solution3 {

    public int majorityElement(int[] nums) {
        int x = 0;
        int cnt = 0;
        for (int num : nums) {
            if (cnt == 0) x = num;
            if (num == x) cnt += 1;
            else cnt -= 1;
        }
        return x;
    }
}
