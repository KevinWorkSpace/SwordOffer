package Offer45;

import java.util.Arrays;
import java.util.Comparator;

public class Solution {

    public String minNumber(int[] nums) {
        String[] nums_str = new String[nums.length];
        for (int i=0; i<nums.length; i++) {
            nums_str[i] = nums[i] + "";
        }
        Arrays.sort(nums_str, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                String s1 = o1 + o2;
                String s2 = o2 + o1;
                if (s1.length() > s2.length()) return 1;
                else if (s2.length() > s1.length()) return -1;
                else {
                    for (int i=0; i<s1.length(); i++) {
                        if (s1.charAt(i) > s2.charAt(i)) return 1;
                        else if (s1.charAt(i) < s2.charAt(i)) return -1;
                    }
                    return 0;
                }
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
        Solution solution = new Solution();
        String s = solution.minNumber(nums);
        System.out.println(s);
    }
}
