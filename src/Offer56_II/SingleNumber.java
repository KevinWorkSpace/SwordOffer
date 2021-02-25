package Offer56_II;

public class SingleNumber {

    public int singleNumber(int[] nums) {
        int[] bits = new int[32];
        for (int i=0; i<nums.length; i++) {
            int num = nums[i];
            int tmp = 1;
            for (int j=0; j<32; j++) {
                if ((num & tmp) > 0) {
                    bits[j] += 1;
                }
                tmp = tmp << 1;
            }
        }
        int res = 0;
        for (int i=0; i<bits.length; i++) {
            res = res << 1;
            res |= bits[31-i] % 3;
        }
        return res;
    }

    public static void main(String[] args) {
        int[] nums = {3,4,3,3};
        SingleNumber singleNumber = new SingleNumber();
        singleNumber.singleNumber(nums);
    }
}
