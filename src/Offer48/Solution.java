package Offer48;

import java.util.HashMap;

class Solution4 {

    public int lengthOfLongestSubstring(String s) {
        for (int size=s.length(); size>0; size--) {
            for (int i=0; i<s.length(); i++) {
                if (i + size > s.length()) break;
                HashMap<Character, Integer> map = new HashMap<>();
                boolean flag = true;
                for (int j=i; j<i+size; j++) {
                    char c = s.charAt(j);
                    if (map.containsKey(c)) {
                        flag = false;
                        break;
                    }
                    else {
                        map.put(c, j);
                    }
                }
                if (flag) return size;
            }
        }
        return 0;
    }

    public static void main(String[] args) {
        String s = "pwwkew";
        Solution4 solution = new Solution4();
        int res = solution.lengthOfLongestSubstring(s);
        System.out.println(res);
    }
}
