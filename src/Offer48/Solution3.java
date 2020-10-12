package Offer48;

import java.util.HashMap;
import java.util.HashSet;

public class Solution3 {

    public int lengthOfLongestSubstring(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        int left = 0;
        int max = 0;
        for (int i=0; i<s.length(); i++) {
            if (map.containsKey(s.charAt(i)) && map.get(s.charAt(i)) >= left) {
                left = map.get(s.charAt(i)) + 1;
                map.put(s.charAt(i), i);
            }
            else {
                map.put(s.charAt(i), i);
            }
            if (i - left + 1 > max) max = i - left + 1;
        }
        return max;
    }

    public static void main(String[] args) {
        String s = "abba";
        Solution3 solution = new Solution3();
        int res = solution.lengthOfLongestSubstring(s);
        System.out.println(res);
    }
}
