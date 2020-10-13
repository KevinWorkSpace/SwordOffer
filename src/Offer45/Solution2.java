package Offer45;

import java.util.Arrays;
import java.util.Comparator;

public class Solution2 {

    public String minNumber(int[] nums) {
        String[] nums_str = new String[nums.length];
        for (int i=0; i<nums.length; i++) {
            nums_str[i] = nums[i] + "";
        }
        Arrays.sort(nums_str, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return (o1+o2).compareTo(o2+o1);
            }
        });
        StringBuffer stringBuffer = new StringBuffer();
        for (int i=0; i<nums_str.length; i++) {
            stringBuffer.append(nums_str[i]);
        }
        return stringBuffer.toString();
    }

    public static void main(String[] args) {
        int[] nums = {10, 2};
        Solution2 solution = new Solution2();
        String s = solution.minNumber(nums);
        System.out.println(s);
    }
}
