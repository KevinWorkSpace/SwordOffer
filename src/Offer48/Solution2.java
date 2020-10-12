package Offer48;

import java.util.HashSet;

public class Solution2 {

    public int lengthOfLongestSubstring(String s) {
        int l = 0;
        int r = 0;
        HashSet<Character> set = new HashSet<>();
        int max = 0;
        for (int i=0; i<s.length(); i++) {
            if (i != 0) {
                set.remove(s.charAt(i-1));
            }
            while (r < s.length()) {
                if (set.contains(s.charAt(r))) {
                    break;
                }
                else {
                    set.add(s.charAt(r));
                    r++;
                }
            }
            if (set.size() > max) max = set.size();
        }
        return max;
    }

    public static void main(String[] args) {
        String s = "bbbbb";
        Solution2 solution = new Solution2();
        int res = solution.lengthOfLongestSubstring(s);
        System.out.println(res);
    }
}
